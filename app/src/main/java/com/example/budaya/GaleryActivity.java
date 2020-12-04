package com.example.budaya;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.budaya.model.Budaya;

import java.util.List;

public class GaleryActivity extends AppCompatActivity {

    List<Budaya> budayas;
    int indeksTampil =0;
    String jenisBudaya;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txJudul,txAsal,txNama,txDeskripsi;
    ImageView ivFotoBudaya;

    @RequiresApi(api = Build.VERSION_CODES.CUR_DEVELOPMENT)
    @Override
//    protected void onCreate(Bundle savedInstanceState) {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        Intent intent = getIntent();
        jenisBudaya = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        budayas = DataProvider.getMenusByTipe(this,jenisBudaya);
        inisialisasiView();
        tampilkanPropil();
    }

    @RequiresApi(api = Build.VERSION_CODES.CUR_DEVELOPMENT)
    private void inisialisasiView(){

        btnPertama =findViewById(R.id.btnPertama);
        btnSebelumnya =findViewById(R.id.btnSebelumnya);
        btnBerikutnya =findViewById(R.id.btnBerikutnya);
        btnTerakhir =findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> menuPertama());
        btnTerakhir.setOnClickListener(view -> menuTerakhir());
        btnSebelumnya.setOnClickListener(view -> menuSebelumnya());
        btnBerikutnya.setOnClickListener(view -> menuBerikutnya());

        txNama =findViewById(R.id.txNama);
        txAsal =findViewById(R.id.txAsal);
        txDeskripsi=findViewById(R.id.txDeskripsi);
        ivFotoBudaya = findViewById(R.id.gambarRumah);

        txJudul =findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam "+jenisBudaya+ " Tradisional");
    }

    @RequiresApi(api = Build.VERSION_CODES.CUR_DEVELOPMENT)
    private void tampilkanPropil() {

       Budaya p=budayas.get(indeksTampil);
        Log.d("Pencernaan","Menampilkan Pencernaan"+p.getJenis());
        txNama.setText(p.getNama());
        txAsal.setText(p.getAsal());
        txDeskripsi.setText(p.getDeskripsi());

        ivFotoBudaya.setImageDrawable(this.getDrawable(p.getGambar()));
    }

    @RequiresApi(api = Build.VERSION_CODES.CUR_DEVELOPMENT)
    private void menuPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanPropil();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.CUR_DEVELOPMENT)
    private void menuTerakhir() {
        int posAkhir = budayas.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi_terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanPropil();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.CUR_DEVELOPMENT)
    private void menuBerikutnya() {
        if (indeksTampil == budayas.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanPropil();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.CUR_DEVELOPMENT)
    private void menuSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanPropil();
        }
    }

}