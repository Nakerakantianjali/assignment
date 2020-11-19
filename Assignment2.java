/*
Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). Write time and space complexity of your solution as comments in the source file.
*/
//time complexity is O(n) i.e n is the length of the string;
//space complexity is O(26)
import java.io.*;
import java.util.*;

public class CheckAlphabets {

    public static void main(String[] args) throws IOException{
	//reading input        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
	//converting string to lowercase
        str=str.toLowerCase();
	//character array to check alphabets
        int []c=new int[26];
        int flag=1;
        for(int i=0;i<str.length();i++){
            c[str.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(c[i]==0){
                flag=0;
		break;
            }
        }
        if(flag==1 && str.length()>=26){
            System.out.println("String contain all a-Z alphabets");
        }
        else{
            System.out.println("String does not contain all a-Z alphabets");
        }
    }
}
