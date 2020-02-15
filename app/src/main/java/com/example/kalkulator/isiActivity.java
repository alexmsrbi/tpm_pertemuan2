package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class isiActivity extends AppCompatActivity {
    private TextView tvHasil;
    private EditText etLebar,etTinggi;
    private Button btnHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);
        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasilJajar);
        etLebar = findViewById(R.id.et_alasJajar);
        etTinggi = findViewById(R.id.et_tinggiJajar);
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAlasJajar = etLebar.getText().toString();
                    String sTinggi = etTinggi.getText().toString();
                    double alasJajar = Double.parseDouble(sAlasJajar);
                    double Tinggi = Double.parseDouble(sTinggi);
                    double Hasil = alasJajar*Tinggi;
                    String sHasil = String.valueOf(Hasil);
                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Ada Yang Masih Kosong",Toast.LENGTH_SHORT).show();
                    //PopUp Jika data Ada yang kosong
                }
            }
        });

    }
}
