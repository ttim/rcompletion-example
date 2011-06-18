package ru.abishev.example.groovy.methodtesting

/**
 * @author Timur Abishev (timur@abishev.ru)
 */

sum = 0
for (int i = 0; i < 10000; i++) {
    for (int j = 0; j < 1000; j++) {
        sum += i+j;
    }
}

println "metaClass.getMethods()"

methods = Person.metaClass.getMethods()
for (int i = 0; i < methods.size(); i++) {
    println i + " -> " + methods[i].name
}

println "-----------"
println "metaClass.getMetaMethods()"

for (method in Person.metaClass.getMetaMethods()) {
    println method.name
}

println "-----------"

for (name in Person.metaClass.methods*.name) {
    println name
}

println Person.metaClass.class

println new Person().encodeAsHTML()
new Person().mixinMethod()