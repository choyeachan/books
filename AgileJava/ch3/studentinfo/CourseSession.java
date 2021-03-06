package studentinfo;

import java.util.*;

/**
 * Provides a representation of a single-semester
 * session of a specific university course.
 * @author Administrator
 */
class CourseSession{
	static final String NEWLINE = System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "-" + NEWLINE;
	static final String ROSTER_REPORT_FOOTER = NEWLINE + "# studens = ";
	private String department;
	private String number;
	private Date startDate;
	private Date endDate;
  	private ArrayList<Student> students = new ArrayList<Student>();

	CourseSession(String department, String number){
		this.department = department;
		this.number = number;
	}

	/**
	 * Constructs a CourseSession starting on a specific date
	 *
	 * @param startDate the date on which the CourseSession begins
	 * @param department department
	 * @param number number
	 */
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

	ArrayList<Student> getAllStudents(){
		return students;
	}

	/**
	 * @return Date the last date of the course session
	 */
	Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	String getRosterReport(){
		StringBuilder buffer = new StringBuilder();

		buffer.append(ROSTER_REPORT_HEADER);

		for(Student student:students){
			buffer.append(student.getName());
			buffer.append(NEWLINE);
		}

		buffer.append(ROSTER_REPORT_FOOTER + students.size() + NEWLINE);

		return buffer.toString();
	}

}
