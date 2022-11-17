package com.example.databaseapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {
    public DBHelper( Context context) {
        super(context, "Userdata.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL(" CREATE TABLE userdetails (name TEXT PRIMARY KEY, contact TEXT, dob TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP TABLE IF EXISTS userdetails");
    }
    public Boolean insertData(String name,String contact, String dob )
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues cn = new ContentValues();
        cn.put("name",name);
        cn.put("contact",contact);
        cn.put("dob",dob);
        long result = DB.insert("userdetails",null,cn);
       if(result == -1)
       {
           return false;
       }
       else
       {
           return false;
       }
    }
}
