package com.example.broadcastsample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BaterryLowReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val isBaterryLow = intent?.getBooleanExtra("state", false) ?: return

        if (isBaterryLow){
            Toast.makeText(context, "Baterry low",Toast.LENGTH_SHORT).show()
        }else
        {
            Toast.makeText(context, "Baterry is ok",Toast.LENGTH_SHORT).show()
        }
    }
}