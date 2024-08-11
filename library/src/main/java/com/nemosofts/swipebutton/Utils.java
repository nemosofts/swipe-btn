package com.nemosofts.swipebutton;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

public class Utils {

    private Utils() {
        throw new IllegalStateException("Utility class");
    }

    static float converPixelsToSp(float px, @NonNull Context context) {
        return px / context.getResources().getDisplayMetrics().scaledDensity;
    }

    static boolean isTouchOutsideInitialPosition(@NonNull MotionEvent event, @NonNull View view) {
        return event.getX() > view.getX() + view.getWidth();
    }
}