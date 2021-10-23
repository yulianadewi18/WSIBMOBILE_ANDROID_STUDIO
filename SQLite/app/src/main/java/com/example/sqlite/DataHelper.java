package com.example.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends  SQLiteOpenHelper {

    private static final String DATABASE_NAME = "biodata.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate (SQLiteDatabase Db){
        String sql = "create table biodata(no integer primary key, nama text null, tgl date, jk text null, alamat text null);";
        Log.d("Data", "onCreate: " + sql);
        Db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('21', 'Yuliana Dewi', '18-07-2002', 'Perempuan', 'Jakarta');";
        Db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
