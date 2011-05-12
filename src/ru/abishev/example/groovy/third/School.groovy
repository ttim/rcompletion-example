package ru.abishev.example.groovy.third

import ru.abishev.example.groovy.GoodCompletion

@Mixin(GoodCompletion)
class School {
    String toString() {
        "School!"
    }

    def test() {
        this.encodeAsHTML()
    }

    static {
        Initializer.checkInit();
    }
}
