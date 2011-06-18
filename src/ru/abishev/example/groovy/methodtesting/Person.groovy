package ru.abishev.example.groovy.methodtesting

import ru.abishev.example.groovy.third.HTMLCodec
import ru.abishev.example.groovy.VeryGoodCompletion

@Mixin(VeryGoodCompletion)
@Mixin(MyMixin)
class Person {
    String role = "admin"

    static {
        for (newRole in ["admin", "user", "moderator"]) {
            Person.metaClass."changeRoleTo${newRole.capitalize()}" = {-> delegate.role = newRole }
        }

        Person.metaClass.myTestMethod = {->
            "MyTest!!!???"
        }

        def codecs = [new HTMLCodec()]

        codecs.each { codec ->
            Object.metaClass."encodeAs${codec.class.simpleName - 'Codec'}" = { codec.encode(delegate) }
            Object.metaClass."decodeFrom${codec.class.simpleName - 'Codec'}" = { codec.decode(delegate) }
        }
    }
}
