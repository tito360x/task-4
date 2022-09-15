package com.example.task4

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val TAG = "LIfeCycleTest"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() is clicked")
        val scorelabelteama = findViewById<TextView>(R.id.team_a_score)
        val scorelabelteamb = findViewById<TextView>(R.id.team_b_score)
        val buttonteama3points = findViewById<Button>(R.id.three_pts_btn_a)
        val buttonteama2points = findViewById<Button>(R.id.two_pts_btn_a)
        val buttonteamafreethrow = findViewById<Button>(R.id.one_pts_btn_a)
        val buttonteamb3points = findViewById<Button>(R.id.three_pts_btn_b)
        val buttonteamb2points = findViewById<Button>(R.id.two_pts_btn_b)
        val buttonteambfreethrow = findViewById<Button>(R.id.one_pts_btn_b)
        val resetbutton = findViewById<Button>(R.id.reset_btn)
        val dividerview = findViewById<View>(R.id.divider)

        buttonteamafreethrow.setOnClickListener {
            addScore(1, scorelabelteama)
        }
        buttonteama2points.setOnClickListener {
            addScore(2, scorelabelteama)
        }
        buttonteama3points.setOnClickListener {
            addScore(3, scorelabelteama)
        }

        buttonteambfreethrow.setOnClickListener {
            addScore(1, scorelabelteamb)
        }
        buttonteamb2points.setOnClickListener {
            addScore(2, scorelabelteamb)
        }
        buttonteamb3points.setOnClickListener {
            addScore(3, scorelabelteamb)
        }
        resetbutton.setOnClickListener {
            scorelabelteama.text = "0"
            scorelabelteamb.text = "0"
        }



    }

    private fun addScore(points: Int, targetlabel: TextView) {
        val currentscore = targetlabel.text.toString().toInt()
        val newscore = currentscore + points
        targetlabel.text = "$newscore"
    }

    override fun onClick(p0: View?) {
        Toast.makeText(this, "Free throw is clicked", Toast.LENGTH_SHORT).show()
        Log.d(TAG, " onClick() is clicked")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() is called ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() is called ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()  is called ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() is called ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() is called ")
    }


}
