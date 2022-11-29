package com.example.pert4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun pindahPage(view: View){
        val intent = Intent(this, ListMovie::class.java).apply {
            // putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}