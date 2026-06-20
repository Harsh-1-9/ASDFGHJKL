package com.example.myfirstapp.jetpackcompose.C_12Scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FAB () {
    FloatingActionButton(onClick = { },
        containerColor = Color.Black,
        contentColor = Color.White
        ) {
        Icon(imageVector = Icons.Default.Add,
            contentDescription = "Add Icon")
    }
}
