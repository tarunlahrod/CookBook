package com.example.cookbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMoveAhead: Button? = findViewById(R.id.btnMoveAhead)

        btnMoveAhead?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                // move to next screen
                startActivity(Intent(this@MainActivity, HomeActivity::class.java))
            }
        })
    }
}