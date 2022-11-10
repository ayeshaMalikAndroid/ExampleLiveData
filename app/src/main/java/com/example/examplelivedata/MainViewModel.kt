package com.example.examplelivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {

   private  val _nameLiveDataObject = MutableLiveData<String>("Ayesha")

//publicily expose livedata and otherone can change the value
    val nameLiveData:LiveData<String>
    get() = _nameLiveDataObject
    fun updateData(){
        //use value property to update livedata
        _nameLiveDataObject.value = "Another name"
    }
}