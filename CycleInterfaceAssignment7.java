
/*

4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
interface Cycle{
    public void ride();
    
}
interface CycleFactory{
    public  Cycle getCycle(); 
}

class Unicycle implements Cycle{
    public void ride(){
        System.out.println("ride unicycle");
    }
}
class UnicycleFactory implements CycleFactory{
    public  Cycle getCycle(){
        return new Unicycle();
    }
}
class Bycycle implements Cycle{
    public void ride(){
        System.out.println("ride bycycle");
    }
}
class BycycleFactory implements CycleFactory{
    public  Cycle getCycle(){
        return new Bycycle(); 
    }
}
class Tricycle implements Cycle{
    public void ride(){
        System.out.println("ride tricycle");
    }
}
class TricycleFactory implements CycleFactory{
    public  Cycle getCycle(){
        return new Tricycle(); 
    }
}



public class Solution{
 public static void main(String[] args) {
          
      BycycleFactory bycyclefactory=new BycycleFactory();
      Bycycle bycle=(Bycycle)bycyclefactory.getCycle();
      bycle.ride();
    
   }
}
