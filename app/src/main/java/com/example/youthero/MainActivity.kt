package com.example.youthero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.youthero.categories.Category
import com.example.youthero.categories.MenuCategories
import com.example.youthero.details.Details
import com.example.youthero.ui.theme.YoutheroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val listCategories: List<Category> = listOf(
                Category(getString(R.string.education), R.drawable.educatie),
                Category(getString(R.string.culture), R.drawable.cultura),
                Category(getString(R.string.job), R.drawable.ocupatie),
                Category(getString(R.string.enviroment), R.drawable.mediu_inconjurator),
                Category(getString(R.string.healthy), R.drawable.viata_sanatoasa),
                Category(getString(R.string.rights), R.drawable.drepturi_tineri),
                Category(getString(R.string.participation), R.drawable.participare),
                Category(getString(R.string.spaces), R.drawable.spatii_tineri)
            )
            YoutheroTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "categories") {
                    composable("categories") { MenuCategories(listCategories = listCategories, navController = navController) }
                    composable(
                        "details/{categoryTitle}",
                        arguments = listOf(navArgument("categoryTitle") {
                            type = NavType.StringType
                        })
                    ) {
                        Details(categoryTitle = it.arguments?.getString("categoryTitle"))
                    }
                }
            }
        }
    }
}