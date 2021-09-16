package com.tif.abdomenexcerciseapps.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tif.abdomenexcerciseapps.R
import com.tif.abdomenexcerciseapps.fragment.BlankFragment
import com.tif.abdomenexcerciseapps.fragment.TeknikFragment
import com.tif.abdomenexcerciseapps.views.CustomTabLayout
import com.tif.abdomenexcerciseapps.views.TabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private val pengatahuanFragment = BlankFragment()
    private val teknikFragment = TeknikFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<CustomTabLayout>(R.id.tab_layout)
        val adapter = TabAdapter(supportFragmentManager)
        adapter.addFragment(pengatahuanFragment, getString(R.string.pengatahuan))
        adapter.addFragment(teknikFragment, getString(R.string.teknik))

        tabLayout.tabMode = TabLayout.MODE_FIXED


        viewPager = findViewById(R.id.pager)
        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = 2
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setTitlesAtTabs(adapter.getAllPageTitle())

        info.setOnClickListener {
            startActivity(Intent(this,InfoActivity::class.java))
        }
    }

    fun selectPage(pageIndex: Int) {
        tab_layout.setScrollPosition(pageIndex, 0f, true)
        viewPager.currentItem = pageIndex
    }
}