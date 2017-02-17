package com.roll.numberpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker npHH = (NumberPicker) findViewById(R.id.hh);
        NumberPicker npMM = (NumberPicker) findViewById(R.id.mm);
        NumberPicker npSS = (NumberPicker) findViewById(R.id.ss);
        npHH.setMinValue(0);
        npHH.setMaxValue(23);
        npMM.setMinValue(0);
        npMM.setMaxValue(59);
        npSS.setMinValue(0);
        npSS.setMaxValue(59);

    }
}
