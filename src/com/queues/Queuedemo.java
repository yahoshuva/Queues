package com.queues;

import java.util.NoSuchElementException;

public class Queuedemo {
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public Queuedemo() {
		this.front=null;
		this.rear=null;
		this.length=0;
		
	}

	private class ListNode{
		private int data; // data store
		private ListNode next;// reference
		
		
		public ListNode( int data) {
			// takes data part
			this.data=data;
			this.next=null;
			
			}
	}
	public int length() {
		return length;
		
	}
	public boolean isEmpty() {
		return length ==0;
		// if length is zero then it is true,
		//if length is > zero then it is false;
	}
	public void enqueue(int data) {
		ListNode temp = new ListNode(data); 
			if(isEmpty()) {
				front = temp;
			}else { // if queue is not empty then we insert the value of rear
				rear.next=temp;
		}
			rear=temp;
			length++;
	}
	public void print() {
		if(isEmpty()) {
			return;   // these comes when the list is empty 
		}
		
		ListNode current =front;
		while(current!=null) {
			System.out.print(current.data +" -->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is already empty");
			}
		int result = front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		length--;
		return result;
		
}
	/*
	public int first() {
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		}
		return front.data;
	}
	public int last() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return rear.data;
	}
	
	*/
	public static void main(String[] args) {
		Queuedemo queue = new Queuedemo(); //instance of queuedomo
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.print();
		queue.dequeue();
		//queue.dequeue();
		//queue.dequeue();
		//queue.print();
		//System.out.println(queue.first());
		//System.out.println(queue.last());
		
		
		
		
		

	}

}


/*

creating the instance variables 
front,rear
how to represent a list node,
basically keep two things data part one and reference part
to the next list node.
create constructor 
that takes the data part
create one method 
which returns the length
create one boolean method

now, implement queue,
how to insert an element in a queue

public void enqueue(int data){
ListNode temp = new ListNode(data);
if(isEmpty()){
front=temp;
}
else{
rear.next=temp;
}
rear=temp;
length++;
}
creating Queue constructor

another method which prints queue elements 
-----------------------------------------------
Delete an element

public int dequeue(){
if(isEmpty()){
throw new NoSuchElementException();
}
int result =front.data;
front=front.next;
if(front==null){
rear=null;
}
length--;
return result;


 * 
 */


