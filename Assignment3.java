/*
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

Use the system ping utility, do not use any deprecated methods.

*/
import java.io.*;
public class Main {



    public static  void main(String[] args) throws Exception{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String  input=br.readLine();
        Date start=new Date(),stop;
        InetAddress inetAddress=null;
        inetAddress=InetAddress.getByName(input);
	//checking given host is reachable or not
        if(inetAddress.isReachable(5000)){
            stop=new Date();
            System.out.println("median time taken to "+(stop.getTime()-start.getTime())/2);
        }
	else{
		System.out.println(" not reachable");
	}
}
