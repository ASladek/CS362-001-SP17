package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tested.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"isValid","setDescription"};// The list of the of methods to be tested in the Appt class
		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

        return methodArray[n] ; // return the method name
        }

	public static String RandomSelectProp(Random random){
		String[] propertyArray = new String [] {"hour", "minute", "day", "month"}; //list of properties for isValid

		int n = random.nextInt(propertyArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return propertyArray[n] ; // return the property name
	}

	String[] propertyArray = new String [] {"hour", "minute", "day", "month"}; //list of properties for isValid



	/**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void randomTest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomSeed = System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomSeed );
				Random random = new Random(randomSeed);
				
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
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setDescription")){
						   String newDescription=(String) ValuesGenerator.getString(random);
						   appt.setDescription(newDescription);
						   //assertEquals(newDescription, appt.getDescription());
						}
						else if (methodName.equals("isValid")){
					   		//appt.isValid();
						   String propName = ApptRandomTest.RandomSelectProp(random);
						   if (propName.equals( "hour")) {
						   	int hour = ValuesGenerator.getRandomIntBetween(random, -10, 30);
						   	appt.setStartHour(hour);
						   }
						   else if (propName.equals( "minute")) {
							   int minute = ValuesGenerator.getRandomIntBetween(random, -10, 70);
							   appt.setStartMinute(minute);
						   }
						   else if (propName.equals( "day")) {
							   int day = ValuesGenerator.getRandomIntBetween(random, -10, 40);
							   appt.setStartDay(day);
						   }
						   else if (propName.equals( "month")) {
							   int month = ValuesGenerator.getRandomIntBetween(random, -10, 20);
							   appt.setStartMonth(month);
						   }
					   }
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
	 
	 
		 System.out.println("Done testing...");
	 }


	
}
