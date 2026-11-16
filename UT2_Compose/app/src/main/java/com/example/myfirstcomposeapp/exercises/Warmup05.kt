package com.example.myfirstcomposeapp.exercises

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun notificationBadge() {

    Box(

        modifier = Modifier
            .size(120.dp)
            .clip(RoundedCornerShape(16.dp))
        .background(color = Color.LightGray),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = "Mail",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold

        ) 
        
        Box(
            
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(6.dp)
                .size(28.dp)
                .clip(CircleShape)
                .background(Color(0xFFE53935)),
            contentAlignment = Alignment.Center
            
            
        ) {

            Text(

                text = "3",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold


            )

        }
    
    
    
    
    
    }

  


}


@Preview
@Composable

fun ex5() {

notificationBadge()

}