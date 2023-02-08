package com.my1.demo.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }

    private val _Btntext = MutableLiveData<String>().apply {
        value = "This is Button"
    }

    val text: LiveData<String> = _text
    val Btntext: LiveData<String> = _Btntext
}