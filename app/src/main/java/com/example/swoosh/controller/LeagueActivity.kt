package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedleague=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun onMensClicked(View:View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedleague="mens"
    }
    fun onWomensClicked(View:View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedleague="womens"
    }
    fun onCoedClicked(View:View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        selectedleague="co-ed"
    }



    fun leagueNextClick(View : View){
        if(selectedleague!=""){
            val skillactivityintent=Intent(this, SkillActivity::class.java)
            skillactivityintent.putExtra(EXTRA_LEAGUE,selectedleague)
            startActivity(skillactivityintent)
        } else {
            Toast.makeText(this,"Please choose a League",Toast.LENGTH_LONG).show()
        }
    }}
