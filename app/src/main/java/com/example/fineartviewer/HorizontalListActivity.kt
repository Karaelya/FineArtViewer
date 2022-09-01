package com.example.fineartviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fineartviewer.adapter.ArtCardAdapter
import com.example.fineartviewer.const.Layout
import com.example.fineartviewer.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = ArtCardAdapter(
            Layout.HORIZONTAL
        )

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}