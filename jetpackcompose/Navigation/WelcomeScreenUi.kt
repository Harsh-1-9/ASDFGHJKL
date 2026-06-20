package com.example.myfirstapp.jetpackcompose.Navigation

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun WelcomeScreenUi(UserName: String, navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Welcome $UserName!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontStyle = FontStyle.Italic
            )

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {
            navController.navigate(MyNavRoutes.LoginScreen)
        },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black
            ),
            shape = CircleShape,
        ) {
            Text(text = "Back To Login Screen",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold)
        }
    }
}