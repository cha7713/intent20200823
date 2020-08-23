package com.example.intent20200823

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.set
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_move.setOnClickListener {
            var msg = edit_text.text.toString()

            if (msg==""){
                val intent = Intent(this@MainActivity, OtherActivity::class.java)
                this.startActivity(intent)
            }else{
                val intent = Intent(this@MainActivity, MessageActivity::class.java)
                intent.putExtra("msg",msg)
                this.startActivity(intent)
            }
        }
    }
}