package com.ehlb.toaste

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class Toaste(mContext: Context) : Toast(mContext) {
    companion object {
        const val TYPE_INFO = 0
        const val TYPE_SUCCESS = 1
        const val TYPE_WARNING = 2
        const val TYPE_ERROR = 3
        const val TYPE_CUSTOM = 4
        var LENGTH_LONG = Toast.LENGTH_SHORT
        var LENGTH_SHORT = Toast.LENGTH_LONG
        fun makeText(
            context: Context,
            message: String?,
            duration: Int = LENGTH_LONG,
            type: Int = TYPE_INFO,
            withAnimation: Boolean = true,
            iconID: Int = R.drawable.ic_info,
            bgStartColor: Int = R.color.bg_start_color,
            bgEndColor: Int = R.color.bg_end_color,
            radius: Float = 50f,
            textColor: Int = android.R.color.white,
            iconColor: Int = android.R.color.white,
            gravity: Int = Gravity.BOTTOM
        ): Toaste {
            var toaste = Toaste(context)
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View?
            view = inflater.inflate(R.layout.view_toast, null)
            var icon: ImageView? = null
            if (view != null) {
                icon = view.findViewById(R.id.toast_icon)
            }
            var text: TextView? = null
            if (view != null) {
                text = view.findViewById(R.id.toast_text)
            }
            val bg: LinearLayout = view.findViewById(R.id.layout_bg)

            val gd = GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(
                    ContextCompat.getColor(context, bgStartColor),
                    ContextCompat.getColor(context, bgEndColor)
                )
            )
            gd.cornerRadius = radius

            if (icon != null) when (type) {
                TYPE_SUCCESS -> {
                    icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success))
                    bg.background = ContextCompat.getDrawable(
                        context,
                        R.drawable.toast_success_background
                    )
                }
                TYPE_WARNING -> {
                    icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_warning))
                    bg.background = ContextCompat.getDrawable(
                        context,
                        R.drawable.toast_warning_background
                    )
                }
                TYPE_ERROR -> {
                    icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error))
                    bg.background = ContextCompat.getDrawable(
                        context,
                        R.drawable.toast_error_background
                    )
                }
                TYPE_CUSTOM -> {
                    icon.setImageDrawable(ContextCompat.getDrawable(context, iconID))
                    bg.background = gd
                }
                else -> {
                    icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info))
                    bg.background = ContextCompat.getDrawable(
                        context,
                        R.drawable.toast_info_background
                    )
                }
            }
            if (text != null) {
                text.text = message
            }

            text?.setTextColor(ContextCompat.getColor(context, textColor))
            icon?.setColorFilter(
                ContextCompat.getColor(context, iconColor),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            toaste.duration = duration
            toaste.view = view
            if (gravity == Gravity.CENTER)
                toaste.setGravity(gravity, 0, 0)
            else
                toaste.setGravity(gravity, 0, 63)

            Log.d("XXX", "" + toaste.yOffset)

            if (withAnimation) {
                val bgPulse: Animation = AnimationUtils.loadAnimation(context, R.anim.anim_pulse)
                bg.animation = bgPulse
            }
            return toaste
        }
    }
}