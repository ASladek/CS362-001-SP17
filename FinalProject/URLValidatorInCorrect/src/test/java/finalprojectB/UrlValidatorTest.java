/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println("testManualTest: True");
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
       System.out.println(urlVal.isValid("http://www.google.com/awesome"));
       System.out.println(urlVal.isValid("http://somewhere.com/pathxyz/file(1).html"));

       System.out.println("testManualTest: False");
       System.out.println(urlVal.isValid("qoewjfpdsc"));
	   System.out.println(urlVal.isValid("notvalid//com"));
       System.out.println(urlVal.isValid("file:///C:\\some.file"));
       System.out.println(urlVal.isValid("asdf"));
   }
   
   //Tests valid urls and expects them to be found valid
   public void testYourFirstPartition()
       {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("testTruePartition: True");
       System.out.println(urlVal.isValid("http://www.amazon.com"));
       System.out.println(urlVal.isValid("http://www.google.com/awesome"));
       System.out.println(urlVal.isValid("http://somewhere.com/pathxyz/file(1).html"));
       System.out.println(urlVal.isValid("http://www.seoul.co.kr/"));



       }

   //Test invalid urls and expect them to be found invalid
   public void testYourSecondPartition(){
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

       System.out.println("testFalsePartition: False");
       System.out.println(urlVal.isValid("qoewjfpdsc"));
       System.out.println(urlVal.isValid("notvalid//com"));
       System.out.println(urlVal.isValid("file:///C:\\some.file"));
       System.out.println(urlVal.isValid("oie ejropgl aerpog"));
       System.out.println(urlVal.isValid("http://300.40.5.0"));


   }


   //Call generated urls, expect them to be valid if all parts are valid
    /*
   public void testIsValid()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       String testURL;
       boolean testValid = true;
       int ischeme;
       int iauth;
       int ipath;
       int iq;

       for(int i = 0;i<10000;i++)
       {
           ischeme = (int)(Math.random()*4);
           iauth = (int)(Math.random()*5);
           ipath = (int)(Math.random()*2);
           iq = (int)(Math.random()*2);
           System.out.println( String(Uscheme[ischeme][0]) + String(Uauthority[iauth][0]) + String(Upath[ipath][0]) + String(Uquery[iq][0]));



       }
   }
*/
   //
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   private Object[][] Uscheme = new Object[][]{
           {"http://", true},
           {"http:", false},
           {"ftp://", true},
           {"", true}
   };

   private Object[][] Uauthority = new Object[][]{
           {"www.google.com", true},
           {"oregonstate.edu", true},
           {"0.0.0.0", true},
           {"www.google.com:80", true},
           {"aaa.", false}
   };

    private Object[][] Upath = new Object[][]{
            {"/test",true},
            {"/..", false}
    };

    private Object[][] Uquery = new Object[][]{
            {"?action=view", true},
            {"", true}
    };

    private Object[] buildURL = {Uscheme, Uauthority, Upath, Uquery};


}
