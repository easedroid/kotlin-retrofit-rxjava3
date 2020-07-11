package com.networklibrary.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.networklibrary.R

class SampleFragment : Fragment() {

    companion object {
        fun newInstance() = SampleFragment()
    }

    private lateinit var viewModel: SampleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sample_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(viewModelStore, defaultViewModelProviderFactory).get(SampleViewModel::class.java)
    }

}