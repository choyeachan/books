package studentinfo;

import java.util.*;

class DateUtil{
	Date createDate(int year, int month, int date){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR,year);
		calendar.set(Calendar.MONTH,month-1);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
	}
}

