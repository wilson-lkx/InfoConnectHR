package my.com.infoconnect.hr.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    private static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");

    public static String convertDateToYMD(Date date) {
        return YYYYMMDD.format(date);
    }
}
