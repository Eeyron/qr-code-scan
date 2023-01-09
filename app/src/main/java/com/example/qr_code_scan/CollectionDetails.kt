package com.example.qr_code_scan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView


class CollectionDetails : AppCompatActivity() {

    private lateinit var name: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection_details)

        name = findViewById(R.id.userName)

        val i = intent
        val nameStr = i.getStringExtra("user_name-UUID")
        name.text = nameStr
    }
}