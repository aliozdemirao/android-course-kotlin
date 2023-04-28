package com.aliozdemir.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin")
        // camelCase
        // snake_case

        // Variables & Constants

        // Integer
        println("------ Integer  -----")

        var x = 5
        var y = 4
        println(x * y)

        var age = 35
        val result = age / 7 * 5
        println(result)


        // Defining
        val myInteger : Int

        // Initialize
        myInteger = 10

        val a : Int = 23
        println(a/2)

        // Long
        var myLong : Long = 100

        // Double & Float
        println("------ Double & Float  -----")
        val pi = 3.14
        println(pi * 2)

        val myFloat = 3.14f
        println(myFloat * 2)

        var myAge : Double
        myAge = 23.0
        println(myAge / 2)


        // String
        println("------ String  -----")
        val myString = "atil samancioglu"

        val name = "James"
        val surname = "Hetfield"
        val fullname = name + " " + surname
        println(fullname)

        val larsName : String = "Lars"


        // Boolean
        println("------ Boolean  -----")
        var myBoolean : Boolean = true
        myBoolean = false

        println(3 < 5)
        println(6 < 5)
        println(5 == 5)
        println(6 != 5)

        // Conversion
        println("------ Conversion  -----")

        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)

        // Collections
        println("------ Collections  -----")

        // Arrays
        println("------ Arrays  -----")

        val myArray = arrayOf("James", "Kirk", "Rob", "Lars")

        //index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("atil",5)
        println(mixedArray[0])
        println(mixedArray[1])


        // List - ArrayList
        println("------ List  -----")

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Lars")
        println(myMusician[2])

        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("atil")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])


        // Set
        println("------ Set  -----")

        val myExampleArray = arrayOf(1,1,2,3,4)
        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)

        // For Each
        mySet.forEach { println(it * 100) }

        val myStringSet = HashSet<String>()
        myStringSet.add("atil")
        myStringSet.add("atil")
        println(myStringSet.size)


        // Map - HashMap  Key-Value
        println("------ Map  -----")

        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100, 150)
        println("${fruitArray[0]} : ${caloriesArray[0]}")
        println("${fruitArray[1]} : ${caloriesArray[1]}")

        val fruitCalorieMap = hashMapOf<String, Int>()
        fruitCalorieMap.put("strawberry", 200)
        fruitCalorieMap.put("watermelon", 250)
        println(fruitCalorieMap["strawberry"])

        val myHashMap = HashMap<String, String>()

        val myNewMap = hashMapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)
        println(myNewMap["C"])


        // Operator
        println("------ Operator  -----")

        var m = 5
        println(m)

        m = m + 1
        println(m)

        m++
        println(m)

        m--
        println(m)

        var n = 7
        println(n > m)

        // &&  ,  ||
        println(n > m && 2 > 1)
        println(n > m && 1 > 2)
        println(n > m || 1 > 2)

        println(10+2)
        println(10-2)
        println(10*2)
        println(10/2)

        //Remainder
        println(10%2)
        println(10%3)
        println(10%4)


        // If Control
        println("------ If Control  -----")

        val myNumberAge = 52

        if (myNumberAge < 30) {
            println("< 30")
        } else if (myNumberAge >= 30 && myNumberAge < 40) {
            println("30 - 40")
        } else if (myNumberAge >= 40 && myNumberAge < 50) {
            println("40 - 50")
        } else {
            println(">= 50")
        }


        // Switch - When
        println("------ Switch - When  -----")

        val day = 3
        var dayString = ""

        when(day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            4 -> dayString = "Thursday"
            5 -> dayString = "Friday"
            6 -> dayString = "Saturday"
            7 -> dayString = "Sunday"
            else -> dayString = ""
        }
        println(dayString)


        // Loops

        // For Loop
        println("------ For Loop -----")

        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayofNumbers[0] / 3 * 5
        println(q)

        for (num in myArrayofNumbers) {
            val z = num / 3 * 5
            println(z)
        }

        for (i in myArrayofNumbers.indices) {
            val x = myArrayofNumbers[i] / 3 * 5
            println(x)
        }

        for (y in 0..9) {
            println(y)
        }


        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Atil")
        myStringArrayList.add("Samancioglu")
        myStringArrayList.add("Bar")

        for (str in myStringArrayList) {
            println(str)
        }

        myStringArrayList.forEach { println(it) }


        // While Loop
        println("------ While Loop -----")

        var j = 0

        while (j < 10) {
            println(j)
            j = j + 1
        }


    }
}