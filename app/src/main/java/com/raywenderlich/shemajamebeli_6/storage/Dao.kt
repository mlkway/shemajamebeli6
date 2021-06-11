package com.raywenderlich.shemajamebeli_6.storage

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface Dao {


    @Query("SELECT * FROM DataForRoom")
    suspend fun getAll(): List<DataForRoom>

    @Delete
    suspend fun delete(dataForRoom: DataForRoom)

    @Insert
    suspend fun inserData(vararg dataForRoom: DataForRoom)


}