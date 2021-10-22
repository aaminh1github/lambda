package com.example.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     lateinit  var a:EditText
      lateinit var b:EditText
    lateinit var btN:Button
     lateinit var btL:Button
     lateinit var tv1:TextView
   private var num1:Int=0
   private  var num2:Int=0
  private  var c:String=""
  private  var d:String=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a=findViewById(R.id.eta)
        b=findViewById(R.id.etb)
        btN= findViewById<Button>(R.id.bt1)
        btL= findViewById<Button>(R.id.bt2)
        tv1= findViewById<TextView>(R.id.tv1)
       num1=a.text.toString().toInt()
       num2 =b.text.toString().toInt()

        btN.setOnClickListener {
        //tv1.setText(c)
           c= normalSum(a.text.toString().toInt(),b.text.toString().toInt()).toString()
        tv1.text=c}
        btL.setOnClickListener {
            d= lambdaSum(a.text.toString().toInt(),b.text.toString().toInt()).toString()

            tv1.text=d}

    }
//original
    fun normalSum( a: Int, b: Int):Int{
     return a+b
    }
    //lambda
    val lambdaSum={  a:Int,b:Int->
        a+b
    }
}