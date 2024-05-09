package com.example.middleexam

import android.accounts.Account
import androidx.compose.runtime.Immutable

@Immutable
data class News(
    val tit:String,
    val text:String,
    val data:String,
    val style:String,
)
@Immutable
data class Novel(
    val tit: String,
    val text: String,
    val data: String,
    val style: String
)

object UserData{
    val NewsList =listOf {
        News("你好", "你好啊", "20031221", "你好")
        News("你好", "你好啊", "20031221", "你好")
        News("你好", "你好啊", "20031221", "你好")
        News("你好", "你好啊", "20031221", "你好")
        News("你好", "你好啊", "20031221", "你好")

    }
object UserData{
    val NovelList =listOf {
        Novel("111", "222", "20031122", "333")
        Novel("111", "222", "20031122", "333")
        Novel("111", "222", "20031122", "333")
        Novel("111", "222", "20031122", "333")
        Novel("111", "222", "20031122", "333")

    }
  }
}