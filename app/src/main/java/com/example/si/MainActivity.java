package com.example.si;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etprincipal, etrate, ettime;
    private Button btnCalculate;
    private TextView tvOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etprincipal= findViewById(R.id.etprincipal);
        etrate = findViewById(R.id.etrate);
        ettime = findViewById(R.id.ettime);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvOutput = findViewById(R.id.tvOutput);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int principal = Integer.parseInt(etprincipal.getText().toString());
                int rate= Integer.parseInt(etrate.getText().toString());
                int time= Integer.parseInt(ettime.getText().toString());

                SI si= new SI(principal,rate,time);
                int res= si.SimpleInterest();
                tvOutput.setText(Integer.toString(res));


            }
        });

    }
}
