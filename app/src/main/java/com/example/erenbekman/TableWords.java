package com.example.erenbekman;

import android.provider.BaseColumns;

public class TableWords {

    public static final class Words implements BaseColumns {
        public static final String TABLE_NAME = "lvlOne";
        public static final String _ID = "id";
        public static final String COLUMN_ING_WORD = "ingWord";
        public static final String COLUMN_TR_WORD = "trWord";
        public static final String I1 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (1,'Engineer','Mühendis')";
        public static final String I2 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (2,'Alone','Yalnız')";
        public static final String I3 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (3,'Cheap','Ucuz')";
        public static final String I4 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (4,'Garden','Bahçe')";
        public static final String I5 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (5,'News','Haber')";
        public static final String I6 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (6,'Towel','Havlu')";
        public static final String I7 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (7,'Week','Hafta')";
        public static final String I8 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (8,'Wear','Giymek')";
        public static final String I9 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (9,'Meal','Yemek')";
        public static final String I10 = "INSERT INTO lvlOne('id','ingWord','trWord') VALUES (10,'Finger','Parmak')";
    }
}
