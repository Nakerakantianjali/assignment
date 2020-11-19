import java.io.*;
import java.util.*;
/*

2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.

*/
class Cycle{
}
class Unicycle extends Cycle{
    public void addBalance(){
        System.out.println("add balance to unicycle");
    }
}
class Bycycle extends Cycle{
    public void addBalance(){
        System.out.println("add balance to tricycle");
    }
}
class Tricycle extends Cycle{
    
}
public class Solution{
 public static void main(String[] args) {
          ArrayList<Cycle>cycleArr=new ArrayList<Cycle>();
          Unicycle unicycle=new Unicycle();
          Bycycle bycycle=new Bycycle();
          Tricycle tricycle=new Tricycle();
          cycleArr.add(unicycle);
          cycleArr.add(bycycle);
         //cycleArr.add(tricycle);
         //compilation error after upcasting because the Cycle class did not had addbalance method
         /* for(int i=0;i<cycleArr.size();i++){
              cycleArr.get(i).addBalance();
          }*/
          unicycle=(Unicycle)cycleArr.get(0);
          unicycle.addBalance();
          bycycle=(Bycycle)cycleArr.get(1);
          bycycle.addBalance();
          
   }
}
