package com.example.erenbekman;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class VTContact3 extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String VT3 = "lvlThree";
    private static final String CREATE_WORDS3_TABLE =
            "CREATE TABLE " + TableWords3.Words3.TABLE_NAME + " (" +
                    TableWords3.Words3._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TableWords3.Words3.COLUMN_ING_WORD + " TEXT, " +
                    TableWords3.Words3.COLUMN_TR_WORD + " TEXT " + ")";


    public VTContact3(@Nullable Context context) {
        super(context, VT3, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_WORDS3_TABLE);
        db.execSQL(TableWords3.Words3.W1);
        db.execSQL(TableWords3.Words3.W2);
        db.execSQL(TableWords3.Words3.W3);
        db.execSQL(TableWords3.Words3.W4);
        db.execSQL(TableWords3.Words3.W5);
        db.execSQL(TableWords3.Words3.W6);
        db.execSQL(TableWords3.Words3.W7);
        db.execSQL(TableWords3.Words3.W8);
        db.execSQL(TableWords3.Words3.W9);
        db.execSQL(TableWords3.Words3.W10);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldValue, int newValue) {
        db.execSQL("DROP TABLE IF EXISTS " + TableWords3.Words3.TABLE_NAME);
    }
}
