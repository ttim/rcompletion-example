package ru.abishev.example.groovy.third

class Initializer {
    static {
        def codecs = [new HTMLCodec()]

        codecs.each { codec ->
            Object.metaClass."encodeAs${codec.class.simpleName - 'Codec'}" = {-> codec.encode(delegate) }
            Object.metaClass."decodeFrom${codec.class.simpleName - 'Codec'}" = { codec.decode(delegate) }
        }
    }

    static def checkInit() {}
}
