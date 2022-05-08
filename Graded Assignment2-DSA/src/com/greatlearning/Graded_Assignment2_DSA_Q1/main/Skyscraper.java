package com.greatlearning.Graded_Assignment2_DSA_Q1.main;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Skyscraper 
{
	
	static Deque<Integer> queue=new LinkedList<Integer>();
	static Stack<Integer> stack=new Stack<Integer>();
	static Scanner sc=new Scanner(System.in);
	static int i;
	
	
	public static void main(String[] args) 
	
	{
		
		System.out.println("enter the total no of floors in the building");
		int n=sc.nextInt();
		
		int [] array=new int[n+1];
		
		for ( i=1;i<=n;i++)
		{
			
			System.out.println("enter the floor size given on day : "+i);
			int size=sc.nextInt();
			array[i]=size;
			stack.push(i);
		
		}
		
		
		System.out.println();
		
		System.out.println("The order of construction is as follows");
		
		for(i=1;i<=n;i++)
		{
			
			queue.addFirst(array[i]);
			System.out.println("Day : "+i);
			pop(stack,queue);
		    System.out.println();
		
		}
	
     }

	private static void pop(Stack<Integer> stack, Deque<Integer> queue) 
	
	{
		
		  //Base case
		
		if(queue.isEmpty() || stack.isEmpty())
	    {
	    	return;
	    }
		
		
		else if (queue.peek()==stack.peek())
	    {
	    	
            System.out.print(stack.pop()+" ");
	    	queue.poll();
	    	pop(stack,queue);
	    	
	    }
	    
	    else
	    {
	    	return;
	    }
		
	}

}

