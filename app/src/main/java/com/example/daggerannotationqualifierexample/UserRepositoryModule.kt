package com.example.daggerannotationqualifierexample


import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {


    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}