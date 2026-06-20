package com.example.myfirstapp.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateExample() {
    var score by rememberSaveable() { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Score : $score", fontSize = 30.sp)

        Row() {
            Button(onClick = {score++},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }
            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = {score--},
                enabled = score > 0,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Decrease")
            }
        }
    }
}
//
@Composable
fun StateHoistingParent() {
    var score by remember() { mutableStateOf(0) }
    CounterChild(
        score = score,
        Increment = {score++},
        Decrement = {score--}
    )
}

@Composable
fun CounterChild(score: Int, Increment: () -> Unit, Decrement: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Score : $score", fontSize = 30.sp)
        Row() {
            Button(onClick = {Increment},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {Decrement},
                enabled = score > 0,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Decrease")
            }
        }
    }
}
