package com.example.countdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {

    var second = 10
    //ミリ秒単位で指定
    val timer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //残り時間の表示
        secondText.text=second.toString()

        //STARTボタンのタップ
        startButton.setOnClickListener{
            startButton.isVisible =false



        }
    }
}
