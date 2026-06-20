package com.example.myfirstapp.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Normal() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Login Here", fontSize = 30.sp)
        var name by remember { mutableStateOf("")}
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = {Text("Enter Your Name")},
            leadingIcon = {Text("*")},
            trailingIcon = {Text("#")},
            singleLine = true,
            shape = CircleShape,
        )
    }
}