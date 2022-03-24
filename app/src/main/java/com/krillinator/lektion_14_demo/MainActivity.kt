package com.krillinator.lektion_14_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Try catch
        try {
            TODO("")
        } catch (e:Error) {
            println(e)
        }

        println(addSum(5, 5))
        iterateSum()
    }

    private fun addSum(x: Int, y: Int): Int {

        return x + y
    }

    private fun iterateSum() {
        for (i in 0..10) {
            println(i)
        }
    }
}

