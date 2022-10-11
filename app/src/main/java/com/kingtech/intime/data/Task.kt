package com.kingtech.intime.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize



@Entity
@Parcelize
data class Task(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    @ColumnInfo(name = "title")
    var title: String?,
    @ColumnInfo(name = "desc")
    var desc: String,
) : Parcelable