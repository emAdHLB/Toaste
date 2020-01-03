package com.ehlb.toasteexample

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ehlb.toaste.Toaste

class MainActivityK : AppCompatActivity() {
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
            Toaste.makeInfo(
                this,
                "Info Toaste"
            )
        toaste?.show()
    }

    fun t2(view: View) {
        hideToast()
        toaste =
            Toaste.makeSuccess(
                this,
                "Success Toaste",
                false
            )
        toaste?.show()
    }

    fun t3(view: View) {
        hideToast()
        toaste =
            Toaste.makeWarning(
                this,
                "Warning Toaste",
                true
            )
        toaste?.show()
    }

    fun t4(view: View) {
        hideToast()
        toaste =
            Toaste.makeError(
                this,
                "Error Toaste",
                false
            )
        toaste?.show()
    }

    fun t5(view: View) {
        hideToast()
        toaste =
            Toaste.makeCustom(
                this,
                "Custom Toaste",
                true,
                Toaste.LENGTH_SHORT,
                R.drawable.ic_flight_24dp,
                R.color.a,
                R.color.b,
                10f,
                android.R.color.holo_green_light,
                android.R.color.white,
                Gravity.TOP
            )
        toaste?.show()
    }
}