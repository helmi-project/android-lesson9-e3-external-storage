package com.androidatc.lesson09_e3_externalstorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkExternal.setOnClickListener {
            val state = Environment.getExternalStorageState()

            if (Environment.MEDIA_MOUNTED.equals(state) || Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {

                Toast.makeText(this,"External storage is available to read",Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this,"External storage is NOT available to read",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
