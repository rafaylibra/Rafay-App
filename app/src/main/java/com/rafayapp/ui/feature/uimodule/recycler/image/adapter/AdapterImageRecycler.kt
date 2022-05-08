package com.rafayapp.ui.feature.uimodule.recycler.image.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rafayapp.R
import com.rafayapp.data.Brand
import com.rafayapp.databinding.ItemImageRecyclerBinding
import com.rafayapp.util.GlideUtil

class AdapterImageRecycler(
    private val context: Context,
    private val data: ArrayList<Brand>
) : RecyclerView.Adapter<AdapterImageRecycler.BasicViewHolder>() {

    lateinit var bind: ItemImageRecyclerBinding

    override fun onBindViewHolder(holder: BasicViewHolder, position: Int) {
        val item = data[position]
        updateUI(holder, item, position)
        clickListeners(holder, item, position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicViewHolder {
        val v = parent.inflate(R.layout.item_image_recycler, false)
        bind = ItemImageRecyclerBinding.bind(v)
        return BasicViewHolder(v)
    }
    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
    override fun getItemCount(): Int {
        return data.size
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getItemViewType(position: Int): Int {
        return position
    }
    //______________________________________________________________________________________________
    private fun updateUI(holder: BasicViewHolder, item: Brand, position: Int) {
        bind.name.text = item.name
        bind.rating.text = item.rating.toString()
        bind.cashbacktxt.text = "Cashback"
        bind.ratinigicon.setImageResource(R.drawable.ratingicon)
        bind.cahbackicon.setImageResource(R.drawable.cashbackicon)

        //GlideUtil.setImage(bind.storeimg, "https://raw.githubusercontent.com/rafaylibra/Server/main/image/foodpanda/cities/Faisalabad.jpg")

        when(position){
             0 -> {
             bind.cashback.text = "400RS"
             bind.storeimg.setImageResource(R.drawable.apple)
             }

            1 -> {
                bind.cashback.text = "500Rs"
                bind.storeimg.setImageResource(R.drawable.bagallery)
            }

            2 -> {
                bind.cashback.text = "1000Rs"
                bind.storeimg.setImageResource(R.drawable.elo)
            }

            3 -> {
                bind.cashback.text = "800Rs"
                bind.storeimg.setImageResource(R.drawable.jomo)
            }

            4 -> {
                bind.cashback.text = "300Rs"
                bind.storeimg.setImageResource(R.drawable.omg)
            }

            5 -> {
                bind.cashback.text = "200Rs"
                bind.storeimg.setImageResource(R.drawable.khazany)
            }

            6 -> {
                bind.cashback.text = "500Rs"
                bind.storeimg.setImageResource(R.drawable.optp)
            }

            7 -> {
                bind.cashback.text = "400Rs"
                bind.storeimg.setImageResource(R.drawable.saya)
            }
        }




//--------------------------------------------------------------for Image View
//        if(position == 0)
//            bind.image.setImageResource(R.drawable.andoid)
//        else if(position == 1)
//            bind.image.setImageResource(android.R.drawable.arrow_down_float)

//        when(position) {
//            0 -> {
//                bind.image.setImageResource(R.drawable.andoid)
//            }
//
//            1 -> {
//                //bind.image.setBackgroundColor(ContextCompat.getColor(context, R.color.black))
//                //bind.image.setBackgroundColor(context.resources.getColor(R.color.black))
//                //GlideUtil.setImage(bind.image, "https://upload.wikimedia.org/wikipedia/en/thumb/5/5f/TomandJerryTitleCardc.jpg/220px-TomandJerryTitleCardc.jpg")
//            }
//            2 -> bind.image.setImageResource(R.drawable.andoid)
//            3 -> bind.image.setImageResource(R.drawable.andoid)
//            4 -> bind.image.setImageResource(R.drawable.andoid)
//            5 -> bind.image.setImageResource(R.drawable.andoid)
//            6 -> bind.image.setImageResource(R.drawable.andoid)
//            7 -> bind.image.setImageResource(R.drawable.andoid)
//        }
// ------------------------------------------------------------------------

    }

    private fun clickListeners(holder: BasicViewHolder, item: Brand, position: Int) {
        bind.name.setOnClickListener {
            Toast.makeText(context, item.name, Toast.LENGTH_SHORT).show()

        }

    }

    inner class BasicViewHolder(v: View) : RecyclerView.ViewHolder(v)
}