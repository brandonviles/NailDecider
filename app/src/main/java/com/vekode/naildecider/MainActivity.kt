package com.vekode.naildecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val colorList = arrayListOf("Purple", "Pink", "Blue", "Black")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomColor = random.nextInt(colorList.count())

            deciderLbl.text = colorList[randomColor]
        }

        addColorBtn.setOnClickListener {
            val newColor = newColorTxt.text.toString()
            colorList.add(newColor)
            newColorTxt.text.clear()
        }
    }


}
