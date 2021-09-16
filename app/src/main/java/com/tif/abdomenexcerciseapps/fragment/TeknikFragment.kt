package com.tif.abdomenexcerciseapps.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tif.abdomenexcerciseapps.R
import com.tif.abdomenexcerciseapps.activity.TeknikActivity
import kotlinx.android.synthetic.main.fragment_teknik.*


class TeknikFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teknik, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        passingData()
    }

    private fun passingData() {
        card1.setOnClickListener {
            activity?.let {
                val intent = Intent(it, TeknikActivity::class.java)
                intent.putExtra("data1", "gerakan1")
                it.startActivity(intent)
            }
        }
        card2.setOnClickListener {
            activity?.let {
                val intent = Intent(it, TeknikActivity::class.java)
                intent.putExtra("data1", "gerakan2")
                it.startActivity(intent)
            }
        }
        card3.setOnClickListener {
            activity?.let {
                val intent = Intent(it, TeknikActivity::class.java)
                intent.putExtra("data1", "gerakan3")
                it.startActivity(intent)
            }
        }
        card4.setOnClickListener {
            activity?.let {
                val intent = Intent(it, TeknikActivity::class.java)
                intent.putExtra("data1", "gerakan4")
                it.startActivity(intent)
            }
        }
        card5.setOnClickListener {
            activity?.let {
                val intent = Intent(it, TeknikActivity::class.java)
                intent.putExtra("data1", "gerakan5")
                it.startActivity(intent)
            }
        }
        card6.setOnClickListener {
            activity?.let {
                val intent = Intent(it, TeknikActivity::class.java)
                intent.putExtra("data1", "gerakan6")
                it.startActivity(intent)
            }
        }
    }

}