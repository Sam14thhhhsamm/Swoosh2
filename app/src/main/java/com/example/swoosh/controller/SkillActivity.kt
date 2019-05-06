package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player:Player


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player=intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onBeginnerClick(View: View){
        ballerskillbtn.isChecked=false
        player.skill="beginner"
    }
    fun  onBallerClicked(View: View){
        beginnerskillbtn.isChecked=false
        player.skill="baller"
    }


    fun onSkillFinishClicked(View:View){
        if(player.skill!=""){
            val finishactivity= Intent(this,FinishActivity::class.java)
            finishactivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishactivity)}else{
            Toast.makeText(this,"Please choose",Toast.LENGTH_LONG).show()
        }
    }
}
