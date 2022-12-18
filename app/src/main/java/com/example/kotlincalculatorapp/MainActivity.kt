package com.example.kotlincalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  var canAddOperation = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun operatorAction(view: View) {

    }
    fun numberAction(view: View) {
        if (view is Button){
            workingTV.append(view.text)
        }
    }
    fun allClearAction(view: View) {
        workingTV.text = ""
        resultsTV.text = ""
    }
    fun backspaceAction(view: View) {
        val length = workingTV.length()
        if (length > 0)
            workingTV.text = workingTV.text.subSequence(0,length-1)
    }
    fun equalsAction(view: View) {}
}