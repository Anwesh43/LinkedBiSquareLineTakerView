package com.anwesh.uiprojects.bisquarelinetakerview

/**
 * Created by anweshmishra on 06/07/20.
 */

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF
import android.graphics.Canvas

val colors : Array<String> = arrayOf("#4CAF50", "#F44336", "#2196F3", "#009688", "#FFC107")
val parts : Int = 3
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 6.8f
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20

