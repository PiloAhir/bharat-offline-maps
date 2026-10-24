package com.bharat.offlinemaps

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(245, 248, 242))
        }

        val title = TextView(this).apply {
            text = "🇮🇳 Bharat Offline Maps"
            textSize = 27f
            setTextColor(Color.rgb(30, 90, 55))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "તમારો નકશો, તમારી સાથે — ઇન્ટરનેટ વગર પણ"
            textSize = 16f
            gravity = Gravity.CENTER
            setTextColor(Color.DKGRAY)
            setPadding(0, 24, 0, 32)
        }

        val mapButton = Button(this).apply {
            text = "🛰️  સેટેલાઈટ નકશો"
            isAllCaps = false
            setOnClickListener {
                subtitle.text =
                    "આગળના તબક્કામાં સેટેલાઈટ નકશો ઉમેરવામાં આવશે."
            }
        }

        val offlineButton = Button(this).apply {
            text = "⬇️  ઓફલાઈન નકશા"
            isAllCaps = false
            setOnClickListener {
                subtitle.text =
                    "અહીં ડાઉનલોડ કરેલા નકશા દેખાશે."
            }
        }

        val gpsButton = Button(this).apply {
            text = "📍  મારું વર્તમાન સ્થાન"
            isAllCaps = false
            setOnClickListener {
                subtitle.text =
                    "આગળના તબક્કામાં GPS સુવિધા ઉમેરવામાં આવશે."
            }
        }

        layout.addView(title)
        layout.addView(subtitle)

        listOf(mapButton, offlineButton, gpsButton).forEach {
            layout.addView(
                it,
                LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            )
        }

        setContentView(layout)
    }
}
