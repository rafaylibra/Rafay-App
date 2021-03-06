package com.rafayapp.ui.feature.uimodule.layout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.rafayapp.R
import com.rafayapp.ui.feature.uimodule.layout.frame.FrameActivity
import com.rafayapp.ui.feature.uimodule.layout.linear.LinearActivity
import com.rafayapp.ui.feature.uimodule.layout.relative.RelativeActivity

class LayoutActivity : AppCompatActivity() {

    lateinit var btn1 : AppCompatButton
    lateinit var btn2 :AppCompatButton
    lateinit var btn3 :AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
        Log.e("LifeCycle: UI", "onCreate")
        setupLayout()
        setupClickListeners()
    }


    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
    }

    private fun setupClickListeners() {
        btn1.setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))
        }
        btn3.setOnClickListener {
            startActivity(Intent(this, FrameActivity::class.java))
        }
    }


    //______________________________________________________________________________________________ LIFECYCLE
    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle: UI", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle: UI", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle: UI", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle: UI", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle: UI", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("LifeCycle: UI", "onRestart")
    }

    //______________________________________________________________________________________________ BACK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> { onBackPressed() }
        }
        return super.onOptionsItemSelected(item)
    }
}