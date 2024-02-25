package com.jans.missing.json.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.jans.missing.json.app.testModel.class1
import java.io.InputStream

class MainActivity : AppCompatActivity() {


    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.idShowData)
        val jsonString = readJsonFile(R.raw.json_file)
        val modelClass: class1 = Gson().fromJson(jsonString,class1::class.java)
        val list = modelClass.items!!


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = JsonAdapter(list)


    }


    private fun readJsonFile(rawResourceId: Int): String {
        val inputStream: InputStream = resources.openRawResource(rawResourceId)
        return inputStream.bufferedReader().use { it.readText() }
    }


}