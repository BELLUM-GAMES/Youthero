package com.example.youthero.categories

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youthero.MenuItem
import com.example.youthero.R
import com.example.youthero.ui.theme.YoutheroTheme

data class Category(val categoryTitle: String, @DrawableRes val categoryImageID: Int)

@Composable
fun CategoryItem(categoryItem: Category) {
    Column {
        Image(
            painter = painterResource(categoryItem.categoryImageID),
            contentDescription = null,
        )
        Column {
            Text(categoryItem.categoryTitle)
        }
    }
}

@Composable
fun MenuCategories(listCategories: List<Category>) {
    LazyColumn{
        listCategories.map { item { CategoryItem(it)} }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyVerticalGridDemo(listCategories: List<Category>){

}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
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