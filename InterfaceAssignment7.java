/*
3. Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.


*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
interface Interface1{
    public void method1();
    public void interface1(Interface1 obj);
}
interface Interface2 extends Interface1{
    public void method1();
    public void interface2(Interface2 obj);
}
interface Interface3 extends Interface2{
    public void method1();
    public void interface3(Interface3 obj);
}
interface Interface4 extends Interface3{
    public void method1();
    public void interface4(Interface4 obj);
}
        


abstract class Concrete {
    public  void concreate(){
        System.out.println("concreate method");
    }
}
 
class Sample  extends Concrete implements Interface4{
    public void method1(){
        System.out.println("method1 was called");
    }
    public void interface1(Interface1 obj){
        System.out.println("interface1 was called");
    }
    public void interface2(Interface2 obj){
        System.out.println("interface2 was called");
    }
    public void interface3(Interface3 obj){
        System.out.println("interface3 was called");
    }
    public void interface4(Interface4 obj){
        System.out.println("interface4 was called");
    }

}


public class Solution{
 public static void main(String[] args) {
          
          Sample sample = new Sample();
          sample.interface1(sample);
          sample.interface2(sample);
          sample.interface3(sample);
          sample.interface4(sample);
   }
}
