package com.example.scoreboardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    fun addScore(view: MainActivity, teamId: Int, scoreIncrement: Int) {
        var scoreView : TextView
        when (teamId) {
            0 -> scoreView = view.findViewById(R.id.team_a_score)
            1 -> scoreView = view.findViewById(R.id.team_b_score)
            else -> scoreView = view.findViewById(R.id.team_a_score)
        }

        val scoreString = scoreView.text.toString()
        var score: Int = Integer.parseInt(scoreString)
        score += scoreIncrement
        scoreView.text = score.toString()
    }

    fun setScore(view: MainActivity, teamId: Int, newScore: Int) {
        var scoreView : TextView
        when (teamId) {
            0 -> scoreView = view.findViewById(R.id.team_a_score)
            1 -> scoreView = view.findViewById(R.id.team_b_score)
            else -> scoreView = view.findViewById(R.id.team_a_score)
        }

        scoreView.text = newScore.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.findViewById<Button>(R.id.team_a_touchdown).setOnClickListener {
            addScore(this,0,6)
        }

        this.findViewById<Button>(R.id.team_b_touchdown).setOnClickListener {
            addScore(this,1,6)
        }

        this.findViewById<Button>(R.id.team_a_extra_point).setOnClickListener {
            addScore(this,0,1)
        }

        this.findViewById<Button>(R.id.team_b_extra_point).setOnClickListener {
            addScore(this,1,1)
        }

        this.findViewById<Button>(R.id.team_a_field_goal).setOnClickListener {
            addScore(this, 0, 3)
        }

        this.findViewById<Button>(R.id.team_b_field_goal).setOnClickListener {
            addScore(this,1,3)
        }

        this.findViewById<Button>(R.id.team_a_safety).setOnClickListener {
            addScore(this,0,2)
        }

        this.findViewById<Button>(R.id.team_b_safety).setOnClickListener {
            addScore(this, 1, 2)
        }

        this.findViewById<Button>(R.id.reset_a_score).setOnClickListener {
            setScore(this,0,0)
        }

        this.findViewById<Button>(R.id.reset_b_score).setOnClickListener {
            setScore(this,1,0)
        }
    }
}
