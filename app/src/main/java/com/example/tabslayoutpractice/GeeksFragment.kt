package com.example.tabslayoutpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.tabslayoutpractice.R

class GeeksFragment : Fragment() {
    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        inflater.inflate(R.layout.fragment_geeks, container, false)!!
}
