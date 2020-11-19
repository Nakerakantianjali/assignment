package com.company;
/*1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.

2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

3. Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.

4. Complete the previous exercise by creating objects to attach to the array of references.
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.

*/
public class Vampire {
    static int t=0;

    static int lastPermutation=-1;
    //check wheather permutated number is vampire or not
    public static void check(int arr[],int size,int no){
        int l=0,r=0;
        for(int i=0;i<=size/2-1;++i){
            l=l*10+arr[i];
        };


        for(int i=size/2;i<size;++i){
            r=r*10+arr[i];
        };

        if(l*r==no) {
            if(l%10==0 && r%10==0) return;
            else if(lastPermutation==no){
                return;
            }

            else{
                ++t;
                lastPermutation=no;
                System.out.print(no+" ");
            }

        }
    }

    public  static void swap(int arr[],int l,int r){
        int temp;
        temp = arr[l];
        arr[l]=arr[r];
        arr[r] = temp;
    }
   //permutating the array
    public static void permute(int arr[], int l, int r, int size,int no){
        int i;
        if (l == r)
            check(arr,size,no);  //for each permutation check wether the number is prime or not
        else
        {
            for (i = l; i <= r; i++)
            {
                swap(arr,l,i);
                permute(arr, l+1, r,size,no);
                swap(arr,l,i); //backtrack
            }

        }
    }

    public void printVampire() {
       int no=1001;
       int arr[]=new int[20];
       int i=0;
       while(t<100){
           dc=0;
           int temp=no;
	//find the digits count
           while(temp!=0){
               // remainder = temp % 10;
               arr[i] = temp%10;
               temp = temp/10;
               dc++;
           }


           permute(arr,0,dc-1,dc,no);

             ++no;
       }

   }


}
/*2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
*/

public class Sample {
    public Sample(){
        new Sample("calling second constructor");
    }
    public Sample(String str){
        System.out.println(str);
    }

}
/*3. Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.
*/

public class Sample2 {
    private ArrayList<Sample2> arr=new ArrayList<Sample2>();

    public ArrayList<Sample2> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Sample2> arr) {
        this.arr = arr;
    }


}

public class Main {



    public static <T> void main(String[] args) throws IOException {
	//printing vampire numbers from 1 t0 100;
	Vampire vampire=new Vampire();
	vampire.printVampire();
	
	//ovveriding constructors
	Sample sample=new Sample();
	Sample sample=new Sample("constructor with parameter String");
 
	/*4. Complete the previous exercise by creating objects to attach to the array of references.
*/
        //creating Arryalist of type object and adding obj reference
        Sample2 s= new Sample2("sample2");
        ArrayList<Sample2>arr=s.getArr();
        arr.add(new Sample2("Anjali"));
        arr.add(new Sample2("Madhavi"));
        s.setArr(arr);
        
	}
}
