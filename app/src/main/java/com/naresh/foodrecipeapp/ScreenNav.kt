package com.naresh.foodrecipeapp

sealed class ScreenNav(val route:String) {
    object RecipeScreen: ScreenNav("recipescreen")
    object DetailScreen: ScreenNav("detailscreen")


}