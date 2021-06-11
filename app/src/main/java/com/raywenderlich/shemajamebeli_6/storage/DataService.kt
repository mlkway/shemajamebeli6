package com.raywenderlich.shemajamebeli_6.storage

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Room
import androidx.room.RoomDatabase
import java.lang.RuntimeException

object DataService {

    private var dataBase: RoomDataBase? = null

    val db get() = dataBase ?: throw RuntimeException("not initialized")

    fun initialize(context: Context){
        dataBase = Room.databaseBuilder(context,RoomDataBase::class.java,"data").build()
    }


}