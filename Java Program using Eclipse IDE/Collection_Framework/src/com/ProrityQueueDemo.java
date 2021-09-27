package com;

import java.util.PriorityQueue;

public class ProrityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(4);
		pq.add(1);
		pq.add(5);
		pq.add(3);
		pq.add(1);
		pq.add(6);
		System.out.println(pq);
		System.out.println("Poll elements "+pq.poll());
		System.out.println(pq);
		System.out.println("Poll elements "+pq.poll());
		System.out.println(pq);
	}

}
