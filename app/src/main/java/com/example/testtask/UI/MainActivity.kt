package com.example.testtask.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testtask.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var value:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer,NavigationFragment())
            .commit()

    }
}
