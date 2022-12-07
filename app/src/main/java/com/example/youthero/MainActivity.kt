package com.example.youthero

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
    Column {
        Image(
            painter = painterResource(itemImage),
            contentDescription = null,
            /*
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondaryVariant, CircleShape)*/
        )
        Column {
            Text(itemDescription)
        }
    }
}

@Composable
fun MenuWithoutLazy() {
    Column {
        Row{
            Column {
                MenuItem(itemDescription = "Educatie", itemImage = R.drawable.educatie)
            }
            Column {
                MenuItem(itemDescription = "Cultura", itemImage = R.drawable.cultura)
            }
        }
        Row{
            Column {
                MenuItem(itemDescription = "Ocupatie", itemImage = R.drawable.ocupatie)
            }
            Column {
                MenuItem(itemDescription = "Mediu inconjurator", itemImage = R.drawable.mediu_inconjurator)
            }
        }
        Row{
            Column {
                MenuItem(itemDescription = "Viata sanatoasa", itemImage = R.drawable.viata_sanatoasa)
            }
            Column {
                MenuItem(itemDescription = "Drepturile Tinerilor", itemImage = R.drawable.drepturi_tineri)
            }
        }
        Row{
            Column {
                MenuItem(itemDescription = "Participare", itemImage = R.drawable.participare)
            }
            Column {
                MenuItem(itemDescription = "Spatii pentru tineri", itemImage = R.drawable.spatii_tineri)
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode")
@Composable
fun Preview()
{
    YoutheroTheme {
        MenuWithoutLazy()
    }
}