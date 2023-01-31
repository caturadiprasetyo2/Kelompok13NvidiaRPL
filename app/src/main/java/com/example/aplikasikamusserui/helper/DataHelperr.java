package com.example.aplikasikamusserui.helper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataHelperr extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "kamuskis2.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelperr(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("PRAGMA foreign_keys=ON");
        db.execSQL("create table serui(" +
                "merkkk text," +
                "ok text," +
                "primary key(merkkk)" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Ai'," +
                "'Orang tua perempuan'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Anggadi'," +
                "'Kelapa'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Arikan'," +
                "'Anak'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Aunai'," +
                "'Pinang'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Bento'," +
                "'Tidak apa apa'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Bereri'," +
                "'Kosong'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Boa'," +
                "'kapur'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Boyo'," +
                "'Apa'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Dai'," +
                "'Orang tua laki-laki'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Dian'," +
                "'Ikan'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Diru'," +
                "'Ucapan selamat (malam hari)'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Fiawera'," +
                "'Anjing'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Kauruampa'," +
                "'Sudah'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Munohi'," +
                "'Duduk'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Nehi'," +
                "'Kucing'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Rahutu'," +
                "'Kucing'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Roa'," +
                "'Kapur'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Rema'," +
                "'Sirih'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Roma'," +
                "'Kemiri'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Tawai'," +
                "'Ular'" +
                ");" +
                "");

        db.execSQL("insert into serui values (" +
                "'Tofino'," +
                "'Ada apa'" +
                ");" +
                "");
    }

    public List<String> getAllCategories() {
        List<String> categories = new ArrayList<String>();
        String selectQuery = "select * from serui";
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