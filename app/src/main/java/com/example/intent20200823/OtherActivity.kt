package com.example.intent20200823

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btn_return.setOnClickListener {
//            val intent = Intent(this@OtherActivity, MainActivity::class.java)
//            this.startActivity(intent)
//            this.finish()
            onBackPressed()
        }
    }

}