/*Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
*/
import java.io.*
import org.apache.commons.io.*
public class Main {



    public static  void main(String[] args) throws IOException {
         String pattern="^[A-Z][^\\.]*[^\\.]*\\.$";
         Pattern p=Pattern.compile(pattern);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().trim();
         boolean b=p.matcher(s).lookingAt();
         if(b){
             System.out.println("input following the pattern");
         }
         else{
             System.out.println("input not following the pattern ");
         }
}