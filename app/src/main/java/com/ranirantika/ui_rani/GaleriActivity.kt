package com.ranirantika.ui_rani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.ImageView
import android.widget.Toast
class GaleriActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    private var menuNames = arrayOf("Kentang Rege", "Kripik Singkong", "Krupuk Kembang",
        "Krupuk Keong", "Makaroni Spiral", "Stik Pangpang", "Siomay", "Stik Balado")
    private var menuImages = intArrayOf(R.drawable.kentangrege,
        R.drawable.kripiksingkong, R.drawable.krupukkembang,
        R.drawable.krupukkeong, R.drawable.makaronispiral, R.drawable.pangpang, R.drawable.siomay,
        R.drawable.stikbalado)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)
        title = "GaleriWisata"
        gridView = findViewById(R.id.gridView)
        val mainAdapter = GaleriAdapter(this@GaleriActivity,
            menuNames, menuImages)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = OnItemClickListener { _,
                                                             _, position, _ ->
            Toast.makeText(applicationContext, "You CLicked " + menuNames[+position],
                Toast.LENGTH_SHORT).show()

//            val moveWithDataIntentList = Intent(this@GaleriActivity,
//                MainActivity2List::class.java)
//            moveWithDataIntentList.putExtra(MainActivity2List.EXTRA_NUMBER,
//                position)
//            startActivity(moveWithDataIntentList)
        }

    }
}