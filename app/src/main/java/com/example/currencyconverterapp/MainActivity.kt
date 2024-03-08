package com.example.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declaring Variables (Widgets)
    lateinit var titleTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var editText: EditText
    lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Initializing Widgets
        titleTextView = findViewById(R.id.textView)
        resultTextView = findViewById(R.id.resultText)
        editText = findViewById(R.id.editText)
        convertButton = findViewById(R.id.convertBTN)

        convertButton.setOnClickListener{
            // Code to be executed when the button is click!
            var enteredUSD:String = editText.text.toString()
            var enteredUSDdouble: Double = enteredUSD.toDouble()

            // make the conversion from usd to euro
            var euros = makeConversion(enteredUSDdouble)


            //display the conversion in euros
            resultTextView.text = euros.toString() + "Euros"
        }
    }
    fun makeConversion(usd:Double):Double{
        // var euros: Double = usd*0.94
        return usd*0.94
    }

}

