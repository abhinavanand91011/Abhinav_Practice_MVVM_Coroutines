package com.abhinav.abhinav_practice_mvvm_coroutines.data.network.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(

    entities = [User::class],
    version= 1
)
abstract class AppDatabase:RoomDatabase() {

    abstract fun getUserDao():UserDao

    companion object{

        @Volatile//means this value have immediate effect
        private var instance:AppDatabase?=null
        private val LOCK=Any()

        operator fun invoke(context:Context)=instance?: synchronized(LOCK){

            instance?:buildDatabase(context).also {
                instance=it
            }

        }

        private fun buildDatabase(context: Context)=

            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java
            "MyDatabase.db"

            ).build()

    }





}