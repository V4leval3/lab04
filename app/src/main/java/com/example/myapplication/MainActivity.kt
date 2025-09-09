package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    floatingActionButton = {
                        FloatingActionButton(onClick = {}) {
                            Text("+")
                        }
                    }
                ) { innerPadding ->
                    MiLazyColumn(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MiLazyColumn(modifier: Modifier = Modifier){
    val elementos = listOf("Uno", "Dos", "Tres", "Cuatro", "Cinco")

    LazyColumn (modifier = modifier) {
        items(elementos){item ->
            Text(text = "Elemento: $item")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLazycolumn(){
    MyApplicationTheme {
        MiLazyColumn()
    }
}