package com.example.lessons.customView

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.LinearLayout

class IndicatorView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet?=null,
    defStyleAttr:Int=0
):LinearLayout(context,attributeSet,defStyleAttr){

    val childList= mutableListOf<Boolean>()
    val activeDrawable:Drawable?=null
    val deactiveDrawable:Drawable?=null


    private fun setChildrenCount(count:Int){
        for(i in 0 until count)
            childList.add(false)
    }

}