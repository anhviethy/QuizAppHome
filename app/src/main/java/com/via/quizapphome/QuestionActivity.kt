package com.via.quizapphome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    var mProgressBar: ProgressBar? = null
    var mTvProgressBar: TextView? = null
    var mTvOption1: TextView? = null
    var mTvOption2: TextView? = null
    var mTvOption3: TextView? = null
    var mTvOption4: TextView? = null
    var mBtnSubmit: Button? = null

    var mSelectedOption: Int = 0
    var mCurrentIdQuestion: Int = 0
    var mListQuestion: ArrayList<Question>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        getViewById()
        setDefaultOptionView()
    }

    fun setDefaultOptionView() {
        var listOption: ArrayList<TextView> = ArrayList()
        mTvOption1?.let { listOption.add(it) }
        mTvOption2?.let { listOption.add(it) }
        mTvOption3?.let { listOption.add(it) }
        mTvOption4?.let { listOption.add(it) }

        for (option in listOption) {
            option.setTextColor(getColor(R.color.color_text_input))
            option.background = ContextCompat.getDrawable(this, R.drawable.boder_option)
        }
    }

    fun setQuestionInfo(){

    }

    fun setSelectedOptionView(optionSelected: Int){

    }

    fun getViewById() {
        mProgressBar = findViewById(R.id.progress_horizontal)
        mTvProgressBar = findViewById(R.id.tv_progressbar)
        mTvOption1 = findViewById(R.id.tv_option1)
        mTvOption2 = findViewById(R.id.tv_option2)
        mTvOption3 = findViewById(R.id.tv_option3)
        mTvOption4 = findViewById(R.id.tv_option4)
        mBtnSubmit = findViewById(R.id.btn_submit)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

        }
    }
}