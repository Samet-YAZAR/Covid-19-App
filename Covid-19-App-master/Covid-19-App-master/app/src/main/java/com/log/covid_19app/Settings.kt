package com.log.covid_19app

object Settings {

    var english: Boolean = true
    var regular_mode: Boolean = true

    fun languageSwitch(value: Boolean){
        english = value
    }

    fun modeSwitch(value: Boolean){
        regular_mode = value
    }

}