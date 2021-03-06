/*
 * This file was automatically generated by EvoSuite
 * Fri May 12 20:11:41 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;


public class Appt_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt((-7), 7, 7, 7, 7, "pN'euCnY", "pN'euCnY");
      assertEquals(-7, appt0.getStartHour());
      
      appt0.setStartHour(7);
      appt0.toString();
      assertEquals(7, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(23, (-2507), 0, 0, 732, "", ">PkRzW");
      appt0.setStartMinute(59);
      assertEquals(59, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(1, 23, 1, 11, 59, "", "}_x)fR");
      boolean boolean0 = appt0.getValid();
      assertTrue(boolean0);
      assertEquals(1, appt0.getStartHour());
      assertEquals("}_x)fR", appt0.getDescription());
      assertEquals(23, appt0.getStartMinute());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(1, appt0.getStartDay());
      assertEquals("", appt0.getTitle());
      assertEquals(59, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(1063, 1063, 1063, 1063, 1063, " 3T`)d$)4kE6", " 3T`)d$)4kE6");
      String string0 = appt0.getTitle();
      assertEquals(1063, appt0.getStartHour());
      assertEquals(1063, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(1063, appt0.getStartMonth());
      assertEquals(" 3T`)d$)4kE6", string0);
      assertEquals(" 3T`)d$)4kE6", appt0.getDescription());
      assertEquals(1063, appt0.getStartDay());
      assertEquals(1063, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt((-950), 0, 100, (-1095), 0, "%Y-%M-%D%z", "%Y-%M-%D%z");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals("%Y-%M-%D%z", appt0.getTitle());
      assertEquals(0, int0);
      assertEquals(-1095, appt0.getStartMonth());
      assertEquals("%Y-%M-%D%z", appt0.getDescription());
      assertEquals(100, appt0.getStartDay());
      assertEquals(-950, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(1448, 0, 1448, 1448, 0, "#<nM", "OrX}");
      int int0 = appt0.getStartMonth();
      assertEquals(1448, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals("#<nM", appt0.getTitle());
      assertEquals(1448, int0);
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(1448, appt0.getStartDay());
      assertEquals("OrX}", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-4091), (-4091), 509, "/", "/");
      int int0 = appt0.getStartMonth();
      assertEquals(0, appt0.getStartMinute());
      assertEquals("/", appt0.getDescription());
      assertEquals(509, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals("/", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertEquals((-4091), int0);
      assertEquals(-4091, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt((-1407), 0, 0, 0, 0, "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-1407, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(1063, 1063, 1063, 1063, 1063, " 3T`)d$)4kE6", " 3T`)d$)4kE6");
      int int0 = appt0.getStartMinute();
      assertEquals(" 3T`)d$)4kE6", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(" 3T`)d$)4kE6", appt0.getDescription());
      assertEquals(1063, appt0.getStartYear());
      assertEquals(1063, appt0.getStartHour());
      assertEquals(1063, appt0.getStartDay());
      assertEquals(1063, int0);
      assertEquals(1063, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-707), (-1028), 0, (String) null, (String) null);
      int int0 = appt0.getStartHour();
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals(-1028, appt0.getStartMonth());
      assertEquals(-707, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(659, 659, 2673, 659, 659, "iyQv%P#fX&KD{'", "iyQv%P#fX&KD{'");
      int int0 = appt0.getStartHour();
      assertEquals(659, int0);
      assertEquals("iyQv%P#fX&KD{'", appt0.getDescription());
      assertEquals(659, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(659, appt0.getStartMonth());
      assertEquals(659, appt0.getStartMinute());
      assertEquals("iyQv%P#fX&KD{'", appt0.getTitle());
      assertEquals(2673, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt((-1407), 0, 0, 0, 0, "", "");
      int int0 = appt0.getStartDay();
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-1407, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(3408, 643, 643, 3408, 819, " A:lFR[1+Ekv9I)-W|~", "8");
      int int0 = appt0.getStartDay();
      assertEquals(819, appt0.getStartYear());
      assertEquals(3408, appt0.getStartHour());
      assertEquals(643, appt0.getStartMinute());
      assertEquals(" A:lFR[1+Ekv9I)-W|~", appt0.getTitle());
      assertEquals("8", appt0.getDescription());
      assertEquals(3408, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(643, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt((-1), (-1), (-1), (-1), (-1), "", "");
      appt0.getDescription();
      assertEquals(-1, appt0.getStartMonth());
      assertEquals(-1, appt0.getStartMinute());
      assertEquals(-1, appt0.getStartYear());
      assertEquals(-1, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(-1, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt((-1), (-1), (-1), (-1), (-1), "", "");
      appt0.setDescription("NpT/faIRWcG5N OA4\"");
      assertEquals("NpT/faIRWcG5N OA4\"", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(0, (-1180), 0, (-1180), (-1180), "", "");
      appt0.setDescription((String) null);
      assertEquals(-1180, appt0.getStartYear());
      assertEquals(-1180, appt0.getStartMonth());
      assertEquals(-1180, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, (-720), 0, "", "");
      appt0.setTitle("X+njTi6k");
      assertEquals("X+njTi6k", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 1699, 12, "1", "1");
      assertEquals("1", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(12, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt((-1), (-1), (-1), (-1), (-1), "", "");
      int int0 = appt0.getStartDay();
      assertEquals(-1, appt0.getStartYear());
      assertEquals(-1, appt0.getStartHour());
      assertEquals(-1, appt0.getStartMinute());
      assertEquals(-1, appt0.getStartMonth());
      assertEquals((-1), int0);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-2164), (-2164), (-2164), 0, (-2164), "/+6]RDUP", ", ");
      int int0 = appt0.getStartHour();
      assertEquals("/+6]RDUP", appt0.getTitle());
      assertEquals(-2164, appt0.getStartDay());
      assertEquals(-2164, appt0.getStartMinute());
      assertEquals((-2164), int0);
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(", ", appt0.getDescription());
      assertEquals(-2164, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(23, (-2507), 0, 0, 732, "", ">PkRzW");
      int int0 = appt0.getStartYear();
      assertEquals(23, appt0.getStartHour());
      assertEquals(732, int0);
      assertEquals(">PkRzW", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(-2507, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals("", appt0.getTitle());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(23, (-2507), 0, 0, 732, "", ">PkRzW");
      int int0 = appt0.getStartMinute();
      assertEquals("", appt0.getTitle());
      assertEquals(732, appt0.getStartYear());
      assertEquals(">PkRzW", appt0.getDescription());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals((-2507), int0);
      assertEquals(23, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(23, (-2507), 0, 0, 732, "", ">PkRzW");
      String string0 = appt0.getDescription();
      assertEquals(">PkRzW", string0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(732, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(23, appt0.getStartHour());
      assertEquals("", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-2507, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(23, (-2507), 0, 0, 732, "", ">PkRzW");
      int int0 = appt0.getStartMonth();
      assertEquals(732, appt0.getStartYear());
      assertEquals(-2507, appt0.getStartMinute());
      assertEquals(">PkRzW", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals("", appt0.getTitle());
      assertEquals(23, appt0.getStartHour());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 1699, 12, "1", "1");
      assertEquals(1699, appt0.getStartMonth());
      
      appt0.setStartMonth(12);
      String string0 = appt0.toString();
      assertEquals("\t12/12/12 at 12:12pm ,1, 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-707), (-1028), 0, (String) null, (String) null);
      String string0 = appt0.getTitle();
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(-1028, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(-707, appt0.getStartDay());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(3408, 643, 643, 3408, 819, " A:lFR[1+Ekv9I)-W|~", "8");
      appt0.setStartHour(0);
      appt0.setStartMonth(0);
      appt0.setStartMinute(0);
      appt0.setStartDay(31);
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt((-1407), 0, 0, 0, 0, "", "");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-1407, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertFalse(boolean0);
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(23, (-2507), 0, 0, 732, "", ">PkRzW");
      appt0.setStartYear((-472));
      int int0 = appt0.getStartYear();
      assertEquals((-472), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", "");
      appt0.setStartDay(69);
      appt0.toString();
      assertEquals(69, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", "");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t11/11/11 at 11:11am ,, \n", string0);
  }
}
