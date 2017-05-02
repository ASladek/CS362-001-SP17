package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable timeTable=new TimeTable();

		 //Construct new appt
		 Appt appt = new Appt(23,
				 59 ,
				 1 ,
				 5 ,
				 2017 ,
				 "Assignment Due",
				 "Turn in assignment 2");

		 LinkedList<Appt> list = new LinkedList<Appt>();
		 list.add(appt);

		 appt.setStartDay(2);
		 list.add(appt);

		 LinkedList<CalDay> calday = timeTable.getApptRange(list, new GregorianCalendar(2017, 4, 1), new GregorianCalendar(2017, 6, 1));

		 assertNotEquals(null, calday);

		appt.setStartHour(-1);
		list.add(appt);

		assertNotNull(timeTable.getApptRange(list, new GregorianCalendar(2017, 4, 1), new GregorianCalendar(2017, 6, 1)));

		//Don't change invalid appt
		assertNull(timeTable.deleteAppt(list, appt));

		 appt.setStartHour(23);

		 //Don't change null appt
		 assertNull(timeTable.deleteAppt(list, null));

		 //remove appt
		 assertNotNull(timeTable.deleteAppt(list, appt));

		 //find no appt
		 appt.setTitle("Ice cream Party");
		 assertNull(timeTable.deleteAppt(null, appt));


	 }



}
