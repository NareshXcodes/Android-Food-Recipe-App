package com.naresh.foodrecipeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun RecipeApp(navController:  NavHostController){
    val recipeViewModel : MainViewModel = viewModel()
    val viewstate by recipeViewModel.categoriesState

    NavHost(navController = navController , startDestination = ScreenNav.RecipeScreen.route){

        composable(route = ScreenNav.RecipeScreen.route){
            RecipeScreen(viewstate = viewstate, navigateToDetails = {
                navController.currentBackStackEntry?.savedStateHandle?.set("cat" , it)
                navController.navigate(ScreenNav.DetailScreen.route)
            } )
        }

        composable(route = ScreenNav.DetailScreen.route){
            val category = navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat") ?: Category("" , "" , "" , "")
            DetailScreen(category = category)
        }
    }
}