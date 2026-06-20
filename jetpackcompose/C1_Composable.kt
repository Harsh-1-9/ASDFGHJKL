package com.example.myfirstapp.jetpackcompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TextExample(){
    Text(
        text = "Mission Android 2026",
        color = Color.Magenta,
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 2.sp,
        textAlign = TextAlign.Center,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf("")}

    TextField(
        value = name,
        onValueChange = {name = it },
        placeholder = {
            Text(text = "Enter Your Name")
        },
        leadingIcon = {
            Text(
                text = "*",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        singleLine = false,
        shape = RoundedCornerShape(30.dp),
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Blue,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedIndicatorColor = Color.Magenta,
            focusedIndicatorColor = Color.Cyan,
            cursorColor = Color.Blue,
            unfocusedLeadingIconColor = Color.Red,
            focusedLeadingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Magenta,
            focusedTrailingIconColor = Color.Cyan,
            unfocusedPlaceholderColor = Color.Red,
            focusedPlaceholderColor = Color.Green,
            unfocusedSupportingTextColor = Color.Red,
            focusedSupportingTextColor = Color.Green,
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextExample() {

    var name by remember { mutableStateOf("")}

    OutlinedTextField(
        value = name,
        onValueChange = {name = it },
        label = {
            Text(text = "Enter your Name")},
            leadingIcon = {
            Text(
                text = "*",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        singleLine = true,
        shape = CircleShape,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Red,
            cursorColor = Color.Magenta,
            unfocusedLeadingIconColor = Color.Red,
            focusedLeadingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Magenta,
            focusedTrailingIconColor = Color.Cyan,
            unfocusedPlaceholderColor = Color.Red,
            focusedPlaceholderColor = Color.Green,
            unfocusedSupportingTextColor = Color.Red,
            focusedSupportingTextColor = Color.Green,
        )
    )
}
