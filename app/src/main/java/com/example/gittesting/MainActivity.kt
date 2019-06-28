package com.example.gittesting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Test new branch")
        TestNewBranch()
    }
     fun TestNewBranch(){
        val tes2 = "Test"
        print(tes2)

    }
}
