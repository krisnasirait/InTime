package com.kingtech.intime.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity
data class Task(
    @PrimaryKey(autoGenerate = false)
    var id: Int?,
    var title: String?,
    var desc: String,
) : Parcelable