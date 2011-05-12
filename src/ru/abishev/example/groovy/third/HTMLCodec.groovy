package ru.abishev.example.groovy.third

class HTMLCodec {
    def encode = { theTarget ->
//        HtmlUtils.htmlEscape(theTarget.toString())
        "html-encoded " + theTarget.toString()
    }

    def decode = { theTarget ->
//        HtmlUtils.htmlUnescape(theTarget.toString())
        "html decoded " + theTarget.toString()
    }
}