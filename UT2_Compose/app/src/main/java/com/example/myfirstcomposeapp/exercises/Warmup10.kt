package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun ProductRow(number: Int, product: Product, modifier: Modifier = Modifier) {


    Row(

        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)


    ) {  Box(

        modifier = Modifier
            .size(36.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFF1565C0)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = number.toString(),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp



        )
    }

        Text(

            text = product.name,
            fontSize = 18.sp,
            color = Color(0xFF263238)


        )

        Spacer(modifier = Modifier.weight(1f))


        Text(

            text = product.price,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF263238)


        )

    }








}


data class Product(val name: String, val price: String)
















@Composable
@Preview(showBackground = true, widthDp = 360, heightDp = 640)

fun ex10() {


    val products = listOf(
        Product("Bread","1.20€"),
        Product("Milk", price ="0.95€"),
        Product(name = "Apples", price = "2.50€"),
        Product("Coffee","3.80€")



    )




    Column(
modifier = Modifier
    .fillMaxWidth()
    .background(Color(0xFFFAFAFA))
    .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Text(

            text = "Shopping list",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

products.forEachIndexed { index, product ->  ProductRow(number = index + 1, product = product)}



    Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "${products.size} products",
            fontSize = 14.sp,
            color = Color.Gray


        )

}
}