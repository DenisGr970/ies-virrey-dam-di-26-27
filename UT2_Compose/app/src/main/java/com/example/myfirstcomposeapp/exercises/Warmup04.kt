package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun navigationBar() {

    Row(

        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF263238))

    ) {



    }


}



@Composable
@Preview
fun screen4 () {

navigationBar()

}