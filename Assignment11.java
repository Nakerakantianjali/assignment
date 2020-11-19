/*
Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and counts the occurrence of all the different characters. Save the results in a text file.

*/
import java.io.*;

Class Assignment11{
	public static void main(String [] args)thorws Exception{
		File file=new File(args[0]);
 		FileWriter fw=new FileWriter(file.getPath(),true);
            	BufferedWriter bw=new BufferedWriter(fw);
            	try {
                	fr=new FileOutputStream(file.getPath(),true);
                	for (Map.Entry<Character, Integer> entry : m.entrySet()) {
                                        bw.write(entry.getKey() +" "+entry.getValue()+"\n");                }
            }
            catch (Exception e){}
            finally{
                bw.close();
            }
	}
}