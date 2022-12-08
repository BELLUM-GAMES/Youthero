package com.example.youthero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.youthero.categories.Category
import com.example.youthero.categories.MenuCategories
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
                MenuCategories(listCategories)
                //Ce va urma...
            }
        }
    }
}
