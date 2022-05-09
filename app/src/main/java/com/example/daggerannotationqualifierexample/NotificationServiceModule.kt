package com.example.daggerannotationqualifierexample


import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {


    //example of  annotation qualifier.
    // To avoid typo mistakes, we will use annotation qualifier

   // @Named("message")
    @MessageQualifier
    @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }

    //@Named("email")
    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}