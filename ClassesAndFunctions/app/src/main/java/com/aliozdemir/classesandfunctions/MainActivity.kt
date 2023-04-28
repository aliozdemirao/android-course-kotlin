package com.aliozdemir.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aliozdemir.classesandfunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var name = ""

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        test()

        // Void - Unit
        mySum(10, 20)

        // Return
        val result = myMultiply(10, 20)
        binding.textView.text = "Result: ${result}"



        /*
        button.setOnClickListener(){
            println("clicked")
        }
        */



        // Class
        // Object & Instance
        val homer = Simpson(50, "Engineer", "Homer Simpson")
        //homer.hairColor = "Yellow"
        homer.changeHairColor()

        homer.age = 30
        homer.job = "Nuclear"
        homer.name = "Homer Simpson"

        println(homer.age)


        // Nullability
        // Nullable (?) & Non-null
        // !! vs ?

        var myString : String? = null
        var myAge : Int? = null

        // 1- Null Safety
        if (myAge != null){
            println(myAge * 10)
        } else {
            println("myAge null")
        }

        // 2- safe call
        println(myAge?.compareTo(2))

        // 3- elvis
        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)

    }



    fun test(){
        println("test function")
    }

    // Input & Return
    fun mySum(a: Int, b: Int){
        binding.textView.text = "Result: ${a+b}"
    }

    fun myMultiply(x: Int, y: Int) : Int {
        return x * y
    }

    fun helloKotlin(view : View){
        println("hello kotlin")
    }



    fun makeSimpson(view : View) {

        var age = binding.ageText.text.toString().toIntOrNull()
        if (age == null) {
            age = 0
        }

        name = binding.nameText.text.toString()
        val job = binding.jobText.text.toString()

        val simpson = Simpson(age, name, job)

        binding.resultText.text = "Name : ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"

    }

    fun scopeExample(view : View) {
        //Scope
        println(name)

    }


}