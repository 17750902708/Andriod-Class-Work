package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme

class index:ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{

            MiddleExamTheme {
            }
        }
    }
}


@Composable
fun indexPage(navController: NavController) {
    Column {
        Button(onClick = {
            navController.navigate("HomePage")
        }) {
            Text(text = "home")
        }
        Button(onClick = {
            navController.navigate("NewsPage")
        }) {
            Text(text = "News")
        }
        Button(onClick = {
            navController.navigate("NovelPage")
        }) {
            Text(text = "Novel")
        }
        Button(onClick = {
            navController.navigate("EndPage")
        }) {
            Text(text = "end")
        }
    }
}

