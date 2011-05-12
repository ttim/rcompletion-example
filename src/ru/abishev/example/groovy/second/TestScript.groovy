package ru.abishev.example.groovy.second

def person = new Person();

person.metaClass.newMethod = {->
    "newMethod?!?!?!"
}

//type person.<completion here>
person.changeRoleToModerator()

person.changeRoleTo
println person.role
