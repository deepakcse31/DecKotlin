package com.example.deckotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class StudentA : AppCompatActivity() {
    lateinit var userNa : EditText
    lateinit var useEnroll : EditText
    lateinit var btnSubmit : Button
    val db=MyApp.database
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_student2)
        userNa=findViewById(R.id.edtUseName)
        useEnroll=findViewById(R.id.edtenroll)
        btnSubmit=findViewById(R.id.btnSubmit1)

        btnSubmit.setOnClickListener{

            lifecycleScope.launch {
                db.studentInfoDao().insert(StudentInfoData(userName = userNa.text.toString(), enroll = useEnroll.text.toString()))
            }
            userNa.setText("")
            useEnroll.setText("")
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}