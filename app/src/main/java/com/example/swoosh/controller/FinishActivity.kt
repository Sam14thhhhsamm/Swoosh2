package com.example.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueText.text="Looking for a ${player.league} ${player.skill} league near your..."
    }
}
