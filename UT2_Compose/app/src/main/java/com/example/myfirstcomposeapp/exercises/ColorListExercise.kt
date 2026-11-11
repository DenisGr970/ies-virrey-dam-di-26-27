package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize


@Preview
@Composable
fun MyFirstComposableFun(){
    titleBox()

}






@Composable
fun titleBox() {

    Row(modifier = Modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f))

    }

    Text(
"List of Colors",
        color = Color.White,
        fontSize =  16.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,

    )





}


