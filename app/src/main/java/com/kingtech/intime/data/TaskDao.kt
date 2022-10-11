package com.kingtech.intime.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface TaskDao {

    @Insert
    suspend fun insertTask(task: Task): Long

    @Query("SELECT * FROM Task WHERE isFinished == 0")
    fun getTask(): LiveData<List<Task>>

    @Query("UPDATE Task SET isFinished = 1 where id=:uid")
    fun finishTask(uid: Long)

    @Query("DELETE FROM Task WHERE id=:uid")
    fun deleteTask(uid: Long)


}