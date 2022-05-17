package com.klinovvlad.customviewstask.view.customViews

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.klinovvlad.customviewstask.R

class CustomLinearLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultStyle: Int = 0
) : LinearLayout(context, attrs, defaultStyle) {
    val Int.dp: Int
        get() = (Resources.getSystem().displayMetrics.density * this).toInt()

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
            textSize = 18f
            text = item
            setPaddingRelative(4.dp, 0, 0, 0)
            setBackgroundColor(context.resources.getColor(R.color.black))
            setTextColor(context.resources.getColor(R.color.white))
        }
        addView(textView)
    }

}