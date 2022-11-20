package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Guess the Country",
            R.drawable.germany,
            "Netherlands",
            "Germany",
            "Italy",
            "USA",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Guess the Country",
            R.drawable.italy,
            "Germany",
            "Spain",
            "Italy",
            "Australia",
            3
        )
        questionsList.add(que2)
        val que3 = Question(
            3,
            "Guess the Country",
            R.drawable.australia,
            "Austria",
            "Australia",
            "America",
            "Spain",
            2
        )
        questionsList.add(que3)
        val que4 = Question(
            4,
            "Guess the Country",
            R.drawable.spain,
            "Netherlands",
            "Spain",
            "China",
            "Srilanka",
            2
        )
        questionsList.add(que4)
        val que5 = Question(
            5,
            "Guess the Country",
            R.drawable.srilanka,
            "Bolivia",
            "Srilanka",
            "China",
            "Bhutan",
            2
        )
        questionsList.add(que5)
        val que6 = Question(
            6,
            "Guess the Country",
            R.drawable.china,
            "China",
            "Bhutan",
            "vietnam",
            "Somalia",
            1
        )
        questionsList.add(que6)
        val que7 = Question(
            7,
            "Guess the Country",
            R.drawable.india,
            "Germany",
            "France",
            "India",
            "Brazil",
            3
        )
        questionsList.add(que7)
        val que8 = Question(
            8,
            "Guess the Country",
            R.drawable.france,
            "Georgia",
            "France",
            "Guyana",
            "Sudan",
            2
        )
        questionsList.add(que8)
        val que9 = Question(
            9,
            "Guess the Country",
            R.drawable.netherlands,
            "Italy",
            "UAE",
            "Netherlands",
            "papua new guinea",
            3
        )
        questionsList.add(que9)
        val que10 = Question(
            10,
            "Guess the Country",
            R.drawable.southkorea,
            "South Korea",
            "Finland",
            "Oman",
            "Turkey",
            1
        )
        questionsList.add(que10)
        return questionsList
    }
}