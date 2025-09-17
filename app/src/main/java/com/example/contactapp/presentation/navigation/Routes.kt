package com.example.contactapp.presentation.navigation

sealed class Routes (val route: String){

    object AddEdit : Routes("add_edit_screen")
    object Home : Routes("home_screen")
}