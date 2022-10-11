package com.kingtech.intime.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize



@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    var id: Long?,
    var title: String?,
    var desc: String,
)