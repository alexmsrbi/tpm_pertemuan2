package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSegitiga,btnJajar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJajar = findViewById(R.id.btn_jajar);
        btnSegitiga = findViewById(R.id.btn_segitiga);
        btnJajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jajar = new Intent(getApplicationContext(),isiActivity.class);
                startActivity(jajar);
            }
        });
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent segitiga = new Intent(getApplicationContext(), segitigaActivity.class);
                startActivity(segitiga);
            }
        });

    }
}
