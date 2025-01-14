package com.ajinkyajape.countermvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ajinkyajape.countermvvm.mvvm.viewmodel.CounterViewModel
import com.ajinkyajape.countermvvm.ui.screen.CounterScreen
import com.ajinkyajape.countermvvm.ui.theme.CounterMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val counterViewModel: CounterViewModel = viewModel()
            CounterMVVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    CounterScreen(counterViewModel)
                }
            }
        }
    }
}