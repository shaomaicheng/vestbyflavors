package com.chenglei.vest

import android.content.Context
import android.util.Log
import android.widget.Toast

class VestLog {
    fun log(context: Context){
        Toast.makeText(context, "vestb app", Toast.LENGTH_SHORT).show()
    }
}