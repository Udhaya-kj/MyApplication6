package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

private lateinit var arrayadapter : ArrayAdapter<String>
    private lateinit var list:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        list.add("One")
        list.add("Two")
        list.add("Three")

    listview.apply {
    arrayadapter.addAll(list)
    adapter=arrayadapter

}
    }
}
