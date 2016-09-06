package dbhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import dbmodel.CheckInOutTimes;
import com.example.juan.spendingmytime.R;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by juan on 9/4/16.
 */
public class CheckinDatabaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "smt.db";
    private static final int DATABASE_VERSION = 1;

    private Dao<CheckInOutTimes, Long> checkInOutDao=null;

    public CheckinDatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
    }
    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource){
        try{
            TableUtils.createTable(connectionSource, CheckInOutTimes.class);

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource,
                          int oldVersion, int newVersion){
        try{
            TableUtils.dropTable(connectionSource, CheckInOutTimes.class,false);
            onCreate(database, connectionSource);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Dao<CheckInOutTimes, Long> getCheckInOutDao() throws SQLException {
        if(checkInOutDao == null) {
            checkInOutDao = getDao(CheckInOutTimes.class);
        }
        return checkInOutDao;
    }
    @Override
    public void close() {
        checkInOutDao = null;

        super.close();
    }
}
