package com.hi.dhl.jprogressview.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 通过代码初始化 JProgresssView
        initJProgresssView()

        btnStart.setOnClickListener {
            progresssView10.startAnimal()

            progresssView
                .setProgress(90f) // 当前进度
                .setMaxProgress(300) // 进度条的最大值
                .setReverse(false) // 进度条回放
                .startAnimal() // 开启动画
            progresssView3.setProgress(80f).setReverse(false).startAnimal()
            progresssView4.setProgress(70F).setReverse(false).startAnimal()
            progresssView5.setProgress(50f).setReverse(false).startAnimal()
            progresssView6.setProgress(90F).setReverse(false).startAnimal()
            progresssView1.setProgress(60F).setReverse(false).startAnimal()
            progresssView2.setProgress(60F).setReverse(false).startAnimal()
        }
//
        btnResver.setOnClickListener {
            progresssView.setProgress(90f).setReverse(true).startAnimal()
            progresssView3.setProgress(80f).setReverse(true).startAnimal()
            progresssView2.setProgress(60F).setReverse(true).startAnimal()
            progresssView4.setProgress(70F).setReverse(true).startAnimal()
            progresssView5.setProgress(50f).setReverse(true).startAnimal()
            progresssView6.setProgress(90F).setReverse(true).startAnimal()
            progresssView1.setProgress(60F).setReverse(true).startAnimal()
        }
    }

    private fun initJProgresssView() {
        progresssView10
            .setProgress(0f)// 当前进度
            .setMaxProgress(100)// 进度条的最大值
            .setReverse(false)// 进度条回放
            .setAnimateDuration(1000)// 动画运行时间
            .isShowText(true)// 是否显示文字
            .setProgressColor(resources.getColor(R.color.progress_color, null))// 当前进度颜色
            .setProgressColorBackground(resources.getColor(R.color.progress_color_background, null))// 进度条背景颜色
            .setRectRadius(resources.getDimension(R.dimen.common_radius_8dp))// 圆角
            .setRectTextAlign(1)// 文字位于进度条位置(左边：0；中间：1；右边：2)
            .setTextColor(resources.getColor(R.color.progress_text_color, null))// 文字颜色
            .setTextSize(resources.getDimension(R.dimen.text_size_14sp))// 文字大小
            .setShapeType(2)// 形状： 矩形：0；圆形：1；圆角矩形：2
            .setProgressPaintBackgroundWidth(resources.getDimension(R.dimen.progress_paint_width))// 进度条背景画笔的宽度
            .setProgressPaintWidth(resources.getDimension(R.dimen.progress_paint_width))// 当前进度画笔的宽度
            .resetValue()// 通过代码设置完属性之后，需要调用，重新绘制
    }
}
