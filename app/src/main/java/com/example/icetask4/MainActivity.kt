package com.example.icetask4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        multiplyButton.setOnClickListener {

            // create the explicit intent
            val intent = Intent(this, MultiplicationTables::class.java)
            val tableNumberEditText =
                findViewById<EditText>(R.id.tableNumberEditText)
            multiplyButton.setOnClickListener {

                // add the table number to the intent
                intent.putExtra(
                    "tableNumber",
                    tableNumberEditText.text.toString())
                // start the activity
                startActivity(intent)
            }
        }
    }
}