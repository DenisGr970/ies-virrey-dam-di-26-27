package com.example.myfirstcomposeapp.exercises

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposeapp.exercises.ui.theme.MyFirstComposeAppTheme



@Composable
fun Welcome( modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to Compose",
        modifier = modifier.padding(16.dp),
      fontSize = 28.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Welcome()
    }
}