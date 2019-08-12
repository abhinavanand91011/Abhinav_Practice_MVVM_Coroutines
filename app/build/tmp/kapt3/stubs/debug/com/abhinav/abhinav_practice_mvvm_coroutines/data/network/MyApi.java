package com.abhinav.abhinav_practice_mvvm_coroutines.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/abhinav/abhinav_practice_mvvm_coroutines/data/network/MyApi;", "", "userLogin", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "email", "", "password", "Companion", "app_debug"})
public abstract interface MyApi {
    public static final com.abhinav.abhinav_practice_mvvm_coroutines.data.network.MyApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<okhttp3.ResponseBody> userLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/abhinav/abhinav_practice_mvvm_coroutines/data/network/MyApi$Companion;", "", "()V", "invoke", "Lcom/abhinav/abhinav_practice_mvvm_coroutines/data/network/MyApi;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.abhinav.abhinav_practice_mvvm_coroutines.data.network.MyApi invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}