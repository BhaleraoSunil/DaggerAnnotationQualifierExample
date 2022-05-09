package com.example.daggernamedannotationexample


import com.example.daggerannotationqualifierexample.EmailQualifier
import com.example.daggerannotationqualifierexample.MessageQualifier
import com.example.daggerannotationqualifierexample.NotificationService
import com.example.daggerannotationqualifierexample.UserRepository
import javax.inject.Inject
import javax.inject.Named

/*
* Consumer class which is using annotation qualifiers instead of named annotation.
 */
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
//    @Named("message") private val  notificationService: NotificationService
   // @MessageQualifier private val  notificationService: NotificationService
    @EmailQualifier private val  notificationService: NotificationService
) {


    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        notificationService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}