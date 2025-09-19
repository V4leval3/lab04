package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    Mipantalla(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Mipantalla(modifier: Modifier = Modifier){
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
        Mipantalla()
    }
}
@Composable
fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp), // cambiado de 16 a 24 para notar el cambio
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hola curso",
            modifier = Modifier.padding(12.dp), // también un poco más de espacio
            color = Color(0xFF0000FF) // cambio de estilo: texto azul
        )
    }
}
