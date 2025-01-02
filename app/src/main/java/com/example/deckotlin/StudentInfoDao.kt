package com.example.deckotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentInfoDao {
    @Insert
    suspend fun insert(studentInfoData: StudentInfoData)
    @Query("SELECT * FROM student_info")
    suspend fun getAll() : List<StudentInfoData>
}