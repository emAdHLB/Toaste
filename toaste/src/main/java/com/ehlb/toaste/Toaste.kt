package com.ehlb.toaste

import android.annotation.SuppressLint
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

@SuppressLint("InflateParams")
class Toaste(mContext: Context) : Toast(mContext) {
    companion object {
        var LENGTH_LONG = Toast.LENGTH_SHORT
        var LENGTH_SHORT = Toast.LENGTH_LONG

        //regionInfo
        fun makeInfo(
            context: Context,
            message: String?,
            withAnimation: Boolean = true,
            duration: Int = LENGTH_SHORT
        ): Toaste {
            val toaste = Toaste(context)
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View?
            view = inflater.inflate(R.layout.view_toast, null)
            if (view != null) {
                val icon: ImageView = view.findViewById(R.id.toast_icon)
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info))

                val text: TextView = view.findViewById(R.id.toast_text)
                text.text = message
            }

            val bg: LinearLayout = view.findViewById(R.id.layout_bg)
            bg.background = ContextCompat.getDrawable(
                context,
                R.drawable.toast_info_background
            )

            toaste.duration = duration
            toaste.view = view

            if (withAnimation) {
                val bgPulse: Animation = AnimationUtils.loadAnimation(context, R.anim.anim_pulse)
                bg.animation = bgPulse
            }
            return toaste
        }
        //endregion

        //regionSuccess
        fun makeSuccess(
            context: Context,
            message: String?,
            withAnimation: Boolean = true,
            duration: Int = LENGTH_SHORT
        ): Toaste {
            val toaste = Toaste(context)
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View?
            view = inflater.inflate(R.layout.view_toast, null)
            if (view != null) {
                val icon: ImageView = view.findViewById(R.id.toast_icon)
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success))

                val text: TextView = view.findViewById(R.id.toast_text)
                text.text = message
            }

            val bg: LinearLayout = view.findViewById(R.id.layout_bg)
            bg.background = ContextCompat.getDrawable(
                context,
                R.drawable.toast_success_background
            )

            toaste.duration = duration
            toaste.view = view

            if (withAnimation) {
                val bgPulse: Animation = AnimationUtils.loadAnimation(context, R.anim.anim_pulse)
                bg.animation = bgPulse
            }
            return toaste
        }
        //endregion

        //regionWarning
        fun makeWarning(
            context: Context,
            message: String?,
            withAnimation: Boolean = true,
            duration: Int = LENGTH_SHORT
        ): Toaste {
            val toaste = Toaste(context)
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View?
            view = inflater.inflate(R.layout.view_toast, null)
            if (view != null) {
                val icon: ImageView = view.findViewById(R.id.toast_icon)
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_warning))

                val text: TextView = view.findViewById(R.id.toast_text)
                text.text = message
            }

            val bg: LinearLayout = view.findViewById(R.id.layout_bg)
            bg.background = ContextCompat.getDrawable(
                context,
                R.drawable.toast_warning_background
            )

            toaste.duration = duration
            toaste.view = view

            if (withAnimation) {
                val bgPulse: Animation = AnimationUtils.loadAnimation(context, R.anim.anim_pulse)
                bg.animation = bgPulse
            }
            return toaste
        }
        //endregion

        //regionError
        fun makeError(
            context: Context,
            message: String?,
            withAnimation: Boolean = true,
            duration: Int = LENGTH_SHORT
        ): Toaste {
            val toaste = Toaste(context)
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View?
            view = inflater.inflate(R.layout.view_toast, null)
            if (view != null) {
                val icon: ImageView = view.findViewById(R.id.toast_icon)
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error))

                val text: TextView = view.findViewById(R.id.toast_text)
                text.text = message
            }

            val bg: LinearLayout = view.findViewById(R.id.layout_bg)
            bg.background = ContextCompat.getDrawable(
                context,
                R.drawable.toast_error_background
            )

            toaste.duration = duration
            toaste.view = view

            if (withAnimation) {
                val bgPulse: Animation = AnimationUtils.loadAnimation(context, R.anim.anim_pulse)
                bg.animation = bgPulse
            }
            Toast.LENGTH_LONG
            return toaste
        }
        //endregion

        //regionCustom
        fun makeCustom(
            context: Context,
            message: String?,
            withAnimation: Boolean = true,
            duration: Int = LENGTH_LONG,
            iconID: Int = R.drawable.ic_info,
            bgStartColor: Int = R.color.bg_start_color,
            bgEndColor: Int = R.color.bg_end_color,
            radius: Float = 50f,
            textColor: Int = android.R.color.white,
            iconColor: Int = android.R.color.white,
            gravity: Int = Gravity.BOTTOM
        ): Toaste {
            val toaste = Toaste(context)
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View?
            view = inflater.inflate(R.layout.view_toast, null)
            if (view != null) {
                val icon: ImageView = view.findViewById(R.id.toast_icon)
                try {
                    icon.setImageDrawable(ContextCompat.getDrawable(context, iconID))
                } catch (e: Throwable) {
                    icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info))
                }

                val text: TextView = view.findViewById(R.id.toast_text)
                text.text = message
            }

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
            bg.background = gd

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
                toaste.setGravity(gravity, 0, toaste.yOffset)

            if (withAnimation) {
                val bgPulse: Animation = AnimationUtils.loadAnimation(context, R.anim.anim_pulse)
                bg.animation = bgPulse
            }
            return toaste
        }
        //endregion
    }
}