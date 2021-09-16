package com.tif.abdomenexcerciseapps.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tif.abdomenexcerciseapps.activity.PengetahuanActivity
import com.tif.abdomenexcerciseapps.R
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        passingData()
    }

    private fun passingData() {
        card1.setOnClickListener {
            activity?.let {
                val intent = Intent(it, PengetahuanActivity::class.java)
                intent.putExtra("data1", "page1")
                it.startActivity(intent)
            }
        }
        card2.setOnClickListener {
            activity?.let {
                val intent = Intent(it, PengetahuanActivity::class.java)
                intent.putExtra("data1", "page2")
                it.startActivity(intent)
            }
        }
        card3.setOnClickListener {
            activity?.let {
                val intent = Intent(it, PengetahuanActivity::class.java)
                intent.putExtra("data1", "page3")
                it.startActivity(intent)
            }
        }
        card4.setOnClickListener {
            activity?.let {
                val intent = Intent(it, PengetahuanActivity::class.java)
                intent.putExtra("data1", "page4")
                it.startActivity(intent)
            }
        }
    }

}