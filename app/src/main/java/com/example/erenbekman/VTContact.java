package com.example.erenbekman;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class VTContact extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String VT = "lvlOne";
    private static final String CREATE_WORDS_TABLE =
                    "CREATE TABLE " + TableWords.Words.TABLE_NAME + " (" +
                    TableWords.Words._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TableWords.Words.COLUMN_ING_WORD + " TEXT, " +
                    TableWords.Words.COLUMN_TR_WORD + " TEXT " + ")";


    public VTContact(@Nullable Context context) {
        super(context, VT, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_WORDS_TABLE);
        db.execSQL(TableWords.Words.I1);
        db.execSQL(TableWords.Words.I2);
        db.execSQL(TableWords.Words.I3);
        db.execSQL(TableWords.Words.I4);
        db.execSQL(TableWords.Words.I5);
        db.execSQL(TableWords.Words.I6);
        db.execSQL(TableWords.Words.I7);
        db.execSQL(TableWords.Words.I8);
        db.execSQL(TableWords.Words.I9);
        db.execSQL(TableWords.Words.I10);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldValue, int newValue) {
        db.execSQL("DROP TABLE IF EXISTS " + TableWords.Words.TABLE_NAME);
    }
}
