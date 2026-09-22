package com.example.lab3var9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab3var9.ui.theme.Lab3Var9Theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab3Var9Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SymbolCheck(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SymbolCheck(modifier: Modifier = Modifier) {
    var symbol by remember { mutableStateOf("") }

    Column(
        modifier = modifier
    ) {
        Text("Введите символ")

        Spacer(modifier = Modifier.height(36.dp))

        OutlinedTextField(
            value = symbol,
            onValueChange = { symbol = it },
            label = { Text("Символ") }
        )

        Spacer(modifier = Modifier.height(36.dp))

        Button(
            onClick = { }
        ) {
            Text("Проверить")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun SymbolCheckPreview() {
    Lab3Var9Theme {
        SymbolCheck()
    }
}
