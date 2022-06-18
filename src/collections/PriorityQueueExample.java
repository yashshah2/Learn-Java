package collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(5);
		pQueue.add(15);
		pQueue.add(10);
		pQueue.add(25);
		pQueue.add(20);
		pQueue.add(5);

        System.out.println("Result1 :" + pQueue);
		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());
		System.out.println("Result2 :" + pQueue);
		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());
		System.out.println("Result3 :" + pQueue);
		// Printing the top element again
		System.out.println(pQueue.peek());
		System.out.println("Result4 :" + pQueue);

		System.out.println("Final :" + pQueue.poll());
		System.out.println("Result5 :" + pQueue);
	}
}
