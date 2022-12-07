package com.example.youthero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.youthero.ui.theme.YoutheroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YoutheroTheme {
                //Actual app and not preview
            }
        }
    }
}

@Composable
fun MenuItem(itemDescription: String, @DrawableRes itemImage: Int){
    Image(
        painter = painterResource(itemImage),
        contentDescription = null,
        /*
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .border(1.5.dp, MaterialTheme.colors.secondaryVariant, CircleShape)*/
    )
    Text(itemDescription)
}

@Composable
fun Menu() {
    MenuItem(itemDescription = "Educatie", itemImage = R.drawable.educatie)
}

@Preview
@Composable
fun Preview()
{
    YoutheroTheme {
        Menu()
    }
}