package ru.abishev.example.groovy.first

import ru.abishev.example.groovy.VeryGoodCompletion

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
@Mixin(VeryGoodCompletion)
class TestGroovyClass {
    static {
        TestGroovyClass.metaClass.myTestMethod = {->
            "MyTest!!!???"
        }
    }

    def test() {
        this.myTestMethod()
    }

    def testCompletionList() {
        this.getCompletionList()
    }
}


