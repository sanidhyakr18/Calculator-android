package com.sandystudios.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnDEC;
    Button btnDEL;
    Button btnCLR;
    Button btnNEG;
    Button btnPER;
    Button btnDIV;
    Button btnMUL;
    Button btnSUB;
    Button btnADD;
    Button btnEQL;
    TextView tvCTRL;
    TextView tvRES;
    double val1 = Double.NaN;
    double val2;
    char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCTRL.setText(tvCTRL.getText().toString() + "9");
            }
        });
        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = '+';
                tvRES.setText(String.valueOf(val1) + "+");
                tvCTRL.setText(null);
            }
        });
        btnSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = '-';
                tvRES.setText(String.valueOf(val1) + "-");
                tvCTRL.setText(null);
            }
        });
        btnMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = '*';
                tvRES.setText(String.valueOf(val1) + "×");
                tvCTRL.setText(null);
            }
        });
        btnDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = '÷';
                tvRES.setText(String.valueOf(val1) + "÷");
                tvCTRL.setText(null);
            }
        });
        btnEQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = '=';
                tvRES.setText(tvRES.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                tvCTRL.setText(null);
            }
        });
        btnDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvCTRL.getText().length() > 0) {
                    CharSequence name = tvCTRL.getText().toString();
                    tvCTRL.setText((name.subSequence(0, name.length() - 1)));
                }
            }
        });
        btnCLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                tvCTRL.setText(null);
                tvRES.setText(null);
            }
        });
    }

    private void compute() {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(tvCTRL.getText().toString());
            switch (action) {
                case '+':
                    val1 = val1 + val2;
                    break;
                case '-':
                    val1 = val1 - val2;
                    break;
                case '*':
                    val1 = val1 * val2;
                    break;
                case '÷':
                    val1 = val1 / val2;
                    break;

                case '=':
                    break;
            }
        } else {
            val1 = Double.parseDouble(tvCTRL.getText().toString());
        }
    }

    private void setupViews() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDEC = findViewById(R.id.btnDEC);
        btnDEL = findViewById(R.id.btnDEL);
        btnCLR = findViewById(R.id.btnCLR);
        btnNEG = findViewById(R.id.btnNEG);
        btnPER = findViewById(R.id.btnPER);
        btnDIV = findViewById(R.id.btnDIV);
        btnMUL = findViewById(R.id.btnMUL);
        btnSUB = findViewById(R.id.btnSUB);
        btnADD = findViewById(R.id.btnADD);
        btnEQL = findViewById(R.id.btnEQL);
        tvCTRL = findViewById(R.id.tvCTRL);
        tvRES = findViewById(R.id.tvRES);
    }

}