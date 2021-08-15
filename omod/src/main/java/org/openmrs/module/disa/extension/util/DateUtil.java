package org.openmrs.module.disa.extension.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author machabane
 *
 */
public class DateUtil {

	private static Date parsedDate;

	public static Date deserialize(String date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		format.setTimeZone(TimeZone.getTimeZone("GMT"));

		try {
			parsedDate = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parsedDate;
	}
	
	public static Date stringToDate(String date) throws ParseException {
	    return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(date);  
	}
	
	public static Date dateWithLeadingZeros() {
		Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        
        return now.getTime();
	}
}
