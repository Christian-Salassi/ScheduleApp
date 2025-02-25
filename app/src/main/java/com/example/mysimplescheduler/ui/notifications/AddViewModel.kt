package com.example.mysimplescheduler.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Add an item to your schedule:"
    }
    val text: LiveData<String> = _text
}