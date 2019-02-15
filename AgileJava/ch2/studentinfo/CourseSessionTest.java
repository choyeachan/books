package studentinfo;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Date;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	private Date startDate; 

	public void setUp(){
		startDate = createDate(2013, 1, 6);
		session = new CourseSession("ENGL", "101",startDate);
	}

	public void testCreate(){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
	}

	public void testEnrollStudents(){
		Student student1 = new Student("Cain DiVoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));

		Student student2 = new Student("Coralee DeVaughn");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(student2, session.get(1));
	}

	public void testCourseDates(){
		Date sixteenWeeksOut = createDate(2013, 4, 25);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}

	Date createDate(int year, int month, int date){
		return new Date(year - 1900, month - 1, date);	
	}
}
