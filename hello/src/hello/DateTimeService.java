///Source for the fille reading
///https://www.developpez.net/forums/d1214517/java/general-java/apis/io/lire-fichier-texte-java/
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
   public String[] getDateAndTime()
   {
	 Date d = this.calendar.getTime();
	 String[] tab=new String[2];
	 FileReader filereader = null;
     BufferedReader bufferedreader = null;
     try {
         filereader = new FileReader("/sys/class/thermal/thermal_zone0/temp");
         bufferedreader = new BufferedReader(filereader);
         String strCurrentLine;
         while ((strCurrentLine = bufferedreader.readLine()) != null) {
           tab[0]=strCurrentLine;
        		   System.out.println(strCurrentLine);
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

     tab[1]=d.toString();
     return tab ;	
   }		
}