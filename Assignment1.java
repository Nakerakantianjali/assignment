/*Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.*/

import java.io.*;
import org.apache.commons.io.filefilter.*;

public class Main {

    public static  void main(String[] args) throws IOException {
	    //get home directory		
            String str=System.getProperty("user.home");
            File directory=new File(str);
            File[]files=directory.listFiles();
	   //pattern that need to be matched
           String pattern = "[^.]*.java";
           FileFilter filter = new RegexFileFilter(pattern);
	//list of files that matches with pattern
           files = directory.listFiles(filter);
            for (File file:files){
		//printing absolutefile path
               System.out.println(file.getAbsolutePath());
            }
}