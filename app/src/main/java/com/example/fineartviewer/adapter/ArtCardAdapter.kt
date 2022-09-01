package com.example.fineartviewer.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fineartviewer.R
import com.example.fineartviewer.const.Layout.GRID
import com.example.fineartviewer.data.DataSource
import com.example.fineartviewer.model.Art

class ArtCardAdapter(
    private val layout: Int
) : RecyclerView.Adapter<ArtCardAdapter.ArtCardViewHolder>() {

    private val dataset: List<Art> = DataSource.art

    class ArtCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val artImage: ImageView = view.findViewById(R.id.art_image)
        val artTitle: TextView = view.findViewById(R.id.title_year)
        val artMedium: TextView = view.findViewById(R.id.medium)
        val artSize: TextView = view.findViewById(R.id.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtCardViewHolder {
        val layoutSave = when (layout) {
            GRID -> R.layout.grid_list_item
            else -> R.layout.vertical_horzontal_list_item
        }
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate((layoutSave), parent, false)

        return ArtCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ArtCardViewHolder, position: Int) {
        val art = dataset[position]
        holder.artImage.setImageResource(art.imageResourceId)
        holder.artTitle.text = art.title
        holder.artMedium.text = art.medium
        holder.artSize.text = art.size
    }
}