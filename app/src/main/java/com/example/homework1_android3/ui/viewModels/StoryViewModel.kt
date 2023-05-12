package com.example.homework1_android3.ui.viewModels

import android.widget.Button
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class StoryViewModel: ViewModel() {


    fun visible(button: Button, recyclerView: RecyclerView){
        button.isGone = true
        recyclerView.isVisible = true
    }

}