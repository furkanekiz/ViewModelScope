package com.furkanekiz.viewmodelscope

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.furkanekiz.viewmodelscope.model.User
import com.furkanekiz.viewmodelscope.model.UserRepository
import kotlinx.coroutines.*

class ACMainViewModel : ViewModel() {
    private var userRepository = UserRepository()

    var users = liveData(Dispatchers.IO) {
        val result = userRepository.getUsers()
        emit(result)
    }

    /*var users: MutableLiveData<List<User>?> = MutableLiveData()

    fun getUserData() {
        viewModelScope.launch {
            var result: List<User>?
            withContext(Dispatchers.IO) {
                result = userRepository.getUsers()
            }
            users.value = result
        }
    }*/


}