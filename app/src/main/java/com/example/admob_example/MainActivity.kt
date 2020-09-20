package com.example.admob_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = "Luat"
        var age = 22
        // toán tử elvis
        val length = name?.length ?: -1
        while (age < 100) {
            age++
        }
        for (i in 1..10) {
        }
        for (i in 10 downTo 1) {
        }
        for (i in 1..10 step 2) {
            // in ra 1 3 5 7 9
        }
        val listNumber = listOf<Int>(1, 2, 3, 4, 5, 6)
        for (number in listNumber) {
            if (number % 2 == 0) {
                //even
            } else {
                //odd
            }
        }
        val listName = arrayOf("Quan", "Luat", "Quang Anh", "Tu", "Thanh")
        for (name in listName) {
            if (name.startsWith("Q")) {

            }
        }

        val listNumber2 = listOf<Int>(1, 3, -2, 5, 7, -10)
        var sum = 0
        for (index in 0..listNumber2.size - 1) {
            sum += listNumber2.get(index)
        }



    }
}