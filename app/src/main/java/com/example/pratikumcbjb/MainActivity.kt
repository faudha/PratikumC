package com.example.pratikumcbjb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.app.AlertDialog
import android.app.Dialog
import android.widget.EditText
import android.widget.Toast.makeText as toastMakeText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val textView1=findViewById<TextView>(R.id.textview1)
        //val button1=findViewById<Button>(R.id.button1)

        textview1.setOnClickListener {
            Toast.makeText(this, "Hai", Toast.LENGTH_SHORT).show()
        }

        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, HitungActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            val editUser = EditText(this)
            alert.setTitle("Username")
            alert.setMessage("HAI...")
            alert.setView(editUser)

           alert.setPositiveButton("YES"){dialog, which ->

               var username = editUser.text.toString()
               val intent = Intent(this@MainActivity, GameActivity::class.java)
               intent.putExtra(GameActivity.EXTRA_USER,username)
               startActivity(intent)
           }
            alert.setNegativeButton("No"){dialog, which ->  

            }

            alert.show()
        }

        btSecondActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("nama", "NAMA : FAUDHA NUR SIDIQ M.")
            intent.putExtra("npm", "NPM. 19630347")
            intent.putExtra("kelas", "KELAS. C Non Reg Banjarbaru")
            startActivity(intent)
        }

    }
}
