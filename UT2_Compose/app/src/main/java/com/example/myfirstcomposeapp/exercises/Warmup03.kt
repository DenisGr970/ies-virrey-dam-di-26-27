package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun contactCard() {

  Column(
      modifier =Modifier
          .fillMaxWidth()
          .background(Color(0xFFF5F5F5))
      .padding(16.dp),
    verticalArrangement =  Arrangement.spacedBy(4.dp),
      horizontalAlignment=  Alignment.CenterHorizontally
  ) {

      Text(text = "Ana García", fontSize = 22.sp, fontWeight = FontWeight.Bold)
      Text(text = "Android Developer", fontSize = 16.sp, color = Color(0xFF616161))
      Text(text = "Villarrobledo", fontSize = 14.sp, color = Color(0xFF616161))

  }






}





@Composable
@Preview
fun screen() {

    contactCard()


}