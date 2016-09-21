package com.abc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProvider {
    private static DateProvider instance = null;
    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    private static final SimpleDateFormat defaultDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
    private DateProvider() {
    }

    public static DateProvider getInstance() {
        if (instance == null)
            instance = new DateProvider();
        return instance;
    }

    public Date now() {
        return new Date();
    }

    public static SimpleDateFormat getDefaultDateFormat() {
        return defaultDateFormat;
    }
}
