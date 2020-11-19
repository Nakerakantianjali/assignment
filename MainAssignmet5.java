package Anjali.assignment.main;
import Anjali.assignment.*;
import Anjali.assignment.data.Sample;
import Anjali.assignment.singleton.Singleton;
/*
Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values. Create object of second class using static method and then call the other method to print the String.

*/
/*
Note:-sample call is in sample.java file,and Single ton class in Singleton .java


*/
public class Main {


    public static void main(String[] args) {
        Singleton singleton = new Singleton();
	/*it throws eroor becausestatic context doex not belong to object or instance*/
        static Singleton singleton1=singleton.getStr("Anjali");
        singleton.print();
        singleton1.print();


    }

}
