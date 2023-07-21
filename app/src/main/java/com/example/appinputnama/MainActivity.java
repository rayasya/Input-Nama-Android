package com.example.appinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt_nama;
    TextView lbl_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_nama = findViewById(R.id.txt_nama);
        lbl_nama = findViewById(R.id.lbl_nama);
    }

    public void TampilNama(View v){
        lbl_nama.setText(txt_nama.getText());
    }
}