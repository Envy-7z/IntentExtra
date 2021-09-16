package com.tif.abdomenexcerciseapps.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tif.abdomenexcerciseapps.R
import kotlinx.android.synthetic.main.activity_pengetahuan.*

class PengetahuanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengetahuan)
        loadPdf()
    }

    private fun loadPdf(){
        if(intent.extras != null){
            val data = intent.getStringExtra("data1")
            if (data == "page1"){
                pdfView.fromAsset("page1.pdf")
                    .pages(0, 1, 2, 3, 4, 5,6,7,8,9) // all pages are displayed by default
                    .enableSwipe(true) // allows to block changing pages using swipe
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .defaultPage(0)
                    .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                    .password(null)
                    .scrollHandle(null)
                    .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                    .spacing(0)
                    .load()
            }
            else if (data == "page2"){
                pdfView.fromAsset("page2.pdf")
                    .pages(0, 1, 2, 3, 4, 5,6,7,8,9) // all pages are displayed by default
                    .enableSwipe(true) // allows to block changing pages using swipe
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .defaultPage(0)
                    .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                    .password(null)
                    .scrollHandle(null)
                    .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                    .spacing(0)
                    .load()
            }
            else if (data == "page3"){
                pdfView.fromAsset("page3.pdf")
                    .pages(0, 1, 2, 3, 4, 5,6,7,8,9) // all pages are displayed by default
                    .enableSwipe(true) // allows to block changing pages using swipe
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .defaultPage(0)
                    .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                    .password(null)
                    .scrollHandle(null)
                    .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                    .spacing(0)
                    .load()
            }
            else if (data == "page4"){
                pdfView.fromAsset("page4.pdf")
                    .pages(0, 1, 2, 3, 4, 5,6,7,8,9) // all pages are displayed by default
                    .enableSwipe(true) // allows to block changing pages using swipe
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .defaultPage(0)
                    .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                    .password(null)
                    .scrollHandle(null)
                    .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                    .spacing(0)
                    .load()
            }
        }

    }
}