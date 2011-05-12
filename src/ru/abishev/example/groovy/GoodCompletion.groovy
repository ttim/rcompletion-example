package ru.abishev.example.groovy

import org.codehaus.groovy.runtime.metaclass.ClosureMetaMethod

class GoodCompletion {
    def getCompletionList() {
        def result = []

        for (method in this.getMetaClass().getMethods()) {
            if (method instanceof ClosureMetaMethod) {
                result.add(method.getName());
            }
        }

        return result;
    }

}
