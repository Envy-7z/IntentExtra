package com.tif.abdomenexcerciseapps.activity

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.tif.abdomenexcerciseapps.R
import kotlinx.android.synthetic.main.activity_teknik_video.*

class TeknikVideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teknik_video)
        back.setOnClickListener {
            finish()
        }
        getVideo()

    }

    private fun getVideo(){
        if(intent.extras != null){
            val data = intent.getStringExtra("data1")
            if (data == "gerakan1"){
                tvName.setText("Gerakan 1")
                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoView)
                val uri: Uri =
                    parse("android.resource://" + packageName + "/" + R.raw.gerakan1)
                videoView.setMediaController(mediaController)
                videoView.setVideoURI(uri)
                videoView.requestFocus()
                videoView.start()
            }
            else if(data == "gerakan2"){
                tvName.setText("Gerakan 2")
                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoView)
                val uri: Uri =
                    parse("android.resource://" + packageName + "/" + R.raw.gerakan2)
                videoView.setMediaController(mediaController)
                videoView.setVideoURI(uri)
                videoView.requestFocus()
                videoView.start()
            }
            else if(data == "gerakan3"){
                tvName.setText("Gerakan 3")
                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoView)
                val uri: Uri =
                    parse("android.resource://" + packageName + "/" + R.raw.gerakan3)
                videoView.setMediaController(mediaController)
                videoView.setVideoURI(uri)
                videoView.requestFocus()
                videoView.start()
            }
            else if(data == "gerakan4"){
                tvName.setText("Gerakan 4")
                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoView)
                val uri: Uri =
                    parse("android.resource://" + packageName + "/" + R.raw.gerakan4)
                videoView.setMediaController(mediaController)
                videoView.setVideoURI(uri)
                videoView.requestFocus()
                videoView.start()
            }
            else if(data == "gerakan5"){
                tvName.setText("Gerakan 5")
                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoView)
                val uri: Uri =
                    parse("android.resource://" + packageName + "/" + R.raw.gerakan5)
                videoView.setMediaController(mediaController)
                videoView.setVideoURI(uri)
                videoView.requestFocus()
                videoView.start()
            }
            else if(data == "gerakan6"){
                tvName.setText("Gerakan 6")
                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoView)
                val uri: Uri =
                    parse("android.resource://" + packageName + "/" + R.raw.gerakan6)
                videoView.setMediaController(mediaController)
                videoView.setVideoURI(uri)
                videoView.requestFocus()
                videoView.start()
            }
        }
    }
}