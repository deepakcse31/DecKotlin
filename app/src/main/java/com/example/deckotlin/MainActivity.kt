package com.example.deckotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val user_id : String="123"
    var nmae="Android"
    lateinit var editName: EditText
    lateinit var edtPassword : EditText
    lateinit var btnSubmit : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        editName=findViewById(R.id.edtmobileno)
        edtPassword=findViewById(R.id.edtpassword)
        btnSubmit=findViewById(R.id.btnsubmit)
        GlobalScope.launch {


        }
        btnSubmit.setOnClickListener {

            Toast.makeText(applicationContext,editName.text.toString()+"password "+edtPassword.text.toString(),Toast.LENGTH_LONG).show()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}