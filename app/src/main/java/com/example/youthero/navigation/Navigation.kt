package com.example.youthero.navigation

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.youthero.R
import com.example.youthero.categories.Category
import com.example.youthero.categories.MenuCategories
import com.example.youthero.ui.theme.YoutheroTheme

@Composable
fun Navigation() {
    val navController = rememberNavController()

    /*
    NavHost(navController = navController, startDestination = "profile") {
        composable("profile") { Profile(/*...*/) }
        composable("friendslist") { FriendsList(/*...*/) }
    }
    */
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark Mode"
)
@Composable
fun Preview(){
    val listCategories: List<Category> = listOf(
        Category("Educatie", R.drawable.educatie),
    )
    YoutheroTheme {
        MenuCategories(listCategories)
    }
}