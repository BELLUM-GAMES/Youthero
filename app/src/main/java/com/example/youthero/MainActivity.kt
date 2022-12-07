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
fun MenuItem(itemTitle: String, @DrawableRes itemImageID: Int){
    Column {
        Image(
            painter = painterResource(itemImageID),
            contentDescription = null,
        )
        Column {
            Text(itemTitle)
        }
    }
}

@Composable
fun MenuWithoutLazy() {
    Column {
        Row{
            Column {
                MenuItem(itemTitle = "Educatie", itemImageID = R.drawable.educatie)
            }
            Column {
                MenuItem(itemTitle = "Cultura", itemImageID = R.drawable.cultura)
            }
        }
        Row{
            Column {
                MenuItem(itemTitle = "Ocupatie", itemImageID = R.drawable.ocupatie)
            }
            Column {
                MenuItem(itemTitle = "Mediu inconjurator", itemImageID = R.drawable.mediu_inconjurator)
            }
        }
        Row{
            Column {
                MenuItem(itemTitle = "Viata sanatoasa", itemImageID = R.drawable.viata_sanatoasa)
            }
            Column {
                MenuItem(itemTitle = "Drepturile Tinerilor", itemImageID = R.drawable.drepturi_tineri)
            }
        }
        Row{
            Column {
                MenuItem(itemTitle = "Participare", itemImageID = R.drawable.participare)
            }
            Column {
                MenuItem(itemTitle = "Spatii pentru tineri", itemImageID = R.drawable.spatii_tineri)
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