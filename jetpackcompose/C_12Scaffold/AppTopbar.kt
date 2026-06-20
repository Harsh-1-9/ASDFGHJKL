package com.example.myfirstapp.jetpackcompose.C_12Scaffold

import android.graphics.fonts.FontFamily
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppTopbar() {

    TopAppBar(
        title = {
            Text(text = "Youtube", fontWeight = FontWeight.Bold, fontSize = 25.sp, fontStyle = FontStyle.Italic,)
        },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "Menu Icon")
            }
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notifications Icon"
                )
            }
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon")
            }
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.MoreVert,
                    contentDescription = "MoreVert Icon")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red.copy(alpha = 0.8f),
            titleContentColor = Color.White,
            actionIconContentColor = Color.Black,
            navigationIconContentColor = Color.Black
        )
    )
}

