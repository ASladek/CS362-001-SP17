package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	/** Check that an empty CalDay is invalid **/
	@Test
	public void test01() throws Throwable{
		//Construct object
		CalDay calday = new CalDay();

		assertFalse(calday.isValid());
		assertNull(calday.iterator());

	}

	/** Test that get is valid **/
	 @Test
	  public void test02()  throws Throwable  {
		//Construct object
		GregorianCalendar gcal = new GregorianCalendar(2017,5,1);
		CalDay calday = new CalDay(gcal);

		assertTrue(calday.isValid());
		assertEquals(0, calday.getSizeAppts());
		assertEquals(1, calday.getDay());
		assertEquals(5,calday.getMonth());
		assertEquals(2017, calday.getYear());
		assertEquals(new LinkedList<Appt>(), calday.getAppts());
		assertNotNull(calday.iterator());


	 }

	/** Test that appts are added to calday **/
	@Test
	public void test03() throws Throwable{
	 	//Construct new calday
		GregorianCalendar gcal = new GregorianCalendar(2017,5,1);
		CalDay calday = new CalDay(gcal);

		//Construct new appt
		Appt appt = new Appt(12,
				59 ,
				1 ,
				5 ,
				2017 ,
				"Assignment Due",
				"Turn in assignment 2");

		//Add appt to calday
		calday.addAppt(appt);

		//Add it again
		appt.setStartHour(23);
		calday.addAppt(appt);

		//Add it again
		appt.setStartHour(4);
		calday.addAppt(appt);

		//don't add invalid appt
		appt.setStartHour(-23);
		calday.addAppt(appt);

		assertEquals(3, calday.getSizeAppts());





	}

	/** Test that tostring returns expected **/
	@Test
	public void test04() throws Throwable{
		//Construct new calday
		GregorianCalendar gcal = new GregorianCalendar(2017,5,1);
		CalDay calday = new CalDay(gcal);

		//Construct new appt
		Appt appt = new Appt(23,
				59 ,
				1 ,
				5 ,
				2017 ,
				"Assignment Due",
				"Turn in assignment 2");

		//Add appt to calday
		calday.addAppt(appt);

		//Add it again
		appt.setStartHour(23);
		calday.addAppt(appt);

		assertNotNull( calday.toString());

		CalDay calday2 = new CalDay();
		assertNotNull(calday2.toString());

	}


}
