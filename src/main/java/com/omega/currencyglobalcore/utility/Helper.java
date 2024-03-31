package com.omega.currencyglobalcore.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    private static DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static Date getTodayDate() {
        try {
            return formatter.parse(formatter.format(new Date()));
        } catch (ParseException e) {
            System.out.println("date not parsed");
        }
        return new Date();
    }

}
