package br.com.leandrotakahashi.fcmapp

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Log.i("Token", FirebaseInstanceId.getInstance().token)
    }
}