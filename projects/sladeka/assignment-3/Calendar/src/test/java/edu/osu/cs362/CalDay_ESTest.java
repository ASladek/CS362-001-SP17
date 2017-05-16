/*
 * This file was automatically generated by EvoSuite
 * Fri May 12 20:14:06 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.TimeZone;
import sun.util.calendar.ZoneInfo;

public class CalDay_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(0, 5, 1, 5, 1, (String) null, (String) null);
      calDay0.addAppt(appt0);
      Appt appt1 = new Appt(1, 1, 1, 1, 1, "gregory", "gregory");
      calDay0.addAppt(appt1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(0, 0, (-1959), 0, 0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.US;
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(locale0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = new Locale("");
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(locale0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.year = (-1496);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar((TimeZone) zoneInfo0, locale0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(16, 16, 0, (-863), 0, "+XWNN(u0#t8Rg/gp7", "`LYc/Mo.mWe'G>z");
      linkedList0.addLast(appt0);
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = 594;
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-2471);
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(locale0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.day = (-936);
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(0, (-273), 3846);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(1, 1, 9, 1, 9, (String) null, "");
      calDay0.addAppt(appt0);
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.iterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(2, 2, 2, 2, 2, "`", "`");
      // Undeclared exception!
      try { 
        calDay0.addAppt(appt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      mockGregorianCalendar0.set(0, 770);
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         //assertThrownBy("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(2014, 1, 14);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(0, 5, 1, 5, 1, (String) null, (String) null);
      calDay0.addAppt(appt0);
      String string0 = calDay0.toString();
      assertEquals("\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \n\t5/1/1 at 12:5am ,, \n \n", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      String string0 = calDay0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(2014, 1, 14);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Iterator<?> iterator0 = calDay0.iterator();
      assertEquals(14, calDay0.getDay());
      assertEquals(1, calDay0.getMonth());
      assertNotNull(iterator0);
      assertEquals(2014, calDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Iterator<?> iterator0 = calDay0.iterator();
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(0, (-421), (-1165), (-1165), (-421), "Day", " --- -------- Appointments ------------ --- \n");
      calDay0.addAppt(appt0);
      assertFalse(calDay0.isValid());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(0, 5, 1, 5, 1, (String) null, (String) null);
      calDay0.addAppt(appt0);
      calDay0.addAppt(appt0);
      assertEquals(2, calDay0.getSizeAppts());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      // Undeclared exception!
      try { 
        calDay0.getSizeAppts();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }
}
