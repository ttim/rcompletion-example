package ru.abishev.example.groovy.second

import ru.abishev.example.groovy.VeryGoodCompletion

@Mixin(VeryGoodCompletion)
class Person {
    String role = "admin"

    static {
        for (newRole in ["admin", "user", "moderator"]) {
            Person.metaClass."changeRoleTo${newRole.capitalize()}" = {-> delegate.role = newRole }
        }
    }
}
