package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	public static Appt RandomSelectAppt(Random random, Appt [] Appts ){
		int n = random.nextInt(Appts.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
		return Appts[n]; // return the appointment
	}

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

			TimeTable timeTable = new TimeTable();

			//Construct a new Appointment object with the initial data

			Appt appt1 = new Appt(ValuesGenerator.getRandomIntBetween(random, -1, 25),
					ValuesGenerator.getRandomIntBetween(random, -1, 60) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 32) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 13) ,
					2017 ,
					ValuesGenerator.getString(random),
					ValuesGenerator.getString(random));

			Appt appt2 = new Appt(ValuesGenerator.getRandomIntBetween(random, -1, 25),
					ValuesGenerator.getRandomIntBetween(random, -1, 60) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 32) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 13) ,
					2017 ,
					ValuesGenerator.getString(random),
					ValuesGenerator.getString(random));

			Appt appt3 = new Appt(ValuesGenerator.getRandomIntBetween(random, -1, 25),
					ValuesGenerator.getRandomIntBetween(random, -1, 60) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 32) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 13) ,
					2017 ,
					ValuesGenerator.getString(random),
					ValuesGenerator.getString(random));

			Appt appt4 = new Appt(ValuesGenerator.getRandomIntBetween(random, -1, 25),
					ValuesGenerator.getRandomIntBetween(random, -1, 60) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 32) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 13) ,
					2017 ,
					ValuesGenerator.getString(random),
					ValuesGenerator.getString(random));

			Appt appt5 = new Appt(ValuesGenerator.getRandomIntBetween(random, -1, 25),
					ValuesGenerator.getRandomIntBetween(random, -1, 60) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 32) ,
					ValuesGenerator.getRandomIntBetween(random, -1, 13) ,
					2017 ,
					ValuesGenerator.getString(random),
					ValuesGenerator.getString(random));

			Appt[] appts = {appt1, appt2, appt3, appt4, appt5};
			Appt[] delAppts = {null, appt1, appt2, appt3, appt4, appt5};


			for (int i = 0; i < NUM_TESTS; i++) {

				LinkedList<Appt> list = new LinkedList<Appt>();

				timeTable.deleteAppt(null, RandomSelectAppt(random, delAppts));

				for (int j = 0; j < ValuesGenerator.getRandomIntBetween(random, 0, 5); j++) {
					list.add(RandomSelectAppt(random, appts));
				}

				timeTable.deleteAppt(list, RandomSelectAppt(random, delAppts));

			}

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration % 10000) == 0 && iteration != 0)
				System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

		}


		System.out.println("Done testing...");

	}


	
}
