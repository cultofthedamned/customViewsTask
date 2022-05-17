package com.klinovvlad.customviewstask.view.customViews

import android.content.Context
import android.content.res.Resources
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
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
    private val Int.dp: Float
        get() = Resources.getSystem().displayMetrics.density * this

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.RectangleView,
            0, 0
        ).apply {
            try {
                roundingRadius = getDimension(
                    R.styleable.RectangleView_roundingRadius,
                    100f
                )
                lineWidth = getDimension(
                    R.styleable.RectangleView_lineWidth,
                    10f
                )
                lineColor = getColor(
                    R.styleable.RectangleView_lineColor,
                    ContextCompat.getColor(context, R.color.black)
                )
            } finally {
                recycle()
            }
            paint.apply {
                isAntiAlias = true
                color = lineColor
                style = Paint.Style.STROKE
                strokeWidth = lineWidth
            }
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRoundRect(
            0.dp,
            0.dp,
            width - 0.dp,
            height - 0.dp,
            roundingRadius,
            roundingRadius,
            paint
        )
    }

}