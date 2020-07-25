package com.example.lesson11

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DataClass(
    val id:Int,
    val title:String
):Parcelable