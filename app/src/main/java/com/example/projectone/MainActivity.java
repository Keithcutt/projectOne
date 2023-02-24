package com.example.projectone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projectone.R;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        // присваиваем обработчик к кнопкам
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
/*
        // создание обработчика
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // по id определеяем кнопку, вызвавшую этот обработчик
                switch (v.getId()) {
                    case R.id.btnOk:
                        tvOut.setText("Нажата кнопка ОК");
                        break;
                    case R.id.btnCancel:
                        tvOut.setText("Нажата кнопка Cancel");
                        break;
                }
            }
        };

        // присваиваем обработчик к кнопкам
        btnOk.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
 */

    }

    @Override
    public void onClick(View v) {
        // по id определеяем кнопку, вызвавшую этот обработчик
        switch (v.getId()) {
            case R.id.btnOk:
                tvOut.setText("OK button has been pushed");
                break;
            case R.id.btnCancel:
                tvOut.setText("Cancel button has been pushed");
                break;
        }
    }
}