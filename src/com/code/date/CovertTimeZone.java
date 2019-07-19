package com.code.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*Java program to convert UTC to GMT*/

import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author rahul.soni
 * 
 *         http://www.itsprings.co.in/java/How-to-convert-UTC-time-zone-into-GMTIST-and-EST
 *
 * 
 */

public class CovertTimeZone {

    public static String dateToString(Date date, String format, String timeZone) {

	// create SimpleDateFormat object
	SimpleDateFormat sdf = new SimpleDateFormat(format);
	// default system timezone if passed null or empty
	if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
	    timeZone = Calendar.getInstance().getTimeZone().getID();
	}
	// set timezone to SimpleDateFormat
	sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
	// return Date in required format with timezone as String
	return sdf.format(date);

    }

    public static void main(String[] args) throws ParseException {

	// create Date object
	Date date = new Date();

	String pattern = "dd MMM yyyy hh:mm:ss a";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	date = simpleDateFormat.parse("24 Dec 2018 06:55:03 AM");

	// print default date
	System.out.println("Default Date :" + date.toString());

	// print System Date in specific format
	System.out.println("System Date : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", null));

	// print System Date in IST
	System.out.println("System Date in IST : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", "IST"));

	// print System Date in PST
	System.out.println("System Date in PST : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", "PST"));
	// print System Date in PST
	System.out.println("System Date in EST : " + dateToString(date, "yyyy-MM-dd hh:mm:ss a", "EST"));

	// print System Date in GMT
	System.out.println("System Date in GMT : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", "GMT"));
    }

}