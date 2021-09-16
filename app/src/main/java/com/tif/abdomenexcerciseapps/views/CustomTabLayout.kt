package com.tif.abdomenexcerciseapps.views

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.widget.TextViewCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tif.abdomenexcerciseapps.R

class CustomTabLayout : TabLayout {
    private val mTitles: MutableList<String> = arrayListOf()
    private var mUnselectedTypeFace: Typeface? = null

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    private fun init(context: Context?, attrs: AttributeSet?) {
        addOnTabSelectedListener()
    }

    private fun addOnTabSelectedListener() {
        addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: Tab?) {
            }

            override fun onTabUnselected(tab: Tab?) {
                val view = tab?.customView
                if (view is AppCompatTextView) {
                    view.typeface = mUnselectedTypeFace
                    view.setTextColor(Color.parseColor("#333333"))
                }
            }

            override fun onTabSelected(tab: Tab?) {
                val view = tab?.customView
                if (view is AppCompatTextView) {
                    view.setTextColor(Color.parseColor("#00B082"))
                }
            }
        })
    }

    override fun setupWithViewPager(viewPager: ViewPager?, autoRefresh: Boolean) {
        super.setupWithViewPager(viewPager, autoRefresh)
        addViews()
    }

    private fun addViews() {
        for (i in 0 until tabCount) {
            val tab = getTabAt(i)
            if (tab != null) {
                val customFontTextView = createCustomFontTextViewForTab()
                if (i == 0) {
                    if (mUnselectedTypeFace == null) {
                        mUnselectedTypeFace = customFontTextView.typeface
                    }
                    customFontTextView.typeface = customFontTextView.typeface
                    customFontTextView.setTextColor(Color.parseColor("#00B082"))
                }
                tab.customView = customFontTextView
            }
        }
    }

    private fun createCustomFontTextViewForTab(): AppCompatTextView {
        val customFontTextView = AppCompatTextView(context)
        customFontTextView.gravity = Gravity.CENTER
        TextViewCompat.setTextAppearance(customFontTextView, R.style.TabTitleStyle)

        val typeface = Typeface.createFromAsset(resources.assets, "fonts/Lato-Semibold.ttf")
        customFontTextView.typeface = typeface

        return customFontTextView
    }

    fun setTitlesAtTabs(titles: List<String>?) {
        if (titles == null || titles.size < tabCount) {
            return
        }
        if (this.mTitles.size > 0) {
            this.mTitles.clear()
        }
        this.mTitles.addAll(titles)
        for (i in 0 until tabCount) {
            val tab = getTabAt(i)
            if (tab != null) {
                val view = tab.customView
                if (view is AppCompatTextView) {
                    view.text = mTitles[i]
                }
            }
        }
    }
}