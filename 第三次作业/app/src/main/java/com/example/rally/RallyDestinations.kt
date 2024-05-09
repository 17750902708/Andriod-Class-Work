package com.example.rally

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.MoneyOff
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink

interface RallyDestinations{
    val icon:ImageVector
    val route:String
}

object Overview : RallyDestinations{
    override val icon = Icons.Filled.PieChart
    override val route="overview"
}

object Accounts:RallyDestinations{
    override val icon=Icons.Filled.PieChart
    override val route ="overview"
}

object Bills:RallyDestinations{
    override val icon=Icons.Filled.MoneyOff
    override val route ="bills"
}
object SingleAccount: RallyDestinations{
    override val icon =Icons.Filled.Money
    override val route ="single_account"
    const val accountTypeArg ="account_type"
    val routeWithArgs ="$route/{$accountTypeArg}"
    val argument =listOf(
        navArgument(accountTypeArg){type=NavType.StringType}
    )
    val deepLink = listOf(
        navDeepLink{  uriPattern ="rally://$route/{$accountTypeArg}"}
    )
}

val rallyTabRowScreen =listOf(Overview,Accounts,Bills)