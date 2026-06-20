package com.example.myfirstapp.jetpackcompose.Navigation

import kotlinx.serialization.Serializable

// sealed class creates a restricted hierarchy
// so its subclasses can be defined in the same file.
// Each subclass can have its own properties and methods.

@Serializable
sealed class MyNavRoutes {
    @kotlinx.serialization.Serializable
    object LoginScreen : MyNavRoutes()

    @kotlinx.serialization.Serializable
    object HomeScreen : MyNavRoutes()

    @kotlinx.serialization.Serializable
    data class WelcomeScreen (val username: String) : MyNavRoutes()
}
