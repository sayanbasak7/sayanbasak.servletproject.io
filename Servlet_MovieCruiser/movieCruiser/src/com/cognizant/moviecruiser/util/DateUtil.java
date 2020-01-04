package com.cognizant.moviecruiser.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public Date convertToDate(String input) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dateOfLaunch = format.parse(input);
			return dateOfLaunch;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String convertToString(Date input) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String date = format.format(input);
		return date;
	}

}