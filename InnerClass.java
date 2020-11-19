
/*5. Create a class with an inner class that has a non-default constructor (one that takes arguments). Create a second class with an inner class that inherits from the first inner class.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class BaseOuter{
    int var1;
    class BaseInner{
        int var2=0;
        BaseInner(String str){
            var2=10;
            System.out.println("Baseinner constructor was called with parameter : "+str);
        }
        int fun(){
            System.out.println(" fun was called");
        }
        
    }
}
class ChildOuter{
    //BaseInnner class has scope only to BaseOuter other classes cannot access BaseInnerClass .
    class ChildInner extends BaseInner{
        
        
    }
    
}

public class Solution{
 public static void main(String[] args) {
          
     ChildOuter.ChildInner childinner =new ChildOuter().new ChildInner();
     
   }
}
