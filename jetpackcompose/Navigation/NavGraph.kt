package com.example.myfirstapp.jetpackcompose.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun NavGraph() {
    // nav controller handles navigation
    // remember navController create and remember a nav controller
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen,
        modifier = Modifier
    ){

        composable<MyNavRoutes.LoginScreen> {
            LoginScreenUI(navController)
        }
        composable<MyNavRoutes.HomeScreen> {
            HomeScreenUi(navController)
        }
        composable<MyNavRoutes.WelcomeScreen> { backstackEntry -> // backstackEntry is a lambda function
            // having data and arguements which are passed during navigation

            val data = backstackEntry.toRoute<MyNavRoutes.WelcomeScreen>()
            val info = backstackEntry.toRoute<MyNavRoutes.WelcomeScreen>()

            WelcomeScreenUi(data.username, navController)
        }
    }
}
