package com.example.youthero.details

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.youthero.ui.theme.YoutheroTheme

@Composable
fun Details(){
    YoutheroTheme {
        Text(text = "The other view")
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Preview(){
    Details()
}