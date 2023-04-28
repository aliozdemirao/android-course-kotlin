package com.aliozdemir.kotlinoopproject

class User : People{

    // property
    var name : String? = null
    var age : Int? = null

    // Constructor vs Init

    constructor(nameInput: String, ageInput: Int){
        this.name = nameInput
        this.age = ageInput
        println("user created")
    }

    init {
        println("init")
    }

}