package com.example.daggernamedannotationexample

import com.example.daggerannotationqualifierexample.MainActivity
import com.example.daggerannotationqualifierexample.NotificationServiceModule
import com.example.daggerannotationqualifierexample.UserRepositoryModule
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(activity: MainActivity)
}