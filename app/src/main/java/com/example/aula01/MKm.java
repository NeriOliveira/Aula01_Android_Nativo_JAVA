package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        EditText edtMKm_prog = (EditText) findViewById(R.id.edtMKm);
        EditText edtKmM_prog = (EditText) findViewById(R.id.edtKmM);
        Button btnConverterMKm_prog = (Button) findViewById(R.id.btnConverterMKm);

        btnConverterMKm_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float km, m;
                m = Float.parseFloat(edtMKm_prog.getText().toString());
                km = m / 1000;
                edtKmM_prog.setText(String.valueOf(km));
            }
        });
    }
}