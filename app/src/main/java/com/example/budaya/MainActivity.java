package com.example.budaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnRumah,btnTari;
    public static final String JENIS_GALERI_KEY ="JENIS GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnRumah = findViewById(R.id.btn_buka_nama_rumah);
        btnTari = findViewById(R.id.btn_buka_nama_tari);
        btnRumah.setOnClickListener(view -> bukaGaleri("Rumah"));
        btnTari.setOnClickListener(view -> bukaGaleri("Tari"));
    }

    private void bukaGaleri(String jenisBudaya) {
        Log.d("MAIN","Buka activity budaya");
        Intent intent=new Intent(this, GaleryActivity.class);
        intent.putExtra(JENIS_GALERI_KEY,jenisBudaya);
        startActivity(intent);
    }

}