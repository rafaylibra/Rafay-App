package com.rafayapp.ui.feature.uimodule.recycler.horizontal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.rafayapp.R
import com.rafayapp.databinding.ItemHorizontalRecyclerBinding

class AdapterHorizontalRecycler(
    private val context: Context,
    private val name: ArrayList<String>

    )
    : RecyclerView.Adapter<AdapterHorizontalRecycler.BasicViewHolder>() {

    lateinit var bind: ItemHorizontalRecyclerBinding

    override fun onBindViewHolder(holder: BasicViewHolder, position: Int) {
        val item = name[position]
        updateUI(holder, item, position)
        clickListeners(holder, item,  position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicViewHolder {
        val v = parent.inflate(R.layout.item_horizontal_recycler, false)
        bind = ItemHorizontalRecyclerBinding.bind(v)
        return BasicViewHolder(v)
    }
    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
    override fun getItemCount(): Int {
        return name.size
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getItemViewType(position: Int): Int {
        return position
    }

    //______________________________________________________________________________________________
    private fun updateUI(holder: BasicViewHolder, item: String, position: Int) {
        bind.storename.text = item


        when(position) {
            0 -> {

                bind.storeimageback.setImageResource(R.drawable.pizza)
                bind.imagetxt.text = "Ramadan Deals"
                bind.rating.text = "4.0"
                bind.review.text = "(10K+)"
                bind.ratingicon.setImageResource(R.drawable.ratingicon)
                bind.pricing.text = "$$$"
                bind.category.text = "Pizza"
                bind.deliveryicon.setImageResource(R.drawable.deliveryicon)
                bind.delivery.text = "85Rs"
            }
            1 -> {

                bind.storeimageback.setImageResource(R.drawable.pizza)
                bind.imagetxt.text = "Ramadan Deals"
                bind.rating.text = "4.0"
                bind.review.text = "(10K+)"
                bind.ratingicon.setImageResource(R.drawable.ratingicon)
                bind.pricing.text = "$$$"
                bind.category.text = "Pizza"
                bind.deliveryicon.setImageResource(R.drawable.deliveryicon)
                bind.delivery.text = "85Rs"
            }
            2 -> {

                bind.storeimageback.setImageResource(R.drawable.pizza)
                bind.imagetxt.text = "Ramadan Deals"
                bind.rating.text = "4.0"
                bind.review.text = "(10K+)"
                bind.ratingicon.setImageResource(R.drawable.ratingicon)
                bind.pricing.text = "$$$"
                bind.category.text = "Pizza"
                bind.deliveryicon.setImageResource(R.drawable.deliveryicon)
                bind.delivery.text = "85Rs"
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

    private fun clickListeners(holder: BasicViewHolder, item: String, position: Int) {
        bind.root.setOnClickListener {

            Toast.makeText(context, item, Toast.LENGTH_SHORT).show()

        }

    }

    inner class BasicViewHolder(v: View) : RecyclerView.ViewHolder(v)
}