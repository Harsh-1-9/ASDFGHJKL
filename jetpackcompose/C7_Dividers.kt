package com.example.myfirstapp.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HorizontalDividerExample(){
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Look Down", fontSize = 30.sp)
        HorizontalDivider(
            modifier = Modifier
                .width(120.dp)
                .padding(vertical = 16.dp),
            thickness = 5.dp,
            color = Color.Black
        )
        Text(text = "Name", fontSize = 30.sp)
    }
}
// Same as Vertical Divider 