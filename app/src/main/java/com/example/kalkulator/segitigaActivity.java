package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segitigaActivity extends AppCompatActivity {
    private TextView tvHasil;
    private EditText etAlas,etTinggi;
    private Button btnHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        tvHasil = findViewById(R.id.tv_hasilSegitiga);
        etAlas = findViewById(R.id.et_alas);
        etTinggi = findViewById(R.id.et_tinggiSegi);
        btnHasil = findViewById(R.id.btn_hasilLSegi);
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    String sAlas = etAlas.getText().toString();
                    String sTinggi = etTinggi.getText().toString();
                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);
                    double Luas = alas * tinggi / 2;
                    String sLuas = String.valueOf(Luas);
                    tvHasil.setText(sLuas);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Ada yang Kosong",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
