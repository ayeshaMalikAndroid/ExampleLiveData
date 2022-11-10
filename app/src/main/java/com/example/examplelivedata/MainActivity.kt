package com.example.examplelivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var  mainViewModel: MainViewModel
    private val  updateText:TextView
    get() = findViewById(R.id.textView)
    private val update :Button
    get() = findViewById(R.id.update)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //first parameter:is lifecycleowner (basis of this check whether pass the data or not active state or not )
        mainViewModel.nameLiveData.observe(this, Observer {
          //set textview
            updateText.text = it

        } )
        update.setOnClickListener {
            //update the livedata on the click of btn
            mainViewModel.updateData()
        }
    }
}