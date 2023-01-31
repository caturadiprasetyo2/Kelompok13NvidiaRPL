package com.example.aplikasikamusserui.helper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "kamuskis1.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("PRAGMA foreign_keys=ON");
        db.execSQL("create table indonesia(" +
                "merk text," +
                "arti text," +
                "primary key(merk)" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Ada Apa'," +
                "'Tofino'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Anak'," +
                "'Arikan'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Anjing'," +
                "'Fiawera'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Apa'," +
                "'Boyo'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Berdiri'," +
                "'Boa'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Duduk'," +
                "'Munohi'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Ikan'," +
                "'Dian'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Kapur'," +
                "'Roa'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Kelapa'," +
                "'Anggadi'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Kemari'," +
                "'Roma'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Kosong'," +
                "'Bereri'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Kucing'," +
                "'Nehi'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Orang tua laki-laki'," +
                "'Dai'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Orang tua perempuan'," +
                "'Ai'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Pinang'," +
                "'Aunai'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Pintu'," +
                "'Rahutu'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Sirih'," +
                "'Rema'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Sudah'," +
                "'Kauruampa'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Tidak apa apa'," +
                "'Bento'" +
                ");" +
                "");

        db.execSQL("insert into indonesia values (" +
                "'Ucapan Selamat (malam hari)'," +
                "'Diru'" +
                ");" +
                "");
        db.execSQL("insert into indonesia values (" +
                "'Ular'," +
                "'Tawai'" +
                ");" +
                "");
    }

    public List<String> getAllCategories() {
        List<String> categories = new ArrayList<String>();
        String selectQuery = "select * from indonesia";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                categories.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return categories;
    }



    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }

}