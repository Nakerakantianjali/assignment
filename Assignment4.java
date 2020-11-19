/*Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date. 

Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.

For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range. 

Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.

Given the signup date and the current date, provide the allowable date range for the form date. 

Input  -  First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy    Each line has two dates separated by space where the first date in signup date and the second date is the current date.  

Output  -  Range of dates for KYC form in format    dd-mm-yyyy dd-mm-yyyy

Test Input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

Test output:
16-06-2017 27-06-2017 
05-01-2017 06-03-2017 
No range 
05-03-2016 04-04-2016 
05-03-2016 15-03-2016

*/
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;
import java.util.Calendar;
Class Assignment4{
  String findRange(String input) {
        //splitting the given signup and current date 
        String []dates=input.split(" ");
	//initializing the calendar
        Calendar c=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        Calendar c3=Calendar.getInstance();
        Calendar c4=Calendar.getInstance();
	//to convert the date to given format 
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String [] time=dates[0].split("-");
	//splitting signup date
        int y=Integer.parseInt(time[2]);
        int m=Integer.parseInt(time[1])-1;
        int d=Integer.parseInt(time[0]);

        c.set(y,m,d);
	//splitting currrent date
        Date date=c.getTime();
        String [] time2=dates[1].split("-");
        int y2=Integer.parseInt(time2[2]);
        int m2=Integer.parseInt(time2[1])-1;
        int d2=Integer.parseInt(time2[0]);

        c2.set(y2,m2,d2);
        c3.set(y2,m,d);
        c4.set(y2,m,d);
	//adding 30days to current Year Anniversary
        c3.add(Calendar.DATE,30);
	//Subracting 30days from current Year Anniversary 
        c4.add(Calendar.DATE,-30);
	
        if(y==y2 && c2.compareTo(c4)>=0){
	    //if the given dates are not allowable range
            return "not in given range";
        }
        if(c2.compareTo(c3)>0){
	    //If you are past the +-30 day anniversary then it back-date  so that it falls in the +-30-day window 	
            return sdf.format(c4.getTime())+" "+sdf.format(c3.getTime());
        }
        else{
            return sdf.format(c4.getTime())+" "+sdf.format(c2.getTime());
        }
        
    }
    Public Static void main(String[] args)throws IOException{
	Assignment4 ass=new Assignment4();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println(ass.findRange(input));

  }
}