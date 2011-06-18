package ru.abishev.example.groovy.third

import ru.abishev.example.groovy.VeryGoodCompletion

@Mixin(VeryGoodCompletion)
class School {
    String toString() {
        "School!"
    }

    def test() {
//        this.encodeAsHTML()
    }

    static {
        Initializer.checkInit();
    }
}
