package com.klinovvlad.customviewstask.view.customViews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView

class CustomLinearLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultStyle: Int = 0
) : LinearLayout(context, attrs, defaultStyle) {

    init {
        orientation = VERTICAL
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (0 until 30).map { i ->
            addItem("some text $i")
        }
    }

    private fun addItem(item: String) {
        val textView = TextView(context)
        textView.apply {
            textSize = 18F
            text = item
            setTextColor(Color.BLACK)
        }
        addView(textView)
    }

}