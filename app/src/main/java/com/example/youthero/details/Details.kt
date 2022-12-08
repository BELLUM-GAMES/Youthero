package com.example.youthero.details

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.youthero.ui.theme.YoutheroTheme

@Composable
fun Details(navController: NavController) {
    YoutheroTheme {
        Column{
            Button(onClick = {
                navController.navigate("categories")
            }) {
                Text(text = "Another View, press me to go back")
            }
        }
    }
}