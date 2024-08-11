package com.nemosofts.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nemosofts.swipebutton.OnStateChangeListener;
import com.nemosofts.swipebutton.SwipeButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwipeButton enableButton1 =  findViewById(R.id.swipe_btn);
        enableButton1.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Toast.makeText(MainActivity.this, "State: " + active, Toast.LENGTH_SHORT).show();
            }
        });

        SwipeButton enableButton2 = findViewById(R.id.swipe_btn2);
        enableButton2.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Toast.makeText(MainActivity.this, "State: " + active, Toast.LENGTH_SHORT).show();
            }
        });

        SwipeButton enableButton3 = findViewById(R.id.swipe_btn3);
        enableButton3.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Toast.makeText(MainActivity.this, "State: " + active, Toast.LENGTH_SHORT).show();
            }
        });

        SwipeButton enableButton4 = findViewById(R.id.swipe_btn4);
        enableButton4.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Toast.makeText(MainActivity.this, "State: " + active, Toast.LENGTH_SHORT).show();
            }
        });

        SwipeButton enableButton5 = findViewById(R.id.swipe_btn5);
        enableButton5.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Toast.makeText(MainActivity.this, "State: " + active, Toast.LENGTH_SHORT).show();
            }
        });
    }
}