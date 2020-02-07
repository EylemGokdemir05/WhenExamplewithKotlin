package com.eylem.whenexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val day=3
        var dayString=""

        when(day){
            1->dayString="Monday"
            2->dayString="Tuesday"
            3->dayString="Wednesday"
            4->dayString="Thursday"
            5->dayString="Friday"
            6->dayString="Saturday"
            7->dayString="Sunday"
        }
        println(dayString)
    }
}
