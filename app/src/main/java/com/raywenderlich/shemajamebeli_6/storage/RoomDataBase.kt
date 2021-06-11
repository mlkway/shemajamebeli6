package com.raywenderlich.shemajamebeli_6.storage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DataForRoom::class], version = 1)
abstract class RoomDataBase: RoomDatabase() {
    abstract fun Dao(): Dao
}