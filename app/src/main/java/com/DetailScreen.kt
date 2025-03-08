package com

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.model.SuperHero
import com.tayyipgunay.superhero2.R

@Composable
fun DetailScreen(superHero: SuperHero) {
    Box(modifier = Modifier.fillMaxSize()
        .background(color = MaterialTheme.colorScheme.primaryContainer),
        contentAlignment = Alignment.Center
    )
    {
        Column {
            Text(text = superHero.name, fontSize = 30.sp,
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp, start = 50.dp),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge)

            Image(bitmap = ImageBitmap.imageResource(id = superHero.image),
                contentDescription = "")

            Text(text=superHero.universe,fontSize = 30.sp,
                modifier = Modifier.padding(top = 16.dp, start = 55.dp),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge)
        }

    }




}