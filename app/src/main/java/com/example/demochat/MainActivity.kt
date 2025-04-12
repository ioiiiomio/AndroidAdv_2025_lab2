package com.example.demochat

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
//have to import the lib later

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Launch the chat screen from the library when the button is clicked
        findViewById<Button>(R.id.openChatBtn).setOnClickListener {
//            ChatLauncher.start(this)  // call lib
        }
    }
}
