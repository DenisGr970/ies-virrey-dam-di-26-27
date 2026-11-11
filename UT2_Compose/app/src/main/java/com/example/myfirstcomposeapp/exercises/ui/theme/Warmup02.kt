package com.example.myfirstcomposeapp.exercises.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposeapp.exercises.ui.theme.ui.theme.MyFirstComposeAppTheme



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun PriceTag(price: String, modifier: Modifier= Modifier) {

Text(
text = price,
    modifier = Modifier
        .clip(RoundedCornerShape(6.dp))
        .background(Color(0xFFEF6C00))
        .padding(horizontal = 12.dp, vertical = 6.dp),

    color = Color.White,
    fontSize = 18.sp,
    fontWeight = FontWeight.Bold


)

}


@Composable
fun PriceTagPreview1() {

    PriceTag(price = "9.99€")


}

@Composable
fun PriceTagPreview2() {

PriceTag(price= "120€")

}

@Composable
fun PriceTagPreview3() {

    PriceTag(price = "0.50€")


}
@Composable
fun PriceRowPreview() {
    Row(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp) // Espacio opcional entre cada cajita
    ) {
        PriceTag(price = "9.99 €")
        PriceTag(price = "120 €")
        PriceTag(price = "0.50 €")
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {

PriceRowPreview()


    }
}