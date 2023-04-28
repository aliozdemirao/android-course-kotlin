package com.aliozdemir.statemanagementcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    //State Hoisting
    var myString by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            SpecialText("Test")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialText("Android")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialTextField(myString){
                myString = it
            }
        }
    }

}

@Composable
fun SpecialText(string : String){

    Text(text = string,
        fontSize = 26.sp,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.SansSerif
    )

}

@Composable
fun SpecialTextField(string : String, function: (String) -> Unit){
    TextField(value = string, onValueChange = function, modifier = Modifier.padding(5.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}