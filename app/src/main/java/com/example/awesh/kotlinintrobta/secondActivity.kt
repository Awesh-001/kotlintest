package com.example.awesh.kotlinintrobta

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class secondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle : Bundle? =  intent.extras
        val msg = bundle!!.getString("User_Message")
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        txtsecond.text = msg




    }
}