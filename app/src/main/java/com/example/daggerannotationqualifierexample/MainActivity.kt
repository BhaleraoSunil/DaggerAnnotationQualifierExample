package com.example.daggerannotationqualifierexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggernamedannotationexample.DaggerUserRegistrationComponent
import com.example.daggernamedannotationexample.UserRegistrationService
import javax.inject.Inject

/*
Demo of annotation qualifier
* */

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)

        userRegistrationService.registerUser("sunil@yopmail.com","1234")
    }
}