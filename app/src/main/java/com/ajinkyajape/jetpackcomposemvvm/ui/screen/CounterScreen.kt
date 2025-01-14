package com.ajinkyajape.jetpackcomposemvvm.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ajinkyajape.jetpackcomposemvvm.mvvm.viewmodel.CounterViewModel

/**
 * Created by Ajinkya Jape on 14/01/25.
 */

@Composable
fun CounterScreen(counterViewModel: CounterViewModel) {
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(10.dp),
            text = "Counter is:  ${counterViewModel.countValue.value}",
            fontWeight = FontWeight.Bold
        )

        Row {
            Button(onClick = { counterViewModel.incrementCounter() }) {
                Text("Increment")
            }
            Spacer(Modifier.padding(10.dp))

            Button(onClick = { counterViewModel.decrementCounter() }) {
                Text("Decrement")
            }
        }
    }
}