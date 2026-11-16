package com.example.myfirstcomposeapp.exercises



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun dayBar() {

    Column(

        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)



    ) {
        Text(
text = "Your day",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp

        )

        Row(

            modifier = Modifier
                .height(48.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))



        ) {

            Box(

              modifier = Modifier
                  .weight(2f)
                  .fillMaxHeight()
                  .background(Color(0xFF1565C0)),
                contentAlignment = Alignment.Center
            ) {

Text(
    text = "Work",
    color = Color.White,
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold
)

            }


            Box(

                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFF43A047)),
                contentAlignment = Alignment.Center




            ) {

                Text(

                    text = "Study",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )



            }


            Box(

                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                        .background(Color(0xFFEF6C00)),
                        contentAlignment = Alignment.Center



            ) {

                Text(

                    text = "Rest",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold


                )


            }











        }


    }



}




@Composable
@Preview

fun ex6() {

dayBar()



}