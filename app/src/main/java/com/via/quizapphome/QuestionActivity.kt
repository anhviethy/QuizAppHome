package com.via.quizapphome

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
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
    var mIvFlag: ImageView? = null
    var mBtnSubmit: Button? = null

    var mSelectedOption: Int = 0
    var mCurrentIdQuestion: Int = 1
    var mListQuestion: ArrayList<Question>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        mListQuestion = Constants.getQuestion()
        getViewById()
        setQuestionInfo()
        setDefaultOptionView()
        mTvOption1?.setOnClickListener(this)
        mTvOption2?.setOnClickListener(this)
        mTvOption3?.setOnClickListener(this)
        mTvOption4?.setOnClickListener(this)
    }

    private fun setDefaultOptionView() {
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

    private fun setQuestionInfo() {
        val curQuestion: Question = mListQuestion!!.get(mCurrentIdQuestion - 1)
        mIvFlag?.setImageResource(curQuestion.flag)
        mProgressBar?.progress = mCurrentIdQuestion
        mTvProgressBar?.text = "$mCurrentIdQuestion/${mListQuestion!!.size}"
        mTvOption1?.text = curQuestion.option1
        mTvOption2?.text = curQuestion.option2
        mTvOption3?.text = curQuestion.option3
        mTvOption4?.text = curQuestion.option4

        if (mCurrentIdQuestion == mListQuestion!!.size) {
            mBtnSubmit?.text = "FINNISH"
        } else {
            mBtnSubmit?.text = "SUBMIT"
        }
    }

    private fun setSelectedOptionView(optionSelected: Int, viewOption: TextView) {
        setDefaultOptionView()
        mSelectedOption = optionSelected
        viewOption.setTextColor(getColor(R.color.color_text_option))
        viewOption.setTypeface(viewOption.typeface, Typeface.BOLD)
        viewOption.background = ContextCompat.getDrawable(this, R.drawable.boder_selected_option)
    }

    private fun getViewById() {
        mProgressBar = findViewById(R.id.progress_horizontal)
        mTvProgressBar = findViewById(R.id.tv_progressbar)
        mIvFlag = findViewById(R.id.iv_flag)
        mTvOption1 = findViewById(R.id.tv_option1)
        mTvOption2 = findViewById(R.id.tv_option2)
        mTvOption3 = findViewById(R.id.tv_option3)
        mTvOption4 = findViewById(R.id.tv_option4)
        mBtnSubmit = findViewById(R.id.btn_submit)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option1 -> {
                mTvOption1?.let { setSelectedOptionView(1, it) }
            }

            R.id.tv_option2 -> {
                mTvOption2?.let { setSelectedOptionView(2, it) }
            }

            R.id.tv_option3 -> {
                mTvOption3?.let { setSelectedOptionView(3, it) }
            }

            R.id.tv_option4 -> {
                mTvOption4?.let { setSelectedOptionView(4, it) }
            }
        }
    }
}