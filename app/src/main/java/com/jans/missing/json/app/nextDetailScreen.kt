package com.jans.missing.json.app

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jans.missing.json.app.testModel.Item

class nextDetailScreen() : AppCompatActivity() {

    lateinit var rvImages: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_detail_screen)

        rvImages = findViewById(R.id.rvPhotos)

        val receivedModel = intent.getSerializableExtra("MY_MODEL_EXTRA") as? Item

        Log.d("tag123",receivedModel!!.bilder.toString())


        rvImages.layoutManager = LinearLayoutManager(this)
        rvImages.adapter = ImagesAdapter(receivedModel.bilder)


    }
}