package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun screenSkeleton() {

    Column(






    ) {

        Row(

            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1565C0))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically



        ) {

            Text(

                text = "My app",
                textAlign = TextAlign.Left,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )

            Spacer(

                modifier = Modifier.weight(1f)

            )


            Text(

                text = "Edit",
                textAlign = TextAlign.Right,
                color = Color.White,
                fontSize = 16.sp


            )

        }

        Box(

            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center


        ) {

            Text(

                text = "Content",
                fontSize = 18.sp,
                color = Color(0xFF757575),
                textAlign = TextAlign.Center


            )


        }

        Box(

modifier = Modifier
    .height(56.dp)
    .fillMaxWidth()
    .background(Color.LightGray),
            contentAlignment = Alignment.Center



        ) {

            Text(
                text = "Footer",
                textAlign = TextAlign.Center


            )

        }


    }



}





@Composable
@Preview(showBackground = true, widthDp = 360, heightDp = 640)

fun ex8() {

screenSkeleton()

}