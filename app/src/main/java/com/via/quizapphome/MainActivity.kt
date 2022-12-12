package com.via.quizapphome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var btnStart: Button? = null
    var etName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btn_start)
        etName = findViewById(R.id.et_name)
        btnStart?.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            if (etName!!.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_LONG).show()
            } else {
                intent.putExtra(Constants.USER_NAME, etName?.text)
                startActivity(intent)
            }
        }

    }
}