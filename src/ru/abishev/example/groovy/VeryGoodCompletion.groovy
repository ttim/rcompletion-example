package ru.abishev.example.groovy

class VeryGoodCompletion {
    def getCompletionList() {
        def ignore = ["findLastIndexOf", "dump", "eachWithIndex", "sprintf", "use", "getMetaPropertyValues",
                "every", "asBoolean", "metaClass", "identity", "findIndexValues", "grep", "println", "any", "isCase",
                "find", "printf", "putAt", "hasProperty", "is", "with", "iterator", "findIndexOf", "findAll",
                "inject", "getProperties", "sleep", "print", "findResult", "respondsTo", "getAt", "asType",
                "split", "each", "inspect", "addShutdownHook", "collect"]

        def result = [] as Set

//        this.getMetaClass().getMetaMethods().collect { e -> e.name }.each { e -> println "!" + e}

        result.addAll(this.getMetaClass().getMetaMethods().collect { e -> e.name.toString()})
        result.removeAll(this.getClass().getMethods().collect {e -> e.name.toString()})
        result.removeAll(ignore)

        result.findAll { e -> e.indexOf("\$") == -1 && e.indexOf("__") == -1; }.toList()
    }
}
