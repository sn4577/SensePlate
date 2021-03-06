package com.example.senseplate.ui.social

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.senseplate.R

class SocialFragment : Fragment() {

    private lateinit var socialViewModel: SocialViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        socialViewModel =
            ViewModelProviders.of(this).get(SocialViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_social, container, false)
        val textView: TextView = root.findViewById(R.id.text_social)
        socialViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}