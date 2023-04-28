package com.aliozdemir.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aliozdemir.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null


    lateinit var myString : String

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        myString = ""

    }

    fun mySum(view: View){
        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error!"
        } else {
            result = number1!! + number2!!
            binding.resultText.text = "Result: $result"
        }

    }
    fun mySub(view: View){
        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error!"
        } else {
            result = number1!! - number2!!
            binding.resultText.text = "Result: $result"
        }
    }
    fun myMultiply(view: View){
        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error!"
        } else {
            result = number1!! * number2!!
            binding.resultText.text = "Result: $result"
        }
    }
    fun myDiv(view: View){
        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error!"
        } else {
            result = number1!! / number2!!
            binding.resultText.text = "Result: $result"
        }
    }
}