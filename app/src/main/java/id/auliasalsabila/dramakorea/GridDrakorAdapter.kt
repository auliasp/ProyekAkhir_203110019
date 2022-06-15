package id.auliasalsabila.dramakorea

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridDrakorAdapter(val listDrakor: ArrayList<Drakor>) :
    RecyclerView.Adapter<GridDrakorAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: ListDrakorAdapter.OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_grid_drakor, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listDrakor[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listDrakor[holder.adapterPosition]) }

    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Drakor)
    }
    override fun getItemCount(): Int {
        return listDrakor.size
    }
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}
