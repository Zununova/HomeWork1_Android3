package com.example.homework1_android3.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework1_android3.databinding.FragmentStoryBinding
import com.example.homework1_android3.ui.adapters.StoryAdapter
import com.example.homework1_android3.ui.datas.StoryData
import com.example.homework1_android3.ui.models.Model
import com.example.homework1_android3.ui.viewModels.StoryViewModel

class StoryFragment : Fragment() {

    private lateinit var binding: FragmentStoryBinding
    private val storyAdapter = StoryAdapter(this::onItemClick)
    private val storyViewModel = StoryViewModel()

    private fun onItemClick(model: Model) {
        findNavController().navigate(
            StoryFragmentDirections.actionStoryFragmentToDetilStoryFragment(
                model
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setData()
        setUpListener()
    }

    private fun initialize() {
        binding.storyRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = storyAdapter
        }
    }

    private fun setData() {
        val storyData = StoryData()
        storyAdapter.setText(storyData.setList())
    }

    private fun setUpListener() {
        with(binding) {
            buttonShowRecyclerView.setOnClickListener {
                storyViewModel.visible(buttonShowRecyclerView, storyRecyclerView)
            }
        }

    }

}