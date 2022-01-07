package com.example.toaster

import android.content.Context
import android.widget.Toast

object ToastMessenger {
    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}