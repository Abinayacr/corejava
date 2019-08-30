package corejava;

import java.util.Scanner;

public class Division {
	public static void main (String[] args) {
		int a,b, result;
		Scanner input=new Scanner(System.in);
		System.out.println("input 2 intergers");
		a=input.nextInt();
		b=input.nextInt();
		try {
			result=a/b;
			System.out.println("result="+result);
		}
			catch(ArithmeticException e) {
				System.out.println("exception caught:div by zero");
			}
			finally {input.close();
			System.out.println("in finally block");
			}
		}
	}

