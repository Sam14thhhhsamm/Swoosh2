package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.Utilities.EXTRA_SKILL
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league=""
    var skillselected=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league=intent.getStringExtra(EXTRA_LEAGUE)

        println(league)

    }

    fun onBeginnerClick(View: View){
        ballerskillbtn.isChecked=false
        skillselected="beginner"
    }
    fun  onBallerClicked(View: View){
        beginnerskillbtn.isChecked=false
        skillselected="baller"
    }


    fun onSkillFinishClicked(View:View){
        if(skillselected!=""){
            val finishactivity= Intent(this,FinishActivity::class.java)
            finishactivity.putExtra(EXTRA_LEAGUE,league)
            finishactivity.putExtra(EXTRA_SKILL,skillselected)
            startActivity(finishactivity)}else{
            Toast.makeText(this,"Please choose",Toast.LENGTH_LONG).show()
        }
    }
}
