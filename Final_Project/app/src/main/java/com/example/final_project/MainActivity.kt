package com.example.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_continue.setOnClickListener{
            val valueTeamOne = tex_team1.text.toString()
            val valueTeamTwo = tex_team2.text.toString()
            if (valueTeamOne.trim().isEmpty() || valueTeamTwo.trim().isEmpty()){
                Toast.makeText(this, "Os campos acima são obrigatórios", Toast.LENGTH_SHORT).show()
            }
            else
            openActivitySport()
        }
    }

    private fun openActivitySport(){
        val choose_sports = Intent(this, EsportesActivity::class.java)
        startActivity(choose_sports)
    }
}
