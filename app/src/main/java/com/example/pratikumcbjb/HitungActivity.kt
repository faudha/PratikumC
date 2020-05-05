package com.example.pratikumcbjb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hitung.*

class HitungActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        buttonHitung.setOnClickListener {
            val panjang=editPanjang.text.toString().trim().toFloat()
            val lebar=editLebar.text.toString().trim().toFloat()
            val tinggi=editTinggi.text.toString().trim().toFloat()

            textHasil.text=(panjang * lebar * tinggi).toString()


        }
    }
}
