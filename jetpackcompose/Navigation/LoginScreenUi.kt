package com.example.myfirstapp.jetpackcompose.Navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreenUI(navController: NavHostController) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Login Screen",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,)
        Text(text = " First Login Here",
            fontSize = 17.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 10.dp),)

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            label = { Text(text = "UserName", fontSize = 13.sp, fontWeight = FontWeight.Bold) },
            modifier = Modifier.fillMaxWidth(),
            shape = CircleShape
        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Password",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold) },
            modifier = Modifier.fillMaxWidth(),
            shape = CircleShape
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(MyNavRoutes.WelcomeScreen(username))
        },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.Black,
            ),
            shape = RoundedCornerShape(8.dp),
            enabled = username.isNotEmpty() && password.isNotEmpty()
            ) {
            Text(text = "LOGIN", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}