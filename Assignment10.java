/*Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.

Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).

Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.

The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.
*/
public class Slist<T> {
    public T value;
    public Slist<T>next=null;
    public Slist(){

    }
    public Slist(T value){
        this.value=value;
    }

}
package com.company;

import java.util.LinkedList;

public class SListiterator<T> {
    Slist<T>root=null;
    public void insert(Slist<T> node){
        if(root==null) {
            System.out.println("nullify");
            node.next = root;
            root = node;
        }
        
    }
    public void remove(Slist<T>node) {
        if (root.next != null) {
            root = root.next;
        } else {
            root = null;
        }
    }
        public void iterator(){
            Slist<T>temp=root;
            while(temp!=null){
                System.out.println(temp.value);
                temp=temp.next;
            }
        }

}
public class Main{
   public static <T> void main(String args[]){
	SListiterator<T> slistiterator=new SListiterator<T> ();
	for(int i=0;i<5;i++){
		slistiterator.insert(new Slist(i));
	}
	slistiterator.remove();
	slistiterator.iterator();
   }



}
