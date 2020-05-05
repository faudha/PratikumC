package com.example.pratikumcbjb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hitung.*

class HitungActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        buttonHitung.setOnClickListener {
            var isEmptyField = false

            val stringPanjang = editPanjang.text.toString().trim()
            val stringLebar = editPanjang.text.toString().trim()
            val stringTinggi = editPanjang.text.toString().trim()

            if (stringPanjang.equals("")){
                isEmptyField = true
                editPanjang.error="Data Kosong"
            }
            if (stringLebar.isEmpty()){
                isEmptyField = true
                editLebar.error="Data Kosong"
            }
            if (stringTinggi.equals("")){
                isEmptyField = true
                editTinggi.error="Data Kosong"
            }
            if (!isEmptyField) {

                val panjang = stringPanjang.toFloat()
                val lebar = stringLebar.toFloat()
                val tinggi = stringTinggi.toFloat()

                textHasil.text = (panjang * lebar * tinggi).toString()
            }
            
        }
    }
}
