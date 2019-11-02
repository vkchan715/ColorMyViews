package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            R.id.box_six_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_seven_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_eight_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_nine_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_ten_text -> view.setBackgroundColor(Color.BLUE)

            R.id.box_eleven_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twelve_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_thirteen_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_fourteen_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_fifteen_text -> view.setBackgroundColor(Color.BLUE)

            R.id.box_sixteen_text -> view.setBackgroundColor(Color.DKGRAY)

            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)

        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_thirteen_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_fourteen_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_fifteen_text)
        val boxSixteenText = findViewById<TextView>(R.id.box_sixteen_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText,boxSixText, boxSevenText, boxEightText,
                boxNineText, boxTenText,boxElevenText, boxTwelveText, boxThirteenText,
                boxFourteenText, boxFifteenText,boxSixteenText, rootConstraintLayout,
                redButton, greenButton, yellowButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }



    }
}
