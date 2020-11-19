package com.company;
/*
	Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

*/

import jdk.nashorn.internal.ir.CatchNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/Arithematic is user defined exception
public class Arithematic extends Exception {
    public Arithematic(){
  	super("Artthematic Exception");
    }
}
public class Exception1 extends  Exception {
    public Exception1(String str){
        super("error occured due to "+str);
    }
}
public class Exception2 extends  Exception {
    public Exception1(String str){
        super("user name and password should be same ");
    }
}

public class ExceptionExample {


    public void example() throws IOException,Exception1,Arithematic,Exception2 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name:");
        String name = br.readLine();
	String password=br.readLine();
        if(!name.equals("anjali")){
            throw new Exception1(" wrong name");
        }
	else if(password.equal()){
		throw new Exception1();
	}
        System.out.println("enter two operands for division");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b==0){
            throw new Arithematic();
        }
	
	

    }

}
Public class ExceptionAssignment{
	public static void main(String [] args){
		try {
           	ExceptionExample example = new ExceptionExample();
            	example.example();
        	}
        	catch (Exception e){
		//Exception is the base method 
            	System.out.println("caught exception ex"+e);
        	}
        	finally{
            	System.out.println("finally method");
        	}

	}

}