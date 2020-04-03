package com.ericchee.jackbottv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private val randomNumber = Random.nextInt(1000, 10000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tvGameCode = findViewById<TextView>(R.id.tvGameCode)
        tvGameCode.text = randomNumber.toString()

        btnCancel.setOnClickListener { btnCancel: View ->
            etCodeInput.text.clear()
        }
    }

    fun submitClicked(view: View) {
        val etCodeInput = findViewById<EditText>(R.id.etCodeInput)
        val userInputtedCode = etCodeInput.text.toString()

        if (userInputtedCode == randomNumber.toString()) {
            Toast.makeText(this, "[Name]: You're in!!!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "GG no re", Toast.LENGTH_SHORT).show()
        }
    }
}
