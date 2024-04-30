package com.example.icetask4

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MultiplicationTables : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multiplication_tables)

        // get the table number from the bundle
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        // convert the table number to an integer that is non-nullable
        val tableNumber = tableString!!.toInt()

        // display the heading so we can see the value in action
        val multiplicationTable = findViewById<TextView>(
            R.id.multiplicationTableTextView)

        // start with the heading and add two new lines
        var tableDisplay = "$tableNumber x table\n\n"

       // loop 10 times and keep adding to the string

       // set the string onto the display
        multiplicationTable.text = tableDisplay


            // declare the control variable
            var counter = 1
            while (counter <= 10) { // check the control variable
                // skip 3
                if (counter == 3) {
                    counter++
                    continue
                }
                val answer = tableNumber * counter
                tableDisplay += "$tableNumber x $counter = ${answer}\n"
                counter++ //update the control variable

            }
        }
    }