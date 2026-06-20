package com.example.myfirstapp.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun ModifierExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Yellow)
            .padding(vertical = 16.dp)
            .padding(horizontal = 16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround
            ) {
            Text("Apple", fontSize = 20.sp)
            Text("Mango", fontSize = 20.sp)
            Text("Banana", fontSize = 20.sp)
        }
        Box(
            modifier = Modifier
                .background(color = Color.Cyan, shape = RoundedCornerShape(16.dp)

                )
                .size(150.dp)
            .clickable(onClick = { } )
                .border(width = 8.dp, color = Color.Red, shape = RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Center", fontSize = 20.sp)
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .background(color = Color.Magenta)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text("One", fontSize = 20.sp)
            Text("Two", fontSize = 20.sp)
            Text("three", fontSize = 20.sp)
        }
    }

}