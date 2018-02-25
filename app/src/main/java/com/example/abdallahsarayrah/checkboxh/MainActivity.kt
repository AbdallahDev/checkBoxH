package com.example.abdallahsarayrah.checkboxh

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        home.setBackgroundColor(Color.parseColor("#000000"))
        chkb_ktln.setTextColor(Color.WHITE)
        chkb_php.setTextColor(Color.WHITE)
        chkb_java.setTextColor(Color.WHITE)
        textView.setTextColor(Color.WHITE)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25F)
    }

    fun showLang(v: View) {
        var langs = ArrayList<String>()

        if (chkb_ktln.isChecked) langs.add(chkb_ktln.text.toString())
        if (chkb_php.isChecked) langs.add(chkb_php.text.toString())
        if (chkb_java.isChecked) langs.add(chkb_java.text.toString())

        var lang_string = ""
        for (x in langs) lang_string += x + ", "

        textView.text = lang_string

    }

}
