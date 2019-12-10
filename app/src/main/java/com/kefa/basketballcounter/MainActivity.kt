package com.kefa.basketballcounter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var teamAScores: Int = 0
        var teamBScores: Int = 0

        button1.setOnClickListener {
            teamAScores = teamAScores + 1
            num1.setText(teamAScores.toString())
        }

        button2.setOnClickListener {
            teamBScores = teamBScores + 1
            num2.setText(teamBScores.toString())
        }
        btnSummary.setOnClickListener {
            //            explicit intent
            val intent = Intent(this, Results::class.java)
            intent.putExtra("TeamA", teamAScores.toString())
            startActivity(intent)

            val intent2 = Intent(this, Results::class.java)
            intent.putExtra("TeamB", teamBScores.toString())
            startActivity(intent)


//            implicit everyone has a way of sending
            //val implicitIntent=Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
            //startActivity(implicitIntent)
//            val sendIntent=Intent(Intent.ACTION_SEND)
//              sendIntent.putExtra(Intent.EXTRA_TEXT,"Hello World")
//            sendIntent.type="text/plain"
//            startActivity(sendIntent)
        }
    }
}
