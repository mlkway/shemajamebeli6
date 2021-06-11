package com.raywenderlich.shemajamebeli_6.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.shemajamebeli_6.data.Movie
import com.raywenderlich.shemajamebeli_6.data.Results
import com.raywenderlich.shemajamebeli_6.network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ScreenViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Results>>()

    val items: LiveData<List<Results>> get() = _items

     fun load(){
         viewModelScope.launch {
             val data = withContext(Dispatchers.IO){
                 ApiService.movieService.getMovie("popular")

             }
             _items.postValue(data.body()?.results!!)
         }
     }

}