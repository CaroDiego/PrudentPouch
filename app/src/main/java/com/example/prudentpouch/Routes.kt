package com.example.prudentpouch

sealed class Routes(val route: String) {
    object  Home: Routes("home")
}