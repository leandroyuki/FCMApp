package br.com.leandrotakahashi.fcmapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class detalheActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)
        Toast.makeText(this,intent.extras["id"].toString(),Toast.LENGTH_LONG).show()
    }
}
