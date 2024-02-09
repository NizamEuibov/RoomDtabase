package com.example.lessons.animation

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import androidx.core.content.ContextCompat
import com.example.lessons.R
import com.example.lessons.databinding.ActivityAnimationBinding

class AnimationActivity : AppCompatActivity() {
    private var binding:ActivityAnimationBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        binding?.start?.setOnClickListener {
////        colorAnimation()
//
    }
    private fun animationMethod(){
        val animationAlpha=AlphaAnimation(0f,1.0f)
        animationAlpha.duration=200
        animationAlpha.repeatMode= Animation.ZORDER_NORMAL
        animationAlpha.repeatCount=Animation.ABSOLUTE
        binding?.view?.startAnimation(animationAlpha)
    }

    private fun scaleAnimation(){
        val scaleAnimation=ScaleAnimation(
            0f,
            1.0f,
            0f,
            2.0f
        )
        scaleAnimation.duration=2000
        scaleAnimation.repeatCount=Animation.INFINITE
        scaleAnimation.repeatMode=Animation.REVERSE
        binding?.view?.startAnimation(scaleAnimation)
    }

    private fun rotateAnimation(){
        val rotateAnimation=RotateAnimation(
            0f,
            360f,
            Animation.RELATIVE_TO_SELF,
            0f,
            Animation.RELATIVE_TO_SELF,
            1.0f
        )
        rotateAnimation.duration=2000
        rotateAnimation.repeatMode=Animation.RESTART

        rotateAnimation.repeatCount=Animation.ABSOLUTE

        rotateAnimation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {

            }

            override fun onAnimationRepeat(animation: Animation?) {
                binding?.view?.startAnimation(rotateAnimation)
            }

        })
        binding?.view?.startAnimation(rotateAnimation)
    }

    private fun animation(){
        AnimationUtils.loadAnimation(
            this,
            R.anim.rotate
        ).also { animation ->
            binding?.view?.startAnimation(animation)
        }
    }


    private fun colorAnimation(){

        val colorAnimator=ObjectAnimator.ofInt(
            binding?.view,
            "backgroundColor",
            ContextCompat.getColor(this,R.color.black),
            ContextCompat.getColor(this,R.color.white)
        )

        colorAnimator.setEvaluator(ArgbEvaluator())
        colorAnimator.duration=2000
        colorAnimator.repeatMode=ObjectAnimator.REVERSE
        colorAnimator.repeatCount=ObjectAnimator.INFINITE

        colorAnimator.start()
    }
}