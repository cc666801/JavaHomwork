package Homework5;

import java.util.Arrays;

public class Stack1 {
	int[] x;
	int top;
	// Constructor
	public Stack1(int[] x, int top) {
		this.x = x;
		this.top = top;
	}
	
	public void push(int number) {
			if (top == -1) {
				top++;
			}
			try { // Exception 1
				if (top >= x.length) {
					throw new StackFullException();
				}
				System.out.println("Array x Before push:" + Arrays.toString(x));
				// Set number to x[top]
				x[top] = number;
				System.out.println("The push element is " + x[top]);
				System.out.println("Array x After push:" + Arrays.toString(x) + "\n");
				top++;
			} catch (StackFullException e1) {

				top = x.length;

				System.out.println("The stack is full!");
			}
		}

		public void pop () {
				if (top == x.length) {
					top--;
				}
				try {  // Exception 2
					if (top < 0) {
						throw new StackEmptyException();
					}
					System.out.println("Array x Before pop:" + Arrays.toString(x));
					System.out.println("The pop element is " + x[top]);
					// remove x[top]
					x[top] = 0;
					System.out.println("Array x After pop:" + Arrays.toString(x) + "\n");
					top--;
				} catch (StackEmptyException e2) {
					top = -1;
					System.out.println("The stack is empty!");
				}
			}
		}