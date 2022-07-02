package com.ranirantika.ui_rani

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.net.Uri
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TAMPILAN AWAL
        val imageView1 =
            findViewById<ImageView>(R.id.imageView1)
        val imageView2 =
            findViewById<ImageView>(R.id.imageView2)
        val imageView3 =
            findViewById<ImageView>(R.id.imageView3)
        val imageView4 =
            findViewById<ImageView>(R.id.imageView4)
//        val imageView5 =
//            findViewById<ImageView>(R.id.imageView5)
//        val imageView6 =
//            findViewById<ImageView>(R.id.imageView6)
        imageView1.setOnClickListener {
            val detailIntent = Intent(this,
                MainActivity2::class.java)
            startActivity(detailIntent)
        }
        imageView2.setOnClickListener {
            val detailIntent = Intent(this,
                PisangKeju::class.java)
            startActivity(detailIntent)
        }
//        imageView3.setOnClickListener {
//            val detailIntent = Intent(this,
//                MainActivity4::class.java)
//            startActivity(detailIntent)
//        }
//        imageView4.setOnClickListener {
//            val detailIntent = Intent(this,
//                MainActivity5::class.java)
//            startActivity(detailIntent)
//        }
//        imageView5.setOnClickListener {
//            val detailIntent = Intent(this,
//                MainActivity6::class.java)
//            startActivity(detailIntent)
//        }
//        imageView6.setOnClickListener {
//            val detailIntent = Intent(this,
//                MainActivity7::class.java)
//            startActivity(detailIntent)
//        }
//        val button1 =
//            findViewById<Button>(R.id.button1)
//        button1.setOnClickListener {
//            val detailIntent = Intent(this,
//                MainProfil::class.java)
//            startActivity(detailIntent)
//        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when (item.itemId){
            R.id.list -> {
                val moveIntent = Intent(this@MainActivity,
                    MainActivity::class.java)
                startActivity(moveIntent)
                Toast.makeText(this,"List View",Toast.LENGTH_SHORT).show()
            }
            R.id.grid -> {
                val moveIntent = Intent(this@MainActivity,
                    GaleriActivity::class.java)
                startActivity(moveIntent)
                Toast.makeText(this,"Grid View",Toast.LENGTH_SHORT).show()
            }

            R.id.dial_number -> {
                val number = "+6283136606523"
                val url = "https://api.whatsapp.com/send?phone=$number &text=Halo%20Admin%20Saya%20Mau%20Order"
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
            }

//            R.id.nomor -> {
//                val myNumber = "https://api.whatsapp.com/send?phone=083136606523&text=Halo%20Admin%20Saya%20Mau%20Order"
//                val dialPhoneIntent = Intent(
//                    Intent.ACTION_DIAL,
//                    Uri.parse("tel:$myNumber")
//                )
//                startActivity(dialPhoneIntent)
//            }
//            R.id.catat -> {
//                val moveIntent = Intent(this@MainActivity,
//                    MainDatabase::class.java)
//                startActivity(moveIntent)
//                Toast.makeText(this,"Grid View",Toast.LENGTH_SHORT).show()
//            }


            R.id.exit -> {
                finish()
                Toast.makeText(this,"Keluar Aplikasi",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)

    }


}

