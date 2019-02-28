package org.jsmart.zerocode.core.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Author: Yinle Li
 * @Date: 1/31/19 4:34 PM
 */
public class DateUtils {
    public static String getAreaDate(String area, String toFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(toFormat);
        Calendar calendar = Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone(area));
        return sdf.format(calendar.getTime());
    }

    /**
     * get area date By area
     *
     * @param area
     * @param toFormat
     * @param increaseOrDecrease
     * @return
     */
    public static String getAreaDateForIncreaseOrDecrease(String area, String toFormat, int increaseOrDecrease) {
        SimpleDateFormat sdf = new SimpleDateFormat(toFormat);
        Calendar calendar = Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone(area));
        calendar.add(Calendar.DATE, increaseOrDecrease);
        return sdf.format(calendar.getTime());
    }

    /**
     * @param area
     * @param toFormat
     * @param
     * @return
     */
    public static String getAreaLastDateByMonth(String area, String toFormat, int increaseOrDecrease) {
        SimpleDateFormat sdf = new SimpleDateFormat(toFormat);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(area));
        calendar.add(Calendar.MONTH, increaseOrDecrease);
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        return sdf.format(calendar.getTime());
    }

}
