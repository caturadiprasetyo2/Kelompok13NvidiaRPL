package com.example.aplikasikamusserui.activity;

import android.R.layout;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.aplikasikamusserui.R;
import com.example.aplikasikamusserui.helper.DataHelperr;

public class DaftarSerui extends AppCompatActivity {

    String[] daftarr;
    ListView ListView2;
    Menu menu;
    protected Cursor cursor;
    DataHelperr dbcenter;
    public static DaftarSerui m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serui);

        m = this;
        dbcenter = new DataHelperr(this);

        RefreshList();
        setupToolbar();

    }

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tbInfosri);
        toolbar.setTitle("Bahasa Serui");
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

    public void RefreshList() {
        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM serui", null);
        daftarr = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            daftarr[i] = cursor.getString(0);
        }
        ListView2 = findViewById(R.id.listView2);
        ListView2.setAdapter(new ArrayAdapter(this, layout.simple_list_item_1, daftarr));
        ListView2.setSelected(true);
        ListView2.setOnItemClickListener(new OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                final String selection = daftarr[arg2];
                Intent i = new Intent(DaftarSerui.this, DetailSerui.class);
                i.putExtra("merkkk", selection);
                startActivity(i);
            }
        });

        ((ArrayAdapter) ListView2.getAdapter()).notifyDataSetInvalidated();

    }
}