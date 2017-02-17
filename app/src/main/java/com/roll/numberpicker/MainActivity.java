package com.roll.numberpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NumberPicker.OnValueChangeListener {

    private TextView timerTxt;
    private NumberPicker npHH, npMM, npSS;
    private Button startBtn, resetBtn, cancelBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerTxt = (TextView) findViewById(R.id.timer_txt);
        startBtn = (Button) findViewById(R.id.btn_start);
        resetBtn = (Button) findViewById(R.id.btn_reset);
        cancelBtn = (Button) findViewById(R.id.btn_cancel);

        startBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
        cancelBtn.setOnClickListener(this);

        npHH = (NumberPicker) findViewById(R.id.hh);
        npMM = (NumberPicker) findViewById(R.id.mm);
        npSS = (NumberPicker) findViewById(R.id.ss);
        npHH.setMinValue(0);
        npHH.setMaxValue(23);
        npMM.setMinValue(0);
        npMM.setMaxValue(59);
        npSS.setMinValue(0);
        npSS.setMaxValue(59);

        npHH.setOnValueChangedListener(this);
        npMM.setOnValueChangedListener(this);
        npSS.setOnValueChangedListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_start:
                Log.d("onClick: ", "START");
                break;
            case R.id.btn_reset:
                Log.d("onClick: ", "RESET");
                timerTxt.setText("00:00:00");
                npHH.setValue(0);
                npMM.setValue(0);
                npSS.setValue(0);
                break;
            case R.id.btn_cancel:
                Log.d("onClick: ", "CANCEL");
                finish();
                break;
        }

    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i1) {
        int hh = npHH.getValue();
        int mm = npMM.getValue();
        int ss = npSS.getValue();
        String hhTxt = (hh < 10) ? ("0" + hh) : String.valueOf(hh);
        String mmTxt = (mm < 10) ? ("0" + mm) : String.valueOf(mm);
        String ssTxt = (ss < 10) ? ("0" + ss) : String.valueOf(ss);
        timerTxt.setText(hhTxt + ":" + mmTxt + ":" + ssTxt);

    }
}
