package com.jans.missing.json.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.jans.missing.json.app.testModel.Bilder

class ImagesAdapter(private val list: List<Bilder>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holder: RecyclerView.ViewHolder

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.images_item, parent, false)
        holder = ImageViewHolder(view)

        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as ImageViewHolder
        val context = holder.itemView.context
        val item = list[position]

        Glide.with(context)
            .load(item.url)
            .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
            .into(holder.imgView)

        Glide
            .with(context)
            .load(item.url)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imgView);
    }

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgView: ImageView = itemView.findViewById(R.id.image)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
