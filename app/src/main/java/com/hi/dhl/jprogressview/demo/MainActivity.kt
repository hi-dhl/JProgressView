package com.hi.dhl.jprogressview.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            circleProgresssView0
                    .setProgress(60F)
                    .setMaxProgress(300)
                    .setReverse(false)
                    .startAnimal()
            circleProgresssView.setProgress(80f).setReverse(false).startAnimal()
            circleProgresssView2.setProgress(70F).setReverse(false).startAnimal()
            circleProgresssView3.setProgress(50f).setReverse(false).startAnimal()
            circleProgresssView4.setProgress(90F).setReverse(false).startAnimal()
            circleProgresssView5.setProgress(60F).setReverse(false).startAnimal()
        }
//
        btnResver.setOnClickListener {
            circleProgresssView0.setProgress(90f).setReverse(true).startAnimal()
            circleProgresssView.setProgress(80f).setReverse(true).startAnimal()
            circleProgresssView2.setProgress(70F).setReverse(true).startAnimal()
            circleProgresssView3.setProgress(50f).setReverse(true).startAnimal()
            circleProgresssView4.setProgress(90F).setReverse(true).startAnimal()
            circleProgresssView5.setProgress(60F).setReverse(true).startAnimal()
        }
    }
}
