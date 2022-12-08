package com.example.youthero

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.youthero.categories.Category
import com.example.youthero.categories.MenuCategories
import com.example.youthero.details.Details
import com.example.youthero.ui.theme.YoutheroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val listCategories: List<Category> = listOf(
                Category("Educatie", R.drawable.educatie),
                Category("Cultura", R.drawable.cultura),
                Category("Ocupatie", R.drawable.ocupatie),
                Category("Mediu inconjurator", R.drawable.mediu_inconjurator),
                Category("Viata sanatoasa", R.drawable.viata_sanatoasa),
                Category("Drepturile Tinerilor", R.drawable.drepturi_tineri),
                Category("Participare", R.drawable.participare),
                Category("Spatii pentru tineri", R.drawable.spatii_tineri)
            )
            YoutheroTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "categories"){
                    composable("categories") { MenuCategories(listCategories) }
                    composable("details") { Details() }
                }
            }
        }
    }

    @Preview(
        uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark Mode"
    )
    @Composable
    fun Preview() {
        val listCategories: List<Category> = listOf(
            Category("Educatie", R.drawable.educatie),
            Category("Cultura", R.drawable.cultura),
            Category("Ocupatie", R.drawable.ocupatie),
            Category("Mediu inconjurator", R.drawable.mediu_inconjurator),
            Category("Viata sanatoasa", R.drawable.viata_sanatoasa),
            Category("Drepturile Tinerilor", R.drawable.drepturi_tineri),
            Category("Participare", R.drawable.participare),
            Category("Spatii pentru tineri", R.drawable.spatii_tineri)
        )
        YoutheroTheme {
            MenuCategories(listCategories)
        }
    }
}
