package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Mein erster Commit")
        println("Meine zweiter Commit --> ich habe Mist gebaut")
        println("Mein driter Commit")
    }
}