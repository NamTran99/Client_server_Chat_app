package com.advanced.mockserver.utils

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.DisplayMetrics
import android.view.View
import android.view.WindowManager
import androidx.core.view.isInvisible
import androidx.core.view.isVisible


fun Context.getWindowManager(): WindowManager = getSystemService(WindowManager::class.java)

fun List<View>.moveViewFromRight(
    context: Context,
    duration: Long = 1000,
    delay: Long = 100
) {

    val displayMetrics = DisplayMetrics()
    context.getWindowManager().defaultDisplay.getMetrics(displayMetrics)
    val screenWidth = displayMetrics.widthPixels
    var delayStep: Long = 0
    forEach {
        it.translationX = screenWidth.toFloat()
        it.animate().translationX(0f).setDuration(duration).setStartDelay(delayStep).start()
        delayStep += delay
    }
}

fun View.scaleSmallToBig(duration: Long = 1000, listScaleType: List<Float> = listOf(0f, 1.5f, 1f)) {
    val scaleXAnimator = ObjectAnimator.ofFloat(this, "scaleX", *listScaleType.toFloatArray())
    val scaleYAnimator = ObjectAnimator.ofFloat(this, "scaleY", *listScaleType.toFloatArray())
    val animatorSet = AnimatorSet()
    animatorSet.duration = duration
    animatorSet.playTogether(scaleXAnimator, scaleYAnimator)
    animatorSet.start()
}

fun View.moveViewFromBottom(duration: Long = 1000) {
    val displayMetrics = DisplayMetrics()
    context.getWindowManager().defaultDisplay.getMetrics(displayMetrics)
    val screenHeight = displayMetrics.heightPixels
    translationY = screenHeight.toFloat()
    animate().translationY(0f).setDuration(duration).start()
}

fun View.moveViewFromRight(duration: Long = 1000) {
    val displayMetrics = DisplayMetrics()
    context.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics)
    val screenWidth = displayMetrics.widthPixels
    translationX = screenWidth.toFloat()
    animate().translationX(0f).setDuration(duration).start()
}

fun View.moveViewToRight(duration: Long = 1000) {
    val displayMetrics = DisplayMetrics()
    context.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics)
    val screenWidth = displayMetrics.widthPixels
    animate().translationX(screenWidth.toFloat()).setDuration(duration).start()
}

fun View.moveViewFromLeft(duration: Long = 1000) {
        translationX = -(this.width.toFloat() + this.x)
        animate().translationX(0f).setDuration(duration).start()
}

fun View.moveViewToLeft(duration: Long = 1000) {
    val x = -(this.width.toFloat() + this.x)
    animate().translationX(x).setDuration(duration).start()
}

fun View.scaleViewToZero(duration: Long = 500) {
    val scaleX = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0f)
    val scaleY = ObjectAnimator.ofFloat(this, "scaleY", 1f, 0f)
    val animationSet = AnimatorSet()
    animationSet.playTogether(scaleX, scaleY)
    animationSet.duration = duration
    animationSet.start();
}

fun View.scaleViewFromZero(duration: Long = 500) {
    val scaleX = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    val scaleY = ObjectAnimator.ofFloat(this, "scaleY", 0f, 1f)
    val animationSet = AnimatorSet()
    animationSet.playTogether(scaleX, scaleY)
    animationSet.duration = duration
    animationSet.start();
}

fun View.moveViewFromBottomAndScaleFromZero(duration: Long = 500){
    val displayMetrics = DisplayMetrics()
    context.getWindowManager().defaultDisplay.getMetrics(displayMetrics)
    val screenHeight = displayMetrics.heightPixels
    translationY = screenHeight.toFloat()

    val translateY = ObjectAnimator.ofFloat(this , "translationY", screenHeight.toFloat(), 0f)
    val scaleX = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    val scaleY = ObjectAnimator.ofFloat(this, "scaleY", 0f, 1f)
    val animationSet = AnimatorSet()
    animationSet.playTogether(scaleX, scaleY, translateY)
    animationSet.duration = duration
    animationSet.start();
}

fun View.visibleWithAnim(
    mIsVisible: Boolean,
    animGoneDuration: Long = 0L,
    callbackVisible: ((View) -> Unit)? = null,
    callbackGone: ((View) -> Unit)? = null
) {
    if (isVisible == mIsVisible) return
    if (mIsVisible) {
        isVisible = true
        callbackVisible?.invoke(this)
    } else {
        callbackGone?.invoke(this)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(
            {
                isInvisible = true
            }, animGoneDuration
        )
    }
}

fun View.inVisibleWithAnim(
    mIsVisible: Boolean,
    animGoneDuration: Long = 0L,
    callbackVisible: ((View) -> Unit)? = null,
    callbackGone: ((View) -> Unit)? = null
) {
    if(isVisible == mIsVisible) return
    if (mIsVisible) {
        isInvisible = false
        callbackVisible?.invoke(this)
    } else {
        callbackGone?.invoke(this)
    }
}


fun List<View>.visibleWithAnim(
    mIsVisible: Boolean,
    animDuration: Long = 0L,
    callbackVisible: ((View) -> Unit)? = null,
    callbackGone: ((View) -> Unit)? = null
) {
    this.forEach {
        if (it.isVisible == mIsVisible) return
        if (mIsVisible) {
            it.isVisible = true
            callbackVisible?.invoke(it)
        } else {
            callbackGone?.invoke(it)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed(
                {
                    it.isVisible = false
                }, animDuration
            )
        }
    }
}
