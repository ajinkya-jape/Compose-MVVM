package com.ajinkyajape.jetpackcomposemvvm.mvvm.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.MovieModel
import com.ajinkyajape.jetpackcomposemvvm.mvvm.viewmodel.MovieViewModel

@Composable
fun MovieScreen(viewModel: MovieViewModel = hiltViewModel() ) {
    val movies by viewModel.dataStateFlowList.collectAsState()

    // Display the list of movies in a LazyColumn
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(movies){moviesData->
            MovieItem(moviesData)
        }
    }

    // Trigger data load when the screen is first displayed
    LaunchedEffect(Unit) {
        viewModel.getRecords()
    }

}

@Composable
fun MovieItem(dataResponse: MovieModel) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Movie : ${dataResponse.movie}")
        TextStyle.Default
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Rating : ${dataResponse.rating}")
        TextStyle.Default
        Spacer(modifier = Modifier.height(8.dp))
    }
}
