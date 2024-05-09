package com.example.rally.data

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class Account(
    val name:String,
    val number: Int,
    val balance:Float,
    val color:Color
)

@Immutable
data class Bill(
    val name: String,
    val due:String,
    val amount: Float,
    val color: Color
)


object UserData{
    val account:List<Account> = listOf(
        Account(
            "zcc",
            3213,
            7657657.13f,
            Color(0xFF004948)
        )
    )
    val bills:List<Bill> = listOf()
    fun getAccount(accountName:String?): Account{
        return account.first {it.name ==accountName}
    }
}