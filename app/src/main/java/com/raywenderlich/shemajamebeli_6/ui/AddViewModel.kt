package com.raywenderlich.shemajamebeli_6.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.shemajamebeli_6.storage.DataForRoom
import com.raywenderlich.shemajamebeli_6.storage.DataService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddViewModel : ViewModel() {

    fun put(dataForRoom: DataForRoom){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                DataService.db.Dao().inserData(dataForRoom)
            }
        }
    }

}