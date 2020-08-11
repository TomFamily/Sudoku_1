package com.example.nine_code

import android.graphics.Rect
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ninePointArray = arrayOfNulls<Rect>(9)
    var passwardArray = arrayOfNulls<Int>(5)
    var temporaryPasswordArray = arrayOfNulls<Int>(5)
    var isFirst: Boolean = true
    var first:Int = 0
    var second:Int = 0
    var third = 0

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (temporaryPasswordArray[1] == null){
//            println("空的 1" )
//
//        }else if (temporaryPasswordArray[2] == null){
//            println("空的 2" )
//
//        }else if (temporaryPasswordArray[3] == null){
//
//            println("空的 3" )
//        }else if (temporaryPasswordArray[4] == null){
//
//            println("空的 4" )
//
//        }

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if(true){
        var rect1 = calculateRect(wll1).also { ninePointArray[0] = it }
        var rect2 = calculateRect(wll2).also { ninePointArray[1] = it }
        var rect3 = calculateRect(wll3).also { ninePointArray[2] = it }

        var rect4 = calculateRect(wll4).also { ninePointArray[3] = it }

        var rect5 = calculateRect(wll5).also { ninePointArray[4] = it }

        var rect6 = calculateRect(wll6).also { ninePointArray[5] = it }

        var rect7 = calculateRect(wll7).also { ninePointArray[6] = it }

        var rect8 = calculateRect(wll8).also { ninePointArray[7] = it }

        var rect9 = calculateRect(wll9).also { ninePointArray[8] = it }

       }

            when(event?.action){
                MotionEvent.ACTION_DOWN ->{
                    for (item in ninePointArray.indices){
                        if (ninePointArray[item]?.contains(event.x.toInt(),event.y.toInt())!!){
                                if (item == 0){
                                    wll1.background = getDrawable(R.drawable.circle_selected)
                                    first = 1
                                }else if (item == 1){
                                    wll2.background = getDrawable(R.drawable.circle_selected)
                                    first = 2
                                }else if (item == 2){
                                    wll3.background = getDrawable(R.drawable.circle_selected)
                                    first = 3
                                }else if (item == 3){
                                    wll4.background = getDrawable(R.drawable.circle_selected)
                                    first = 4
                                }else if (item == 4){
                                    wll5.background = getDrawable(R.drawable.circle_selected)
                                    first = 5
                                }else if (item == 5){
                                    wll6.background = getDrawable(R.drawable.circle_selected)
                                    first = 6
                                }else if (item == 6){
                                    wll7.background = getDrawable(R.drawable.circle_selected)
                                    first = 7
                                }else if (item == 7){
                                    wll8.background = getDrawable(R.drawable.circle_selected)
                                    first = 8
                                }else if (item == 8){
                                    wll9.background = getDrawable(R.drawable.circle_selected)
                                    first = 9
                                }
                            temporaryPasswordArray[0] = first
                            third = first
                        }
                    }
                }
                MotionEvent.ACTION_MOVE ->{
                    if (first == 0){
                        var i = 0
                    }else{
                        var i = 1
                    }
                    for (item in ninePointArray.indices){
                        if (ninePointArray[item]?.contains(event.x.toInt(),event.y.toInt())!!){
                            if (item == 0){
                                wll1.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 1
                                }else{
                                    second = 1
                                }
                            }else if (item == 1){
                                wll2.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 2
                                }else{
                                    second = 2
                                }
                            }else if (item == 2){
                                wll3.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 3
                                }else{
                                    second = 3
                                }
                            }else if (item == 3){
                                wll4.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 4
                                }else{
                                    second = 4
                                }
                            }else if (item == 4){
                                wll5.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 5
                                }else{
                                    second = 5
                                }
                            }else if (item == 5){
                                wll6.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 6
                                }else{
                                    second = 6
                                }
                            }else if (item == 6){
                                wll7.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 7
                                }else{
                                    second = 7
                                }
                            }else if (item == 7){
                                wll8.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 8
                                }else{
                                    second = 8
                                }
                            }else if (item == 8){
                                wll9.background = getDrawable(R.drawable.circle_selected)
                                if (first == 0){
                                    first = 9
                                }else{
                                    second = 9
                                }
                            }
                            if (second == 0 && first != 0){
                                temporaryPasswordArray[0] = first
                            }else if (second != 0 && third != second){
                                if (temporaryPasswordArray[1] == null){
                                        temporaryPasswordArray[1] = second

                                }else if (temporaryPasswordArray[2] == null){
                                    temporaryPasswordArray[2] = second

                                }else if (temporaryPasswordArray[3] == null){
                                    temporaryPasswordArray[3] = second

                                }else if (temporaryPasswordArray[4] == null){
                                    temporaryPasswordArray[4] = second
                                    println("44444444444444444 " +temporaryPasswordArray[4])

                                }
                                third = second
                            }
                            println("second $second")
                            second = 0
                        }



                    }
                }
                MotionEvent.ACTION_UP ->{
                    wll2.background = getDrawable(R.drawable.circle_normal)
                    wll1.background = getDrawable(R.drawable.circle_normal)
                    wll3.background = getDrawable(R.drawable.circle_normal)
                    wll4.background = getDrawable(R.drawable.circle_normal)
                    wll5.background = getDrawable(R.drawable.circle_normal)
                    wll6.background = getDrawable(R.drawable.circle_normal)
                    wll7.background = getDrawable(R.drawable.circle_normal)
                    wll8.background = getDrawable(R.drawable.circle_normal)
                    wll9.background = getDrawable(R.drawable.circle_normal)

                    println("0 " + temporaryPasswordArray[0])
                    println("1 " +temporaryPasswordArray[1])
                    println("2 " +temporaryPasswordArray[2])
                    println("3 " +temporaryPasswordArray[3])
                    println("4 " +temporaryPasswordArray[4])

                    if (temporaryPasswordArray[4] == null){
                        yktextView.text = "密码不够5位数"
                        for (a in temporaryPasswordArray.indices){
                            temporaryPasswordArray[a] = null
                        }
                    }else{
                        if (isFirst == true){
                            if (temporaryPasswordArray[4] != null){
                                yktextView.text = "密码设置成功"
                                passwardArray[0] = temporaryPasswordArray[0]
                                passwardArray[1] = temporaryPasswordArray[1]
                                passwardArray[2] = temporaryPasswordArray[2]
                                passwardArray[3] = temporaryPasswordArray[3]
                                passwardArray[4] = temporaryPasswordArray[4]
                                println("密码设置成功")
                                println("0 " + temporaryPasswordArray[0])
                                println("1 " +temporaryPasswordArray[1])
                                println("2 " +temporaryPasswordArray[2])
                                println("3 " +temporaryPasswordArray[3])
                                println("4 " +temporaryPasswordArray[4])

                                isFirst = false
                            }
                        }else{
                            yktextView.text = "请输入密码"
                            if (passwardArray[0] == temporaryPasswordArray[0] &&
                                passwardArray[1] == temporaryPasswordArray[1] &&
                                passwardArray[2] == temporaryPasswordArray[2] &&
                                passwardArray[3] == temporaryPasswordArray[3] &&
                                passwardArray[4] == temporaryPasswordArray[4]){
                                yktextView.text = "密码正确"
                            }else{
                                yktextView.text = "密码错误，请重新输入"
                            }
                        }
                    }

                    println("我是密码")
                    println(temporaryPasswordArray.size)
                    println("0" + temporaryPasswordArray[0])
                    println("1" +temporaryPasswordArray[1])
                    println("2" +temporaryPasswordArray[2])
                    println("3" +temporaryPasswordArray[3])
                    println("4" +temporaryPasswordArray[4])

                    println("0" + passwardArray[0])
                    println("1" +passwardArray[1])
                    println("2" +passwardArray[2])
                    println("3" +passwardArray[3])
                    println("4" +passwardArray[4])


                    for (a in temporaryPasswordArray.indices){
                        temporaryPasswordArray[a] = null
                    }
                    first = 0
                    second = 0
                    third = 0
                }
            }

        return super.onTouchEvent(event)
    }

    fun calculateRect(image:ImageView): Rect{
        var rect = Rect()
        image.requestRectangleOnScreen(rect)
        rect.right = rect.left + wll1.width
        rect.bottom = rect.top + wll1.height
        return rect
    }

}
