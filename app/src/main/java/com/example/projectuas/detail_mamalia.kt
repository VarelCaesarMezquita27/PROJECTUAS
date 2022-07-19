package com.example.projectuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail_mamalia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_mamalia)

        supportActionBar?.title = "Biodata Lengkap mamalia"

        val namakota = intent.getParcelableExtra<mamalia>(MainActivity.INTENT_PARCELABLE)

        val imgmamalia = findViewById<ImageView>(R.id.img_item_photo)
        val namemamalia = findViewById<TextView>(R.id.tv_item_name)
        val descmamalia = findViewById<TextView>(R.id.tv_item_description)
        val desc2mamalia = findViewById<TextView>(R.id.tv_item_description2)

        imgmamalia.setImageResource(namakota?.imgmamalia!!)
        namemamalia.text = namakota.namemamalia
        descmamalia.text = namakota.descmamalia
        desc2mamalia.text = namakota.desc2mamalia
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }

}