package com.example.lenovo.jiomeals;

import android.app.ActionBar;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static final String TAG = "DatabaseHelper";

    private static final String TABLE_NAME = "Dishes";
    private static final String COL0 = "Fid";
    private static final String COL1 = "Title";
    private static final String COL2 = "Restaurant";
    private static final String COL3 = "Type";
    private static final String COL4 = "Price";
    private static final String COL5 = "Suppler";

    static final String DB_NAME = "sqlite.db";

    // database version
    static final int DB_VERSION = 1;


    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super( context, DB_NAME, null, DB_VERSION );
    }

    public Cursor getData(){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT DISTINCT * FROM "+ TABLE_NAME +" WHERE Type='Burger'";  //Change burger later
        Cursor data = db.rawQuery(query, null);
        Log.d(TAG, data.toString());
        return data;
    }

    public Cursor getTitles(){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT DISTINCT * FROM "+ TABLE_NAME +" WHERE Type='Burger' AND Restaurant='McDonalds'";  //Change burger later
        Cursor data = db.rawQuery(query, null);
        Log.d(TAG, data.toString());
        return data;
    }

}
