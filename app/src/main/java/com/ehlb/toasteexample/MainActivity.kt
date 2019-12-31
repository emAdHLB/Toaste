package com.ehlb.toasteexample

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ehlb.toaste.Toaste

class MainActivity : AppCompatActivity() {
    private var toaste: Toaste? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun hideToast() {
        if (toaste != null) {
            toaste?.cancel()
            toaste = null
        }
    }

    fun t1(view: View) {
        hideToast()
        toaste =
            Toaste.makeText(this, "Normal toast")
        toaste?.show()
    }

    fun t2(view: View) {
        hideToast()
        toaste =
            Toaste.makeText(this, "Normal toast", Toaste.LENGTH_SHORT, Toaste.TYPE_SUCCESS)
        toaste?.show()
    }

    fun t3(view: View) {
        hideToast()
        toaste =
            Toaste.makeText(this, "Normal toast", Toaste.LENGTH_SHORT, Toaste.TYPE_WARNING)
        toaste?.show()
    }

    fun t4(view: View) {
        hideToast()
        toaste =
            Toaste.makeText(
                this,
                "Normal toast",
                Toaste.LENGTH_SHORT,
                Toaste.TYPE_CUSTOM,
                false,
                R.drawable.ic_info,
                R.color.colorPrimary,
                R.color.colorAccent,
                5f,
                android.R.color.black,
                android.R.color.black,
                Gravity.BOTTOM
            )
        toaste?.show()
    }
}