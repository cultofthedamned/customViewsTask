package com.klinovvlad.customviewstask.view.customViews

import android.content.Context
import android.content.res.Resources
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
    private var roundingRadius: Float
    private var lineWidth: Float
    private var lineColor: Int
    private val paint = Paint()

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

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.apply {
            isAntiAlias = true
            color = lineColor
            style = Paint.Style.STROKE
            strokeWidth = lineWidth
        }
        canvas?.drawRoundRect(
            lineWidth,
            lineWidth,
            width - lineWidth,
            height - lineWidth,
            roundingRadius,
            roundingRadius,
            paint
        )
    }

}