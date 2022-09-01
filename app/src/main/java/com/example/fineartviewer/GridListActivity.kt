package com.example.fineartviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fineartviewer.adapter.ArtCardAdapter
import com.example.fineartviewer.const.Layout
import com.example.fineartviewer.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = ArtCardAdapter(
            Layout.GRID
        )
        binding.gridRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}