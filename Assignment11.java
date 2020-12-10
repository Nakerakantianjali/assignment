/*
Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and counts the occurrence of all the different characters. Save the results in a text file.

*/
import java.io.*;

Class Assignment11{
	public static void main(String [] args)thorws Exception{
		File file=new File(args[0]);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        Map<Character,Integer>map=new HashMap<Character, Integer>() ;
        while((line = reader.readLine()) != null)
        {

            for(int i=0;i<line.length();i++){
                System.out.println(line);

                if(!map.containsKey(line.charAt(i))){
                    map.put(line.charAt(i),1);
                }
                else{

                    map.put(line.charAt(i),map.get(line.charAt(i))+1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() +" "+entry.getValue()+"\n");                }
    }
}
