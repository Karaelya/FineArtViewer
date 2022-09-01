package com.example.fineartviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fineartviewer.adapter.ArtCardAdapter
import com.example.fineartviewer.const.Layout
import com.example.fineartviewer.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = ArtCardAdapter(
            Layout.VERTICAL
        )
        binding.verticalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}