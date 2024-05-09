package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavHostController


@Composable
fun EndPage(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigate("Home") })
        {
            Text(text = "Exam over")
        }
    }
}
