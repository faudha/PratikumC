package com.example.pratikumcbjb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText as toastMakeText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1=findViewById<TextView>(R.id.textview1)
        textView1.setOnClickListener({
            Toast.makeText(this, "Hai", Toast.LENGTH_SHORT).show()
        })
    }
}
