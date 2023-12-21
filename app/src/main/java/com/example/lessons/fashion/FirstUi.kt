package com.example.lessons.fashion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessons.R
import com.example.lessons.databinding.ActivityFirstUiBinding
import com.google.android.material.tabs.TabLayoutMediator

class FirstUi : AppCompatActivity() {
    private lateinit var binding: ActivityFirstUiBinding
    private val adapterTask = TaskFashionAdapter(createPagerList())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstUiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager2.adapter = adapterTask

        val mediator = TabLayoutMediator(binding.tablayoutfirst, binding.viewpager2) { tab, position ->
            tab.text = createTabList()[position]
        }

        mediator.attach()
    }

    private fun createTabList() = listOf(
        "Women", "Men", "Couple"
    )

    private fun createPagerList() = listOf(
        TaskPageModel.Women(
            listOf(
                FashionDataClass(R.drawable.ic_fashion, "Women's Fashion", 49.99),
                FashionDataClass(R.drawable.ic_fashion2, "Another Women's Fashion", 39.99)
            )
        ),
        TaskPageModel.Men(
            listOf(
                FashionDataClass(R.drawable.ic_fashion, "Men's Fashion", 29.99),
                FashionDataClass(R.drawable.ic_fashion2, "Another Men's Fashion", 19.99)
            )
        ),
        TaskPageModel.Couple(
            listOf(
                FashionDataClass(R.drawable.ic_fashion, "Couple's Fashion", 89.99),
                FashionDataClass(R.drawable.ic_fashion2, "Another Couple's Fashion", 79.99)
            )
        )
    )

    companion object {
        const val WOMEN = 1
        const val MEN = 2
        const val COUPLE = 3
    }
}
