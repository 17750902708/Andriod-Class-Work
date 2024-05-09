package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun NewsPage(navController: NavHostController){
    Column {

        Text(text ="标题")
        Text(text ="内容")
        Button(onClick = {
            navController.navigate("index")
        }) {
            Text(text="返回")
        }

}}

