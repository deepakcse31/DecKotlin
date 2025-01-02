package com.example.deckotlin

import android.app.Application
import androidx.room.Room
import com.example.deckotlin.DBUtils.AppDatabase

class MyApp : Application() {

    companion object{
        lateinit var database : AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database=Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "my_db"
        ).build()


    }
}