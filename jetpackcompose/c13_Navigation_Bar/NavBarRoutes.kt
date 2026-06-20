package com.example.myfirstapp.jetpackcompose.c13_Navigation_Bar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {

    @Serializable
    object Home : NavBarRoutes()

    @Serializable
    object Search : NavBarRoutes()

    @Serializable
    object Notifications : NavBarRoutes()

    @Serializable
    object Profile : NavBarRoutes()

}