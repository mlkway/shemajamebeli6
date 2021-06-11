package com.raywenderlich.shemajamebeli_6.storage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataForRoom(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    val title: String,
    val description: String,
    val img: String
) { constructor(title: String, description: String, img: String):this(0,title,description,img)
}