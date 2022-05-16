package com.klinovvlad.customviewstask.view.customViews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.klinovvlad.customviewstask.R

class RectangleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultStyle: Int = 0
) : View(
    context,
    attrs,
    defaultStyle
) {
    private var roundingRadius: Float? = null
    private var lineWidth: Float? = null
    private var lineColor: Int? = null

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.RectangleView,
            0, 0
        ).apply {
            try {
                roundingRadius = getFloat(
                    R.styleable.RectangleView_roundingRadius,
                    100f
                )
                lineWidth = getFloat(
                    R.styleable.RectangleView_lineWidth,
                    10f
                )
                lineColor = getInt(
                    R.styleable.RectangleView_lineColor,
                    Color.BLACK
                )
            } finally {
                recycle()
            }
        }
    }

    private val paint = Paint().apply {
        isAntiAlias = true
        color = lineColor ?: 0
        style = Paint.Style.STROKE
        strokeWidth = lineWidth ?: 0f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRoundRect(
            20f,
            20f,
            width - 20f,
            height - 20f,
            roundingRadius ?: 0f,
            roundingRadius ?: 0f,
            paint
        )
    }

}