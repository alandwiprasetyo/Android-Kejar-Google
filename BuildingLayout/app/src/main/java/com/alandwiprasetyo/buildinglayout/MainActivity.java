package com.alandwiprasetyo.buildinglayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToScroolLayout(View view) {
        startActivity(new Intent(this, ScroolViewActivity.class));
    }

    public void moveToLinearLayout(View view) {
        startActivity(new Intent(this, LinearViewActivity.class));
    }

    public void moveToTransitionActivity(View view) {
        startActivity(new Intent(this, TransitionActivity.class));
    }
}
