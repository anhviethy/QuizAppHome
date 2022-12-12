package com.via.quizapphome

object Constants {

    const val USER_NAME = "user_name"
    const val NUMS_CORRECT_ANS = "correct_ans"
    const val TOTAL_QUESTION = "total_question"

    fun getQuestion() : ArrayList<Question>{
        val listQuestion = ArrayList<Question>()
        val ques1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        listQuestion.add(ques1)

        val ques2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Portugal", "Australia", "Janpanese", "England",
            2
        )
        listQuestion.add(ques2)

        val ques3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "UAE", "Belgium", "Austria",
            3
        )
        listQuestion.add(ques3)

        val ques4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Brazil", "Armenia", "USA",
            2
        )
        listQuestion.add(ques4)

        val ques5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Australia", "Armenia", "Denmark",
            4
        )
        listQuestion.add(ques5)

        val ques6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Australia", "Armenia", "Austria",
            1
        )
        listQuestion.add(ques6)

        val ques7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Australia", "Germany", "Austria",
            3
        )
        listQuestion.add(ques7)

        val ques8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina", "Australia", "Armenia", "India",
            4
        )
        listQuestion.add(ques8)

        val ques9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Kuwait", "Armenia", "Austria",
            2
        )
        listQuestion.add(ques9)

        val ques10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina", "Australia", "Newzealand", "Austria",
            3
        )
        listQuestion.add(ques10)


        return listQuestion
    }
}