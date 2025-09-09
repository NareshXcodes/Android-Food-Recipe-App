package com.naresh.foodrecipeapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    private val _categorieState = mutableStateOf(RecipeState())
    val categoriesState : State<RecipeState> = _categorieState

    



     data class RecipeState (
         val loading : Boolean,
         val list : List<Category> = emptyList(),
         val error : String? = null
     )
}