package ir.javadhashemi.daggertutorial.ui

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import ir.javadhashemi.daggertutorial.R


class MainActivity : DaggerAppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
