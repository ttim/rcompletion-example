package ru.abishev.example.groovy.first;

import groovy.lang.MetaMethod;
import org.codehaus.groovy.runtime.metaclass.ClosureMetaMethod;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public class TestClass {
    public static void main(String[] args) {
        ru.abishev.example.groovy.TestGroovyClass testGroovyClass = new ru.abishev.example.groovy.TestGroovyClass();

        System.out.println(testGroovyClass.test());

//        testGroovyClass.get


        for (MetaMethod method : testGroovyClass.getMetaClass().getMethods()) {
            if (method instanceof ClosureMetaMethod) {
                System.out.println(method.getName());
            }
        }
    }
}
