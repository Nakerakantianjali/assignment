/*

1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.

*/
import java.util.*;
 class abstract Rodent{
    public  abstract void eat();
        
    public abstract void move();
        
}
class Mouse extends Rodent{
    public Rodent(){
	System.out.println("calling Mouse");
	}
    public void eat(){
        System.out.println("Mouse eating...");   
    }
    public void move(){
        System.out.println("Mouse moving..."); 
    }
}
 class Gerbil extends Rodent{
    Public Gerbil(){
	System.out.println("calling Gerbil");
    } 
    
    public void eat(){
        System.out.println("Gerbil eating...");   
    }
     
    public void move(){
        System.out.println("Gerbil moving..."); 
    }
}

class Hamster extends Rodent{
    public Hamster(){
   	System.out.println("calling Hamster");
    }
    
    public void eat(){
        System.out.println("Hamster eating...");   
    }
     
    public void move(){
        System.out.println("Hamster moving..."); 
    }
}

public class Main {
    

    public static void main(String[] args) {
        ArrayList<Rodent>rodentArr=new ArrayList<Rodent>();
        
        //rodentArr.add(new Rodent()); abstract class objec cannot be created
        rodentArr.add(new Hamster());
        rodentArr.add(new Mouse());
        rodentArr.add(new Gerbil());
	for(int i=0;i<rodentArr.size();i++){
		System.out.println(rodentArr.get(i).eat()+"\n"+ rodentArr.get(i).move());
	}
        
    }
}
