package com.naxhym.zara

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // एक साधारण TextView बनाकर स्क्रीन पर दिखा रहे हैं
        val textView = TextView(this).apply {
            text = "Hello! I am Zara AI Assistant"
            textSize = 24f
            setPadding(50, 50, 50, 50)
        }
        setContentView(textView)
    }
}
