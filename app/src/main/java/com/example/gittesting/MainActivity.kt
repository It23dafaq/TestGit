package com.example.gittesting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.concurrent.atomic.DoubleAdder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Test new branch")
        TestNewBranch()
    }
     fun TestNewBranch(){
        val test1 = "Test"
        print("test1 = "+test1)
         print(test1)
         MergeConflic(test1)

    }
    fun MergeConflic(vamos : String){
          print(vamos)
    }
}
