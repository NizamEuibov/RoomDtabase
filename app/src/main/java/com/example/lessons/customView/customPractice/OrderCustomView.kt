package com.example.lessons.customView.customPractice

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.withStyledAttributes
import com.example.lessons.R
import com.example.lessons.databinding.MyCustomViewBinding
import com.google.android.material.card.MaterialCardView

class OrderCustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet?=null,
    defStyleattr:Int=0
) :MaterialCardView(context,attributeSet,defStyleattr){

    private val binding=MyCustomViewBinding.inflate(LayoutInflater.from(context), this,true)
    private var title:String=""
    private var size=0
    private var colour=0
    private var color=0
    private var changeImage:Drawable?=null

    init {
        context.withStyledAttributes(attributeSet, R.styleable.OrderCustomView){
            title=this.getString(R.styleable.OrderCustomView_textTitle).orEmpty()
           size=this.getDimensionPixelSize(R.styleable.OrderCustomView_textSize,0)
            colour=this.getColor(R.styleable.OrderCustomView_textColour, Color.BLACK)
            color=this.getColor(R.styleable.OrderCustomView_imagecolor,Color.BLACK)
            changeImage=getDrawable(R.styleable.OrderCustomView_imageChange)
        }

        initviews()
    }

    private fun initviews() {
        binding.customtext1.text=title
        binding.customtext1.setTextColor(colour)
        binding.customtext1.setTextSize(TypedValue.COMPLEX_UNIT_PX,size.toFloat())
        binding.customImage.setImageDrawable(changeImage)
    }


}