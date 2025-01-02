package com.example.deckotlin.DBUtils

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.deckotlin.StudentInfoDao
import com.example.deckotlin.StudentInfoData

@Database(entities = [StudentInfoData::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun studentInfoDao() : StudentInfoDao
}