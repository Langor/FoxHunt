package com.example.lango.foxhunt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.Random
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val field: IntArray = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
    var rnd = Random()
    var tcount = 0
    var fcount = 4

    fun createField() {
        var i = 4
        var num1 = 0
        var num2 = 0
        while (i > 0) {
            num1 = rnd.nextInt(4)
            num2 = rnd.nextInt(4)
            if (field[num1 * 4 + num2] != -1) {
                for(item in 0..3) {
                    if (field[num1 * 4 + item] != -1) field[num1 * 4 + item]++
                    if (field[item * 4 + num2] != -1) field[item * 4 + num2]++
                }
                //придумать обработку диагоналей
                field[num1 * 4 + num2] = -1
                i--
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn00: Button = findViewById(R.id.button00) as Button
        val btn01: Button = findViewById(R.id.button01) as Button
        val btn02: Button = findViewById(R.id.button02) as Button
        val btn03: Button = findViewById(R.id.button03) as Button
        val btn10: Button = findViewById(R.id.button10) as Button
        val btn11: Button = findViewById(R.id.button11) as Button
        val btn12: Button = findViewById(R.id.button12) as Button
        val btn13: Button = findViewById(R.id.button13) as Button
        val btn20: Button = findViewById(R.id.button20) as Button
        val btn21: Button = findViewById(R.id.button21) as Button
        val btn22: Button = findViewById(R.id.button22) as Button
        val btn23: Button = findViewById(R.id.button23) as Button
        val btn30: Button = findViewById(R.id.button30) as Button
        val btn31: Button = findViewById(R.id.button31) as Button
        val btn32: Button = findViewById(R.id.button32) as Button
        val btn33: Button = findViewById(R.id.button33) as Button
        val btn_ng: Button = findViewById(R.id.button_newgame) as Button
        val txt_tcount: TextView = findViewById(R.id.textView_tcount) as TextView
        val txt_fcount: TextView = findViewById(R.id.textView_fcount) as TextView

        createField()

        txt_fcount.setText(fcount.toString())
        txt_tcount.setText(tcount.toString())

        btn00.setOnClickListener(){
            if (field[0] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn00.setText("F")
            }
            else
                btn00.setText(field[0].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn01.setOnClickListener(){
            if (field[1] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn01.setText("F")
            }
            else
                btn01.setText(field[1].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn02.setOnClickListener(){
            if (field[2] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn02.setText("F")
            }
            else
                btn02.setText(field[2].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn03.setOnClickListener(){
            if (field[3] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn03.setText("F")
            }
            else
                btn03.setText(field[3].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn10.setOnClickListener(){
            if (field[4] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn10.setText("F")
            }
            else
                btn10.setText(field[4].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn11.setOnClickListener(){
            if (field[5] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn11.setText("F")
            }
            else
                btn11.setText(field[5].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }


        btn12.setOnClickListener(){
            if (field[6] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn12.setText("F")
            }
            else
                btn12.setText(field[6].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn13.setOnClickListener(){
            if (field[7] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn13.setText("F")
            }
            else
                btn13.setText(field[7].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn20.setOnClickListener(){
            if (field[8] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn20.setText("F")
            }
            else
                btn20.setText(field[8].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn21.setOnClickListener(){
            if (field[9] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn21.setText("F")
            }
            else
                btn21.setText(field[9].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn22.setOnClickListener(){
            if (field[10] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn22.setText("F")
            }
            else
                btn22.setText(field[10].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn23.setOnClickListener(){
            if (field[11] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn23.setText("F")
            }
            else
                btn23.setText(field[11].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn30.setOnClickListener(){
            if (field[12] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn30.setText("F")
            }
            else
                btn30.setText(field[12].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn31.setOnClickListener(){
            if (field[13] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn31.setText("F")
            }
            else
                btn31.setText(field[13].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn32.setOnClickListener(){
            if (field[14] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn32.setText("F")
            }
            else
                btn32.setText(field[14].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }

        btn33.setOnClickListener(){
            if (field[15] == -1) {
                fcount--
                txt_fcount.setText(fcount.toString())
                btn33.setText("F")
            }
            else
                btn33.setText(field[15].toString())
            tcount++
            txt_tcount.setText(tcount.toString())
        }


        btn_ng.setOnClickListener(){
            tcount = 0
            fcount = 4
            for (i in 0..15)
                field[i]=0

            btn00.setText("")
            btn01.setText("")
            btn02.setText("")
            btn03.setText("")
            btn10.setText("")
            btn11.setText("")
            btn12.setText("")
            btn13.setText("")
            btn20.setText("")
            btn21.setText("")
            btn22.setText("")
            btn23.setText("")
            btn30.setText("")
            btn31.setText("")
            btn32.setText("")
            btn33.setText("")
            txt_fcount.setText(fcount.toString())
            txt_tcount.setText(tcount.toString())

            createField()
        }
    }

}
