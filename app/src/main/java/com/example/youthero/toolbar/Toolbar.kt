package com.example.youthero.toolbar

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youthero.R
import com.example.youthero.categories.Category
import com.example.youthero.ui.theme.YoutheroTheme

@Composable
fun Toolbar() {

}

@Composable
fun CategoryItem(categoryItem: Category) {//Cell == Big column
    Column(
        modifier = Modifier
            .clickable {
                //navController.navigate("details/${categoryItem.title}")
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
            fontFamily = FontFamily.SansSerif, //SP font but isn't SP
            lineHeight = 16.sp //lineHeight
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MenuCategories(listCategories: List<Category>) {
    LazyVerticalGrid(
        modifier = Modifier
            .background(Color(0x001E1E1E)),
        cells = GridCells.Fixed(2),
        content = {
            listCategories.map { item { CategoryItem(categoryItem = it) } }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    val listCategories: List<Category> = listOf(
        Category("Educatie", R.drawable.educatie),
        Category("Educatie", R.drawable.educatie)
    )
    YoutheroTheme {
        Toolbar()
        MenuCategories(listCategories = listCategories)
    }
}