package com.example.juan.spendingmytime;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import dbhelper.CheckinDatabaseHelper;
import dbmodel.CheckInOutTimes;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            testOrmLiteDB();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void testOrmLiteDB() throws SQLException{
        CheckinDatabaseHelper checkinDatabaseHelper = OpenHelperManager.getHelper(this,
                CheckinDatabaseHelper.class);

        Dao<CheckInOutTimes, Long> checkInOutTimesLongDao = checkinDatabaseHelper.getCheckInOutDao();

        Date currDateTime = new Date(System.currentTimeMillis());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currDateTime);

        calendar.add(Calendar.HOUR, 8);

//        Date outtime = calendar.getTime();

        checkInOutTimesLongDao.create(new CheckInOutTimes("IN", currDateTime, (long) 14));

        checkInOutTimesLongDao.create(new CheckInOutTimes("OUT", currDateTime, (long) 15));
        checkInOutTimesLongDao.create(new CheckInOutTimes("IN", currDateTime, (long) 16));
        checkInOutTimesLongDao.create(new CheckInOutTimes("OUT", currDateTime, (long) 17));

        List<CheckInOutTimes> checkInOutTimes = checkInOutTimesLongDao.queryForAll();

    }

}
