package Homework5;

import java.util.Arrays;

public class Stack {
	int[] x = new int[3];
	int top = 0;
	
	public void push(int number) {
		try {
			if (top > 2) {
				throw new StackFullException();
			}
			x[top] = number;
//			System.out.println(top);
			System.out.println("All element in array is " +Arrays.toString(x));
			System.out.println("The push element is " +x[top]);
			top++;
		}catch (StackFullException e1){
			top--;
			System.out.println("The stack is full!");
		}
	}
	
	public void pop() {
		try {
			top--;
			if (top < 0) {
				throw new StackEmptyException();
			}
			System.out.println("The pop element is " +x[top]);
			x[top] = 0;
//			System.out.println(top);
			System.out.println("All element in array is " +Arrays.toString(x));
		}catch (StackEmptyException e2){
			System.out.println("The stack is empty!");
		}
	}
}
