package com.naresh.foodrecipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun RecipeScreen(modifier: Modifier = Modifier,  viewstate:MainViewModel.RecipeState , navigateToDetails:(Category)->Unit) {
    val recipeViewModel : MainViewModel = viewModel()
    Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center ){
        when{
            viewstate.loading -> {
                CircularProgressIndicator(Modifier.align(Alignment.Center))
            }
            viewstate.error != null ->{
                Text("Error Occurred")
            }
            else ->{
                CategoryScreen(categories = viewstate.list , navigateToDetails)
            }
        }
    }
}


@Composable
fun CategoryScreen(categories: List<Category> , navigateToDetails:(Category)->Unit) {
    LazyVerticalGrid(GridCells.Fixed(2) , modifier = Modifier.fillMaxSize()) {
        items(categories){
            category ->
            CategoryItem(category = category , navigateToDetails)

        }
    }
}

@Composable
fun CategoryItem (category: Category , navigateToDetails:(Category)->Unit) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
            .clickable { navigateToDetails(category) },
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = rememberAsyncImagePainter(category.strCategoryThumb), contentDescription = null  , modifier = Modifier
            .fillMaxSize()
            .aspectRatio(1f))

        Row(modifier = Modifier.fillMaxWidth() , horizontalArrangement = Arrangement.Center){
            Text(
                text = category.strCategory ,
                color = Color.Black ,
                modifier = Modifier.padding(top = 5.dp),
                style = MaterialTheme.typography.titleMedium
            )

        }

    }
}
