// Implimenting a program demonstrating Priority Que
package com.collections;
//import priorityQue package
import java.util.PriorityQueue;
//class
public class DemoPriorityQue {
     //main-function
	public static void main(String[] args) {
		//creating object for the collections
      PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
      //methods for adding int values
      pq.add(20);
      pq.add(30);
      pq.add(60);
      pq.add(80);
      pq.add(10);
      //print values
      System.out.println(pq);
      pq.add(50);
      System.out.println(pq);
      //print peek(top) element
      System.out.println(pq.peek());
      System.out.println(pq.poll());
      //printing size of values
      System.out.println(pq.size());
      //check values empty or not
      System.out.println(pq.isEmpty());
	}

}
