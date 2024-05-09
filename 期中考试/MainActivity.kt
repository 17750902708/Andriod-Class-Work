package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme

class MainActivity:ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{

            MiddleExamTheme {
            }
        }
    }
}

@Composable
fun  Navigator(){
    val navController=rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){ indexPage(navController)}
        composable("NewsPage"){ NewsPage(navController) }
        composable("NovelPage"){NovelPage(navController) }
        composable("EndPage"){ EndPage(navController) }
    }
}
@Composable
fun MainActivity(navController: NavController) {
    Column {
        Text(text = "欢迎")
        Button(onClick = {
            navController.navigate("index")
        }) {
            Text(text = "enter")
        }
    }
}
@Preview(
    showSystemUi = true,
    showBackground = true)
@Composable
fun GreetingPreview() {
    MiddleExamTheme {
        Navigator()
    }
}