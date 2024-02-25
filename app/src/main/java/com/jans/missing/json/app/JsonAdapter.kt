package com.jans.missing.json.app

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.jans.missing.json.app.testModel.Item
import java.io.Serializable

class JsonAdapter(private val list: List<Item>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holder: RecyclerView.ViewHolder

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        holder = JSONViewHolder(view)

        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as JSONViewHolder
        val context = holder.itemView.context
        val item = list[position]
        val title = item.bezeichnung

        holder.titleName.text = title
        holder.itemView.setOnClickListener {
            val intent = Intent(context,nextDetailScreen::class.java)
            intent.putExtra("MY_MODEL_EXTRA", item)
            context.startActivity(intent)
        }


    }

    class JSONViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleName: TextView = itemView.findViewById(R.id.titleName)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
