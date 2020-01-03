package com.ehlb.toasteexample;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ehlb.toaste.Toaste;

public class MainActivityJ extends AppCompatActivity {
    private Toaste toaste;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void hideToast() {
        if (toaste != null) {
            toaste.cancel();
            toaste = null;
        }
    }

    public void t1(View view) {
        hideToast();
        toaste =
                Toaste.Companion.makeInfo(
                        this,
                        "Info Toaste",
                        true,
                        Toast.LENGTH_LONG
                );
        toaste.show();
    }

    public void t2(View view) {
        hideToast();
        toaste =
                Toaste.Companion.makeSuccess(
                        this,
                        "Success Toaste",
                        true,
                        Toast.LENGTH_LONG
                );
        toaste.show();
    }

    public void t3(View view) {
        hideToast();
        toaste =
                Toaste.Companion.makeWarning(
                        this,
                        "Warning Toaste",
                        true,
                        Toast.LENGTH_LONG
                );
        toaste.show();
    }

    public void t4(View view) {
        hideToast();
        toaste =
                Toaste.Companion.makeError(
                        this,
                        "Error Toaste",
                        true,
                        Toast.LENGTH_LONG
                );
        toaste.show();
    }

    public void t5(View view) {
        hideToast();
        toaste =
                Toaste.Companion.makeCustom(
                        this,
                        "Info Toaste",
                        true,
                        Toast.LENGTH_LONG,
                        R.drawable.ic_flight_24dp,
                        R.color.a,
                        R.color.b,
                        33f,
                        android.R.color.holo_green_light,
                        android.R.color.white,
                        Gravity.CENTER
                );
        toaste.show();
    }
}
