package com.example.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contactsManager";
    private static final String TABLE_NAME = "contacts";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME  = "name";
    private static final String KEY_PH_NO = "phone_number";

    public DataBaseHandler( Context context ) {
        super(context,DATABASE_NAME ,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = " CREATE TABLE "+TABLE_NAME+" ( "+
                KEY_ID + " INTEGER PRIMARY KEY AUTO INCREMENT,"+ KEY_NAME + " TEXT, "+
                KEY_PH_NO + " TEXT " +" )";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
}
