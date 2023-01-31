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
import com.example.aplikasikamusserui.helper.DataHelperr;

public class DetailSerui extends AppCompatActivity {

    protected Cursor cursor;
    String Bserui, sserui, sGambarr;
    DataHelperr dbHelper;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_serui);

        Bundle terima = getIntent().getExtras();

        dbHelper = new DataHelperr(this);
        Intent intent = getIntent();

        String merk = terima.getString("merkkk");

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("select * from serui where merkkk = '" + merk + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            Bserui = cursor.getString(0);
            sserui = cursor.getString(1);
        }

        if (Bserui.equals("Ai")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Anggadi")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Arikan")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Aunai")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Bento")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Bereri")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Boa")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Boyo")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Dai")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Dian")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Diru")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Fiawera")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Kauruampa")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Munohi")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Nehi")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Rahutu")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Roa")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Rema")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Roma")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Tawai")) {
            sGambarr = "papua";
        } else if (Bserui.equals("Tofino")) {
            sGambarr = "papua";
        }


        ImageView ivGambar = findViewById(R.id.ivpapuaa);
        TextView tvMerk = findViewById(R.id.Jserui);
        TextView tvSerui = findViewById(R.id.Jartiserui);

        tvMerk.setText(Bserui);
        ivGambar.setImageResource(getResources().getIdentifier(sGambarr, "drawable", getPackageName()));
        tvSerui.setText(sserui);

        setupToolbar();

    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.tbDetailsri);
        toolbar.setTitle("Detail Serui");
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
