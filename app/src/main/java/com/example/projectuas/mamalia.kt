package com.example.projectuas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class mamalia(
    val imgmamalia: Int,
    val namemamalia: String,
    val descmamalia: String,
    val desc2mamalia: String,
):Parcelable
