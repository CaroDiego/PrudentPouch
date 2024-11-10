package com.example.prudentpouch.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.example.prudentpouch.viewmodel.MyViewModel

@Composable
fun HomeScreen(navController: NavController, vm: MyViewModel) {}

@Preview
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController, vm = MyViewModel())
}