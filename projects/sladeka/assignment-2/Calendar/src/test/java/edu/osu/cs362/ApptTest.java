package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
	 /** Test that the set methods work as expected **/
	 @Test
	 public void test02() throws Throwable{
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(0,
				 0 ,
				 1 ,
				 1 ,
				 1 ,
				 "NOT INITIALIZED",
				 "NO EVENT");

		 appt.setStartHour(startHour);
		 appt.setStartMinute(startMinute);
		 appt.setStartDay(startDay);
		 appt.setStartMonth(startMonth);
		 appt.setStartYear(startYear);
		 appt.setTitle(title);
		 appt.setDescription(description);

		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 /** Test toString **/
	@Test
	public void test03()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals("\t"+"4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party."+"\n", appt.toString());

		appt.setStartHour(-30);
		assertNull(appt.toString());
	}

	/** Test isValid **/
	@Test public void test04() throws Throwable {
		Appt appt = new Appt(0,
				0 ,
				1 ,
				1 ,
				1 ,
				"NOT INITIALIZED",
				"NO EVENT");

		assertTrue(appt.getValid());

		appt.setStartHour(25);
		assertFalse(appt.getValid());
		appt.setStartHour(-2);
		assertFalse(appt.getValid());
		appt.setStartHour(12);
		assertTrue(appt.getValid());

		appt.setStartMinute(-25);
		assertFalse(appt.getValid());
		appt.setStartMinute(400);
		assertFalse(appt.getValid());
		appt.setStartMinute(30);
		assertTrue(appt.getValid());

		appt.setStartDay(35);
		assertFalse(appt.getValid());
		appt.setStartDay(-3);
		assertFalse(appt.getValid());
		appt.setStartDay(12);
		assertTrue(appt.getValid());

		appt.setStartMonth(25);
		assertFalse(appt.getValid());
		appt.setStartMonth(0);
		assertFalse(appt.getValid());
		appt.setStartMonth(3);
		assertTrue(appt.getValid());

	}
}
