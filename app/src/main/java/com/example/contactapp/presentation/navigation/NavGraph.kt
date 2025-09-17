package com.example.contactapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import com.example.contactapp.presentation.ContactViewModel
import com.example.contactapp.presentation.Screen.AddEditScreen
import com.example.contactapp.presentation.Screen.HomeScreen

@Composable
fun NavGraph(navHostController: NavHostController, viewModel: ContactViewModel) {

    val state by viewModel.state.collectAsState()
    NavHost(NavController = navHostController, startDestination = Routes.Home.route) {

        composable(Routes.AddEdit.route) {
            AddEditScreen(
                navHostController = navHostController,
                state = viewModel.state.collectAsState().value,
                onEvent = { viewModel.saveContact() })
        }

        composable(Routes.Home.route) {
            HomeScreen(
            navHostController = navHostController,
                state = state,
                viewModel = viewModel
            )
        }
    }
}