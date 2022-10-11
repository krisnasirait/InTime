package com.kingtech.intime.data

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Task::class.java],
    version = 1
)
abstract class TaskDatabase() : RoomDatabase() {

}