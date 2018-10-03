package com.example.awesh.kotlinintrobta

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickbutton.setOnClickListener {


                txtview.text = "Hello There How're you doing !"

                val message: String = txtfield.text.toString()

                val intent = Intent(this, secondActivity::class.java)

                intent.putExtra("User_Message", message)
                startActivity(intent)
        }

        clicktoshare.setOnClickListener {

            val msg:String  = txtfield.text.toString()
            val intent2 = Intent()
            intent2.action = Intent.ACTION_SEND
            intent2.putExtra(Intent.EXTRA_TEXT,msg)
            intent2.type = "text/plain"

            startActivity(Intent.createChooser(intent2,"Please select the app:"))

        }



    }
}
