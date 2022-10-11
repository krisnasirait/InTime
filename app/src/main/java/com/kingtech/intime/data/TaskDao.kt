package com.kingtech.intime.data


import androidx.room.*
import androidx.room.OnConflictStrategy.Companion.REPLACE


@Dao
interface TaskDao {

    @Query("SELECT * FROM Task")
    fun getAllTask(): List<Task>

    @Insert(onConflict = REPLACE)
    fun insertTask(task: Task): Long

    @Update
    fun updateTask(task: Task): Int

    @Delete
    fun deleteTask(task: Task): Int

}