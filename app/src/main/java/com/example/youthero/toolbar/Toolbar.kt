package com.example.youthero.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.youthero.R
import com.example.youthero.categories.Category
import com.example.youthero.categories.MenuCategories
import com.example.youthero.ui.theme.YoutheroTheme

@Composable
fun Toolbar() {

}

@Preview(showBackground = true)
@Composable
fun Preview() {
    val listCategories: List<Category> = listOf(
        Category("Educatie", R.drawable.educatie),
    )
    YoutheroTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "categories") {
            composable("categories") {
                MenuCategories(
                    listCategories = listCategories,
                    navController = navController
                )
            }
            composable(
                "details/{categoryTitle}",
                arguments = listOf(navArgument("categoryTitle") {
                    type = NavType.StringType
                })
            ) {
                com.example.youthero.details.Details(categoryTitle = it.arguments?.getString("categoryTitle"))
            }
        }
    }
}