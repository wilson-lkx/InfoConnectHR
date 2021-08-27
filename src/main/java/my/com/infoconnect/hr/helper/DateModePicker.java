package my.com.infoconnect.hr.helper;

import java.util.Calendar;

enum DateMode {
    NONE,
    DAILY,
    MONTHLY,
    YEARLY
}

public class DateModePicker {
    private String startDate;
    private String endDate;

    public DateModePicker(String mode, String date, String month, String year) {
        Calendar cal = Calendar.getInstance();

        if (mode.equalsIgnoreCase(String.valueOf(DateMode.DAILY.ordinal()))) {
            this.startDate = date;

        } else if (mode.equalsIgnoreCase(String.valueOf(DateMode.MONTHLY.ordinal()))) {
            cal.set(Calendar.MONTH, Integer.parseInt(month));
            cal.set(Calendar.YEAR, Integer.parseInt(year));
            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
            this.startDate = DateConverter.convertDateToYMD(cal.getTime());

            cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
            this.endDate = DateConverter.convertDateToYMD(cal.getTime());

        } else if (mode.equalsIgnoreCase(String.valueOf(DateMode.YEARLY.ordinal()))) {
            cal.set(Calendar.YEAR, Integer.parseInt(year));
            cal.set(Calendar.MONTH, Calendar.JANUARY);
            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
            this.startDate = DateConverter.convertDateToYMD(cal.getTime());

            cal.set(Calendar.MONTH, Calendar.DECEMBER);
            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
            this.endDate = DateConverter.convertDateToYMD(cal.getTime());
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
