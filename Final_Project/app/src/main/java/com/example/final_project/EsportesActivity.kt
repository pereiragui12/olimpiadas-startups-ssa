package com.example.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_esportes.*

class EsportesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esportes)

        btn_soccer.setOnClickListener{
            openSoccerActivity()
        }
    }

    private fun openSoccerActivity(){
        val select_soccer = Intent(this, SoccerActivity::class.java)
        startActivity(select_soccer)
    }
}
