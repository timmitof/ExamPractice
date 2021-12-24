package com.timmitof.exampractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.timmitof.exampractice.fragments.CategoryFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container, CategoryFragment()).commit()
    }
}