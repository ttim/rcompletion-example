package ru.abishev.example.groovy

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
@Mixin(GoodCompletion)
class TestGroovyClass {
    static {
        TestGroovyClass.metaClass.myTestMethod = {->
            "MyTest!!!???"
        }
    }

    def test() {
        this.myTestMethod()
    }
}

