package com.example.youthero.details

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.youthero.ui.theme.YoutheroTheme

@Composable
fun Details(categoryTitle: String?) {
    YoutheroTheme {
        Column {
            Column {
                Text("This is $categoryTitle, press me to go back")
            }
        }
    }
}