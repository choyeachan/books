package studentinfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class CourseSession{
	private String department;
	private String number;
	private Date startDate;
	private Date endDate;
  	private ArrayList<Student> students = new ArrayList<Student>();

	CourseSession(String department, String number){
		this.department = department;
		this.number = number;
	}

	CourseSession(String department, String number,Date startDate){
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}

	String getDepartment(){
		return department;
	}
	
	String getNumber(){
		return number;
	}

	int getNumberOfStudents(){
		return students.size();
	}

	void enroll(Student student){
	    students.add(student);
	}

	Student get(int index){
		return students.get(index);
	}

	Date getStartDate(){
		return startDate;
	}

	Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int numberOfDays = 16 * 7 -3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

}
