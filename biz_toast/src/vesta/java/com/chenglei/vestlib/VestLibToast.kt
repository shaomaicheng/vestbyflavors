package com.chenglei.vestlib

import android.content.Context
import android.widget.Toast
import com.chenglei.normal.Normal

class VestLibToast {
    fun toast(context: Context) {
        Normal()
        Toast.makeText(context, "vest lib a", Toast.LENGTH_SHORT).show()
    }
}