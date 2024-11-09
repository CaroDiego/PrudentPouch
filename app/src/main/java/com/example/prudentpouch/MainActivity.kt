package com.example.prudentpouch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prudentpouch.ui.theme.PrudentPouchTheme
import com.example.prudentpouch.view.HomeScreen
import com.example.prudentpouch.viewmodel.MyViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myViewModel by viewModels<MyViewModel>()
        enableEdgeToEdge()
        setContent {
            PrudentPouchTheme {
                val navigationController = rememberNavController()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.Home.route
                ) {
                    composable(Routes.Home.route) {
                        HomeScreen(navigationController, myViewModel)
                    }
                }
            }
        }
    }
}