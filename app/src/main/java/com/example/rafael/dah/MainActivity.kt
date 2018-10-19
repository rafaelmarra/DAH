package com.example.rafael.dah

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    val diceSelector = DiceSelector()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    fun initViews(){
        val btnD20 = findViewById<Button>(R.id.btn_d20)
        val btnD4 = findViewById<Button>(R.id.btn_d4)
        val btnD8 = findViewById<Button>(R.id.btn_d8)
        val btnD10 = findViewById<Button>(R.id.btn_d10)
        val btnD12 = findViewById<Button>(R.id.btn_d12)
        val btnDPercent = findViewById<Button>(R.id.btn_dPercent)
    }
}
