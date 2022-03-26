package com.example.lesson1_1919

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

const val TAG = "MyActivity_Lesson1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person1 = NewData.Person("Jon", 20)
        val person2 = NewData.Person(age = 30)

        Log.d(TAG, "$person1")
        Log.d(TAG, "$person2")

        person1.age = 40
        Log.d(TAG, "$person1")

        val person3 = person1.copy()
        Log.d(TAG, "$person3")

        findViewById<MaterialButton>(R.id.button_data)?.setOnClickListener {
            findViewById<MaterialTextView>(R.id.name_textview)?.text =
                person1.name?.toString().trim()
            findViewById<MaterialTextView>(R.id.age_textview)?.text = person1.age?.toString().trim()
        }

        ShowFor()
    }

    private fun ShowFor() {
        for (i in 1..10 step 2) {
            Log.d(TAG, i.toString())
        }

        val listName: List<String> = listOf<String>("Tom", "Jon", "Gans")
        for (l: String in listName) {
            Log.d(TAG, l)
        }

        listName.forEach { n: String -> Log.d(TAG, "$n name from list") }

        repeat(listName.size){ Log.d(TAG, listName[it].plus(" name $it"))}
    }
}