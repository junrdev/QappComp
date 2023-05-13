package com.junrdev.qappcomp.navigation

enum class Screens {

    HOMESCREEN,
    DETAILED_SCREEN,
    PROFILE_SCREEN;

    companion object{

        fun fromRoute(route : String?) : Screens = when(route?.substringBefore("/")){
                HOMESCREEN.name -> HOMESCREEN
                DETAILED_SCREEN.name -> DETAILED_SCREEN
                PROFILE_SCREEN.name -> PROFILE_SCREEN
                null -> throw IllegalArgumentException("Failed parsed : Invalid route $route")
                else -> HOMESCREEN
        }

    }
}