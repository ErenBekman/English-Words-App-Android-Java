package com.example.erenbekman;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class VTContact2 extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String VT2 = "lvlTwo";
    private static final String CREATE_WORDS2_TABLE =
            "CREATE TABLE " + TableWords2.Words2.TABLE_NAME + " (" +
                    TableWords2.Words2._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TableWords2.Words2.COLUMN_ING_WORD + " TEXT, " +
                    TableWords2.Words2.COLUMN_TR_WORD + " TEXT " + ")";


    public VTContact2(@Nullable Context context) {
        super(context, VT2, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_WORDS2_TABLE);
        db.execSQL(TableWords2.Words2.N1);
        db.execSQL(TableWords2.Words2.N2);
        db.execSQL(TableWords2.Words2.N3);
        db.execSQL(TableWords2.Words2.N4);
        db.execSQL(TableWords2.Words2.N5);
        db.execSQL(TableWords2.Words2.N6);
        db.execSQL(TableWords2.Words2.N7);
        db.execSQL(TableWords2.Words2.N8);
        db.execSQL(TableWords2.Words2.N9);
        db.execSQL(TableWords2.Words2.N10);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldValue, int newValue) {
        db.execSQL("DROP TABLE IF EXISTS " + TableWords2.Words2.TABLE_NAME);
    }
}
