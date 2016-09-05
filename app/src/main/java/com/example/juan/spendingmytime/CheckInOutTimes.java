package com.example.juan.spendingmytime;

import android.database.sqlite.SQLiteOpenHelper;
import android.hardware.camera2.params.StreamConfigurationMap;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.types.DateTimeType;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by juan on 9/3/16.
 */
@DatabaseTable(tableName = "checkinout")
public class CheckInOutTimes {

    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField(columnName = "in_out")
    private String in_out;

    @DatabaseField(columnName = "check_time")
    private DateTimeType check_time;

    @DatabaseField(columnName = "total_hours")
    private Long total_hours;

    public CheckInOutTimes(){

    }

}
