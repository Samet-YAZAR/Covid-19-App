package com.log.covid_19app

data class Information(

    val header_en: String = "Prevention :",

    val rules_en: ArrayList<String> = arrayListOf(
        "Clean your hands often. Use soap and water, or an alcohol-based hand rub.",
        "Maintain a safe distance from anyone who is coughing or sneezing.",
        "Wear a mask when physical distancing is not possible.",
        "Don’t touch your eyes, nose or mouth.",
        "Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.",
        "Stay home if you feel unwell.",
        "If you have a fever, cough and difficulty breathing, seek medical attention."),

    val button_text_en: String = "HOW TO WASH HANDS?",

    val settings_en: String = "Settings",




    val header_pl: String = "Zapobieganie :",

    val rules_pl: ArrayList<String> = arrayListOf(
        "Często myj ręce. Używaj wody z mydłem i środka dezynfekującego na bazie alkoholu.",
        "Zachowaj bezpieczną odległość od osób kaszlących i kichających.",
        "Noś maskę, gdy zachowanie odległości nie jest możliwe.",
        "Nie dotykaj oczu, nosa ani ust.",
        "Gdy kaszlesz lub kichasz, zakrywaj nos i usta wewnętrzną stroną łokcia lub chusteczką.",
        "Jeśli źle się czujesz, zostań w domu.",
        "Jeśli masz gorączkę, kaszel i trudności z oddychaniem, skontaktuj się z lekarzem."),

    val button_text_pl: String = "JAK MYC RECE?",

    val settings_pl: String = "Ustawienia",


    )
