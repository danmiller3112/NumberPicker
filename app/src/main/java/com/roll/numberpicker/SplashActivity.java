package com.roll.numberpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {
    private Button setTimerBtn;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setTimerBtn = (Button) findViewById(R.id.btn_settimer);
        setTimerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_settimer) {
            Intent intent = new Intent(this, PopActivity.class);
            startActivity(intent);
        }
    }
}
