package com.example.otpview

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        et_OTP1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
            }

            override fun onTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
            }

            override fun afterTextChanged(editable: Editable) {
                if (et_OTP1.text.toString().length == 1) {
                    et_OTP2.requestFocus()
                }
            }
        })

        et_OTP2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
            }

            override fun onTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
                if (et_OTP2.text.toString().isEmpty()) {
                    et_OTP1.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable) {
                if (et_OTP2.text.toString().length == 1) {
                    et_OTP3.requestFocus()
                }
            }
        })

        et_OTP3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
            }

            override fun onTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
                if (et_OTP3.text.toString().isEmpty()) {
                    et_OTP2.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable) {
                if (et_OTP3.text.toString().length == 1) {
                    et_OTP4.requestFocus()
                }
            }
        })

        et_OTP4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
            }

            override fun onTextChanged(
                charSequence: CharSequence,
                i: Int,
                i1: Int,
                i2: Int
            ) {
                if (et_OTP4.text.toString().isEmpty()) {
                    et_OTP3.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable) {
//                clearAndRestart()
                Log.d(
                    TAG,
                    "Call the method for further processing in real case, here I am clearing the data"
                )
            }
        })
    }

    fun clearAndRestart() {
        if (et_OTP4.text.toString().length == 1) {
            et_OTP1.requestFocus()

            et_OTP1.setText("")
            et_OTP2.setText("")
            et_OTP3.setText("")
            et_OTP4.setText("")
        }
    }
}
