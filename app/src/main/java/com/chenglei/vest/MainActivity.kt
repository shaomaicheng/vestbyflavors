package com.chenglei.vest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chenglei.vestlib.VestLibToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(
            R.id.btn1
        ).setOnClickListener {
//            VestLog().log(this@MainActivity)
            VestLibToast().toast(this@MainActivity)
        }
    }
}