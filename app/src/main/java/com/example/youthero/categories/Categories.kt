package com.example.youthero.categories

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import androidx.navigation.NavController

data class Category(val title: String, @DrawableRes val imageID: Int)

@Composable
fun CategoryItem(categoryItem: Category, navController: NavController) {//Cell == Big column
    Column(
        modifier = Modifier
            .clickable {
                navController.navigate("details/${categoryItem.title}")
            }
            .padding(start = 16.dp, top = 8.dp, end = 10.5.dp, bottom = 8.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color.White)
            .shadow(
                elevation = 6.dp,
                shape = RectangleShape,
                clip = true,
                ambientColor = Color.White,
                spotColor = Color(0x001E1E1E)
            )
    ) {
        Image(
            painter = painterResource(categoryItem.imageID),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 12.dp, top = 12.dp, end = 12.dp)
                .size(137.dp, 143.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = categoryItem.title,
            modifier = Modifier
                .padding(start = 12.dp, bottom = 14.dp),
            color = Color(0xFF6A6A6A), //dirty gray
            fontStyle = FontStyle(0), //normal
            fontWeight = FontWeight(600), //weight
            fontFamily = FontFamily.SansSerif, //SP nush
            lineHeight = 16.sp
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MenuCategories(listCategories: List<Category>, navController: NavController) {
    LazyVerticalGrid(
        modifier = Modifier
            .background(Color(0x001E1E1E)),
        cells = GridCells.Fixed(2),
        content = {
            listCategories.map { item { CategoryItem(it, navController) } }
        }
    )
}