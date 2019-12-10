package com.kefa.basketballcounter

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_results.*

class Results : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        var teamA = intent.getStringExtra("TeamA")
        Toast.makeText(
            this, teamA,
            Toast.LENGTH_LONG
        ).show()


        var teamB = intent.getStringExtra("TeamB")


        if (teamA.toInt() > teamB.toInt()) {
            //team A is the winner
            txtMessage.text = "teamA won by $teamA"
            alertDialog(msg = "teamA won by $teamA")
        } else {
            //team is the winner
            txtMessage.text = "teamB won by $teamB "
            alertDialog(msg = "teamA won by $teamB")
        }
        Toast.makeText(
            this, teamB,
            Toast.LENGTH_LONG
        ).show()

    }

    //    ALERT DIALOG
    fun alertDialog(msg: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("RESULTS")
        builder.setMessage(msg)
        builder.setPositiveButton("okey", DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
        builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
        builder.setNeutralButton("maybe", DialogInterface.OnClickListener { dialog, which ->

        })
        finish()
    }


}
