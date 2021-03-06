package com.example.senseplate.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.senseplate.AddActivity
import com.example.senseplate.DActivity
import com.example.senseplate.R


class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        val btn: Button = root.findViewById(R.id.bf)
        val btnn: Button = root.findViewById(R.id.lun)
        val btnnn: Button = root.findViewById(R.id.dn)
        val btn1: Button = root.findViewById(R.id.date)



        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })
        btn.setOnClickListener {
            val intent = Intent(getActivity(),AddActivity::class.java)
            intent.putExtra("MealType","Breakfast")
            startActivity(intent)
        }
        btnn.setOnClickListener {
            val intent = Intent(getActivity(),AddActivity::class.java)
            intent.putExtra("MealType","Lunch")
            startActivity(intent)
        }
        btnnn.setOnClickListener {
            val intent = Intent(getActivity(),AddActivity::class.java)
            intent.putExtra("MealType","Dinner")
            startActivity(intent)
        }
        btn1.setOnClickListener {
            val intent = Intent(getActivity(), DActivity::class.java)
            startActivity(intent)
        }


        return root
    }
}