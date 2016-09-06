package dbmodel;

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
    private Date check_time;

    @DatabaseField(columnName = "total_hours")
    private Long total_hours;

    public CheckInOutTimes(){

    }

    public CheckInOutTimes(String in_out, Date check_time, Long total_hours) {

        this.in_out = in_out;
        this.check_time = check_time;
        this.total_hours = total_hours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIn_out() {
        return in_out;
    }

    public void setIn_out(String in_out) {
        this.in_out = in_out;
    }

    public Date getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }

    public Long getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(Long total_hours) {
        this.total_hours = total_hours;
    }
}
