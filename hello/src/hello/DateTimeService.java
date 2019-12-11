package hello;

import java.util.Calendar;
import java.util.Date;
import java.io.*;

public class DateTimeService
{
   private Calendar calendar;

   //constructor creates the Calendar object, could use the constructor:
   //   Calendar(TimeZone zone, Locale aLocale) to explicitly specify 
   //	  the time zone and locale
   public DateTimeService()
   {
	 this.calendar = Calendar.getInstance();
   }

   //method returns date/time as a formatted String object
   public String getDateAndTime()
   {
	 Date d = this.calendar.getTime();
     return d.toString();	
   }
   
   public String getTemp()
   {
       FileReader filereader = null;
       BufferedReader bufferedreader = null;
       try {
           filereader = new FileReader("/sys/class/thermal/thermal_zone0/temp");
           bufferedreader = new BufferedReader(filereader);
           String strCurrentLine;
           while ((strCurrentLine = bufferedreader.readLine()) != null) {
             return (strCurrentLine.toString());
           }
         } 
       catch (IOException e) 
       {
           e.printStackTrace();
       } 
       finally {
           try {
             if (bufferedreader != null)
               bufferedreader.close();
             if (filereader != null)
               filereader.close();
           } 
           catch (IOException e) 
           {
             e.printStackTrace();
           }
         }
       return "0";
   }
   
}