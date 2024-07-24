package com.example.figmacodeconnect.ui

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import com.figma.code.connect.FigmaConnect

@Composable
fun MyButton(
    text: String
) {
    Button(onClick = { /*TODO*/ }) {
        
    }
}

@FigmaConnect(url = "https://www.figma.com/design/4bMt5JcjzY8zWs00FARsMw/Material-3-Design-Kit-(Community)?node-id=53923-27460&m=dev")
class ButtonDoc {
    @Composable
    fun ButtonSnippet() {
        MyButton(text = "Hello World")
    }
}