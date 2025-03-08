package com.tayyipgunay.superhero2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.DetailScreen
import com.SuperHeroList
import com.google.gson.Gson
import com.model.SuperHero
import com.tayyipgunay.superhero2.ui.theme.SuperHero2Theme

class MainActivity : ComponentActivity() {
    private val superHeroList = ArrayList<SuperHero>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            getData()

            val navController = rememberNavController()

            SuperHero2Theme {
               Scaffold(modifier = Modifier.fillMaxSize()){
                   paddingValues ->
                   Box(modifier = Modifier.padding(paddingValues)){
                      NavHost(navController = navController,
                          startDestination = "list_screen"){
                          composable("list_screen"){
                              SuperHeroList(superHeroList = superHeroList,navController)
                          }
                          composable("detail_screen/{superhero}",
                              arguments = listOf(navArgument("superhero"){
                           type = NavType.StringType
                              }
                              ))
                          {
                              val heroString= remember {
                                  it.arguments?.getString("superhero")
                              }
                              val selectedSuperHero= Gson().fromJson(heroString,SuperHero::class.java)
                              DetailScreen(superHero = selectedSuperHero)



                             // DetailScreen(superHero = SuperHero("Ironman", "Marvel", R.drawable.ironman))



                          }
                      }


                   }


               }


            }
        }
    }

    fun getData() {
        val ironman = SuperHero("Ironman", "Marvel", R.drawable.ironman)
        val spiderman = SuperHero("Spiderman", "Marvel", R.drawable.spiderman)
        val hulk = SuperHero("Hulk", "Marvel", R.drawable.hulk)
        val batman = SuperHero("Batman", "DC", R.drawable.batman)
        superHeroList.add(ironman)
        superHeroList.add(spiderman)
        superHeroList.add(hulk)
        superHeroList.add(batman)

    }




    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        SuperHero2Theme {

            /* val ironman = SuperHero("Ironman", "Marvel", R.drawable.ironman)
            val spiderman = SuperHero("Spiderman", "Marvel", R.drawable.spiderman)
            val hulk = SuperHero("Hulk", "Marvel", R.drawable.hulk)
            val batman = SuperHero("Batman", "DC", R.drawable.batman)
            superHeroList.add(ironman)
            superHeroList.add(spiderman)
            superHeroList.add(hulk)
            superHeroList.add(batman)
            SuperHeroList(superHeroList = superHeroList)
            */
            
          //  DetailScreen(superHero = SuperHero("Ironman", "Marvel", R.drawable.ironman))

        }
    }
}
