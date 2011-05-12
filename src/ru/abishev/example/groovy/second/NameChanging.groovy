package ru.abishev.example.groovy.second

import ru.abishev.example.groovy.GoodCompletion

@Mixin(GoodCompletion)
class Person {
    String name = "Fred"

    def test() {
        this.changeNameToAlice()
    }

    static {
        for (newName in ["Bob", "Alice", "Sergey"]) {
            Person.metaClass."changeNameTo${newName}" = {-> delegate.name = newName }
        }
    }
}

