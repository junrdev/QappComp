package com.junrdev.qappcomp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.junrdev.qappcomp.screens.HomeScreen
import com.junrdev.qappcomp.screens.QuestionView
import com.junrdev.qappcomp.screens.UserProfile

@Composable
fun AppNavigator(){

    val navigatorController  = rememberNavController()

    //mapping the different screens
    NavHost(navController = navigatorController, startDestination = Screens.HOMESCREEN.name){

        //home screen
        composable(route= Screens.HOMESCREEN.name){
            HomeScreen(navController = navigatorController)
        }

        //scores and profile
        composable(route = Screens.PROFILE_SCREEN.name){
            UserProfile(navController = navigatorController)
        }

        //questions
        composable(route = Screens.DETAILED_SCREEN.name){
            QuestionView(navController = navigatorController)
        }
    }

}
