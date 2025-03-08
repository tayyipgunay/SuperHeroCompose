package com

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.gson.Gson
import com.model.SuperHero

@Composable
fun SuperHeroList(superHeroList: ArrayList<SuperHero>,navController: NavController){
    LazyColumn(contentPadding= PaddingValues(5.dp),
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer)
    )

    {
       items(superHeroList){superHero->
            SuperHeroRow(superHero = superHero,navController)
        }


    }

}


@Composable
fun SuperHeroRow(superHero: SuperHero,navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth()
        .background(MaterialTheme.colorScheme.primaryContainer).clickable {
            navController.navigate("detail_screen/${Gson().toJson(superHero)}")
        })
    {
        Text(text = superHero.name, fontSize = 30.sp,
            modifier = Modifier.padding(top = 16.dp))
        Text(text = superHero.universe, fontSize = 30.sp, color = Color.Blue,
            modifier = Modifier.padding(top = 5.dp)
        )


    }


}