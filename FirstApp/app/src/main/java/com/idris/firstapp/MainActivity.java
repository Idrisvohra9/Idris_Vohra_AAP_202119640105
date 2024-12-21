package com.idris.firstapp;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    ImageView upArrow, downArrow, leftArrow, rightArrow;
    CardView box;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        upArrow = findViewById(R.id.upArrow);
        downArrow = findViewById(R.id.downArrow);
        leftArrow = findViewById(R.id.leftArrow);
        rightArrow = findViewById(R.id.rightArrow);
        box = findViewById(R.id.cardBox);
        upArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.flip_up);
                box.startAnimation(animation);
            }
        });
        downArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.flip_down);
                box.startAnimation(animation);
            }
        });
        leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.flip_left);
                box.startAnimation(animation);
            }
        });
        rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.flip_right);
                box.startAnimation(animation);
            }
        });
    }
}