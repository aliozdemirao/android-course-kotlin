package com.aliozdemir.kotlinoopproject

open class Musician(name: String, instrument: String, age: Int) {
    /*
    var name : String? = null
    var instrument : String? = null
    var age : Int? = null

    constructor(name: String, instrument: String, age: Int){
        this.name = name
        this.instrument = instrument
        this.age = age
    }
    */



    // Encapsulation

    var name : String? = name
        private set
        get



    private var instrument : String? = instrument




    var age : Int? = age
        private set
        get



    private val bandName : String = "Metallica"

    fun returnBandName(password: String) : String {
        if(password == "Atil"){
            return bandName
        } else {
            return "Wrong password!"
        }
    }


}