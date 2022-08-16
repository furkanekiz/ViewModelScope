package com.furkanekiz.viewmodelscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider

class ACMain : AppCompatActivity() {

    private lateinit var acMainViewModel: ACMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_main)

        acMainViewModel = ViewModelProvider(this)[(ACMainViewModel::class.java)]
        //acMainViewModel.getUserData()
        acMainViewModel.users.observe(this) {myUsers->
            myUsers?.forEach {
                Log.i("MyTag","name is ${it.name}")
            }

        }
    }
}