package com.cgo.common.utlis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtli {


    public static String convertDate(Date date, SimpleDateFormat sdf){
        return sdf.format(date);
    }
}
