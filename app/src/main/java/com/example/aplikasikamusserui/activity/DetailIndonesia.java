package com.example.aplikasikamusserui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.aplikasikamusserui.R;
import com.example.aplikasikamusserui.helper.DataHelper;

public class DetailIndonesia extends AppCompatActivity {

    protected Cursor cursor;
    String Bindonesia, sIndonesia, sGambar;
    DataHelper dbHelper;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_indonesia);

        Bundle terima = getIntent().getExtras();

        dbHelper = new DataHelper(this);
        Intent intent = getIntent();

        String merk = terima.getString("merk");

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("select * from indonesia where merk = '" + merk + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            Bindonesia = cursor.getString(0);
            sIndonesia = cursor.getString(1);
        }

        if (Bindonesia.equals("Ada Apa")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Anak")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Anjing")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Apa")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Berdiri")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Duduk")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Ikan")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Kapur")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Kelapa")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Kemari")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Kosong")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Kucing")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Orang tua laki-laki")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Orang tua perempuan")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Pinang")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Pintu")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Sirih")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Sudah")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Tidak apa apa")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Ucapan Selamat (malam hari)")) {
            sGambar = "papua";
        } else if (Bindonesia.equals("Ular")) {
            sGambar = "papua";
        }


        ImageView ivGambar = findViewById(R.id.ivpapua);
        TextView tvMerk = findViewById(R.id.Jindonesia);
        TextView tvIndonesia = findViewById(R.id.Jarti);

        tvMerk.setText(Bindonesia);
        ivGambar.setImageResource(getResources().getIdentifier(sGambar, "drawable", getPackageName()));
        tvIndonesia.setText(sIndonesia);

        setupToolbar();

    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.tbDetailMbl);
        toolbar.setTitle("Detail Indonesia");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
