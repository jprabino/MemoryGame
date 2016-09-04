package com.example.juan.spendingmytime;

import android.database.sqlite.SQLiteOpenHelper;
import android.hardware.camera2.params.StreamConfigurationMap;

/**
 * Created by juan on 9/3/16.
 */
public class SMTDataBase extends SQLiteOpenHelper {

    public static final String TABLE_CHECKINOUT= "checkinout";
    public static final String COLUMN_ID = "_id";
    public static final String IN_OUT = "in_out";
    public static final String CHECK_DT = "datetime";
    public static final String TOTAL_HOURS = "total_hours";

    private static final String DB_NAME="checkinout.db";
    private static final int DB_VERSION = 1;

    private static final String DATABASE_CREATE = "create table "+
            TABLE_CHECKINOUT + "(" + COLUMN_ID
}
