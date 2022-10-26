package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, Result::class.java)


        btnClear.setOnClickListener{
            edtNo1.setText("")
            edtNo2.setText("")
        }
        btnPlus.setOnClickListener{
            if(edtNo1.text.toString() !="" && edtNo2.text.toString() !=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()
                var sum = no1 + no2
                intent.putExtra("Value", sum)
                startActivity(intent)

            }else if (edtNo1.text.toString() == "" || edtNo2.text.toString() == "") {
                intent.putExtra("Value", "Немає відповіді!")
                startActivity(intent)
                //Toast.makeText(this, "Please!!!!", Toast.LENGTH_LONG).show()
            }
        }
        btnMinus.setOnClickListener{
            if(edtNo1.text.toString() !="" && edtNo2.text.toString() !=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()
                val min = no1 - no2
                intent.putExtra("Value", min)
                startActivity(intent)

            }else if (edtNo1.text.toString() == "" || edtNo2.text.toString() == "") {
                intent.putExtra("Value", "Немає відповіді!")
                startActivity(intent)
            }
        }
        btnMult.setOnClickListener{
            if(edtNo1.text.toString() !="" && edtNo2.text.toString() !=""
                && edtNo1.text.toString().toInt() != 0 && edtNo2.text.toString().toInt() != 0){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val mul = no1 * no2

                intent.putExtra("Value", mul)
                startActivity(intent)

            }else if (edtNo1.text.toString().toInt() != 0 || edtNo2.text.toString().toInt() != 0) {
                    val mul = 0
                    intent.putExtra("Value", mul)
                    startActivity(intent)

            }else if (edtNo1.text.toString() == "" || edtNo2.text.toString() == "") {
                intent.putExtra("Value", "Немає відповіді!")
                startActivity(intent)
            }
        }
        btnDivision.setOnClickListener{
            if(edtNo1.text.toString() !="" && edtNo2.text.toString() !=""
                && edtNo2.text.toString().toInt() != 0){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val div = no1 / no2

                intent.putExtra("Value", div)
                startActivity(intent)

            }else if (edtNo1.text.toString() == "" || edtNo2.text.toString() == "" || edtNo1.text.toString().toInt() == 0
                ||edtNo2.text.toString().toInt() == 0) {
                intent.putExtra("Value", "Немає відповіді!")
                startActivity(intent)
            }
        }


    }

}