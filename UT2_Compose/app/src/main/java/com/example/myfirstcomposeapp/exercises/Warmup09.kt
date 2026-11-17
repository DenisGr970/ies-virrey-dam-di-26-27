package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun statCards(title: String, value: String, color: Color,modifier: Modifier = Modifier) {



        Box(
            modifier = Modifier

                .clip(RoundedCornerShape(12.dp))
                .background(color)
                .padding(12.dp),
            contentAlignment = Alignment.Center



        ){

Column(

horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(4.dp)


) {

    Text(
        text = value,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,



    )



    Text(
        text = title,
        color = Color.White,
        fontSize = 14.sp



    )


}




        }



    }





@Composable
@Preview(showBackground = true)


fun ex9 () {

    Row(
modifier = Modifier
    .fillMaxWidth()
    .padding(16.dp),
        horizontalArrangement =Arrangement.spacedBy(8.dp)


    ) {  statCards("Steps","8,432", color = Color(0xFF1565C0), modifier = Modifier.weight(1f))
        statCards("Calories","520", color = Color(0xFFEF6C00), modifier = Modifier.weight(1f))
        statCards("Km","6,4", color = Color(0xFF2E7D32), modifier = Modifier.weight(1f))
    } }

