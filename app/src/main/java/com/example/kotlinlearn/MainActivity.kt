package com.example.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("kotlin", "Hello World")
        // 1.val var
        // 2.

        // 2.4 程序的控制语句
        fun largeNumber(num1: Int, num2: Int): Int {
//            var value = 0;
//            if (num1 > num2) {
//                value = num1
//            } else {
//                value = num2
//            }

            // 简化 1
            var value = if (num1 > num2) {
                num1
            } else {
                num2
            }
            return value;
        }

    }
}