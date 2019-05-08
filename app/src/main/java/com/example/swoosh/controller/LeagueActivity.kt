package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player=Player("","")
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player=savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(View:View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        player.league="mens"
    }
    fun onWomensClicked(View:View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        player.league="womens"
    }
    fun onCoedClicked(View:View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        player.league="co-ed"
    }



    fun leagueNextClick(View : View){
        if(player.league!=""){
            val skillactivityintent=Intent(this, SkillActivity::class.java)
            skillactivityintent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillactivityintent)
        } else {
            Toast.makeText(this,"Please choose a League",Toast.LENGTH_LONG).show()
        }
    }}
