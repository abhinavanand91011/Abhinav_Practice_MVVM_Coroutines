package com.abhinav.abhinav_practice_mvvm_coroutines.data.network.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(user:User):Long

    @Query("SELECT * FROM user WHERE uid=$CURRENT_USER_ID ")
    fun getUser():LiveData<User>


}