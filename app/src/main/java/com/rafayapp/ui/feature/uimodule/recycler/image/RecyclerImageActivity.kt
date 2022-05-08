package com.rafayapp.ui.feature.uimodule.recycler.image

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rafayapp.data.Brand
import com.rafayapp.databinding.ActivityImageRecyclerBinding
import com.rafayapp.ui.feature.uimodule.recycler.image.adapter.AdapterImageRecycler

class RecyclerImageActivity : AppCompatActivity() {

    private lateinit var bind: ActivityImageRecyclerBinding
    private lateinit var adapter: AdapterImageRecycler
    //private lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityImageRecyclerBinding.inflate(layoutInflater)
        setContentView(bind.root)
        setupLayout()
        setupClickListeners()
    }

    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //recycler view
        val brand = ArrayList<Brand>()
        brand.add(Brand(0, "Red Apple", 1.0)) //0
        brand.add(Brand(0, "BaGallery", 2.0)) //0
        brand.add(Brand(0, "ELO", 3.0)) //0
        brand.add(Brand(0, "Jomo.pk", 4.0)) //0
        brand.add(Brand(0, "OH My Grill", 5.0)) //0
        brand.add(Brand(0, "KHAZANY", 6.0)) //0
        brand.add(Brand(0, "Optp", 7.0)) //0




        adapter = AdapterImageRecycler(this, brand)
        bind.imagerecycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        bind.imagerecycler.adapter = adapter
    }

    private fun setupClickListeners() {
    }

    //______________________________________________________________________________________________ BACK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}