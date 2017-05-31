package edu.osu.cs362;


import org.junit.Test;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */


public class CalDayRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	 public void randomtest()  throws Throwable {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");


		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 CalDay calday = new CalDay(new GregorianCalendar());
			 for (int i = 0; i < NUM_TESTS; i++) {

				 int startHour = ValuesGenerator.getRandomIntBetween(random, -1, 30);
				 int startMinute = ValuesGenerator.getRandomIntBetween(random, -1, 60);
				 int startDay = ValuesGenerator.getRandomIntBetween(random, -1, 32);
				 int startMonth = ValuesGenerator.getRandomIntBetween(random, -1, 15);
				 int startYear = 2017;
				 String title = "Birthday Party";
				 String description = "This is my birthday party.";

				 //Construct a new Appointment object with the initial data
				 Appt appt = new Appt(startHour,
						 startMinute,
						 startDay,
						 startMonth,
						 startYear,
						 title,
						 description);

			 	calday.addAppt(appt);

			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

		 }


		 System.out.println("Done testing...");

	 }
	
}
