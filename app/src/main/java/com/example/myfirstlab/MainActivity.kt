package com.example.myfirstlab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputEditor = findViewById(R.id.editTextTextPersonName) as EditText
        val textView = findViewById(R.id.textView) as TextView
        val Button = findViewById<Button>(R.id.button2)

        Button.setOnClickListener { }
        val numsEx = NumbersExercise()
        textView.setText(numsEx.numbers.joinToString())
        Button.setOnClickListener {
            textView.setText(numsEx.numbers.joinToString())
            val text = inputEditor.text.toString().toInt()
            val number = text.toInt()
            val result = numsEx.lessThan(number).toString()
            val str = numsEx.numbers.joinToString() + "\n" + result
            textView.setText(str)
        }
    }
    }




