package com.example.daggerannotationqualifierexample
import android.annotation.SuppressLint
import android.util.Log
import com.example.daggerannotationqualifierexample.Utils.Companion.TAG
import javax.inject.Inject

interface NotificationService{
    fun send(from:String, to:String, emailBody:String)
}
class EmailService @Inject constructor():NotificationService{

    @SuppressLint("LongLogTag")
    override fun send(from:String, to:String, emailBody:String){
        Log.e(TAG,"Email sent")
    }
}

class MessageService :NotificationService{

    @SuppressLint("LongLogTag")
    override fun send(from:String, to:String, emailBody:String){
        Log.e(TAG,"Message sent")
    }
}