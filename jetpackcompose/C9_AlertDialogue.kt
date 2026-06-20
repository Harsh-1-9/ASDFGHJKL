package com.example.myfirstapp.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AlertDialogueExample() {
    var openDialogue by remember { mutableStateOf(false) }
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Alert Dialogue Example",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray)
                IconButton(onClick = {openDialogue = true},
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = Color.DarkGray,
                        contentColor = Color.White
                    ),
                    ) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete Item")
                }
            }
        }
        if(openDialogue){
            AlertDialog(
                onDismissRequest = {openDialogue = false},
                title = { Text(text = "Delete Item", fontWeight = FontWeight.Bold) },
                text = { Text(text = "Are you sure you want to delete this item?",fontWeight = FontWeight.SemiBold) },
                confirmButton = {
                    Button(onClick = {
                        Toast.makeText(context, "Item is successfully Deleted", Toast.LENGTH_SHORT).show()
                        openDialogue = false
                    },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.DarkGray,
                            contentColor = Color.White
                        )
                    ) {
                        Text(text = "Delete")
                    }
                },
                dismissButton = {
                    Button(onClick = {openDialogue = false},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.LightGray,
                            contentColor = Color.DarkGray
                        )
                    ) {
                        Text(text = "Cancel")
                    }
                },
                containerColor = Color.White,
                titleContentColor = Color.DarkGray,
                textContentColor = Color.DarkGray

            )
        }
    }
}