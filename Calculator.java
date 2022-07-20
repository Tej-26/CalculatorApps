package calculator.example;

import java.util.Scanner;


public class Calculator {
	public int add(int a,int b) {
		
		int sum=0;
		sum=a+b;
		return sum;
	}
	 public int multi(int a,int b) 
	 {
		int multi=0;
		multi=a*b;
		return multi;
	}
	public int sub(int a,int b) 
	{
		int sub=0;
		sub=a-b;
		return sub;
	}
	 public float div(int a,int b) 
	 {
		float div=0;
		div=a/b;
		return div;
	}
	
	public double percentage()
	 {	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the values of a,b,c:");
	 	int a=sc.nextInt();
	 	int b=sc.nextInt();
	 	int c=sc.nextInt();
		double per=0;
		per= (a+b+c)/3.0f;
		return per;
	}
	
		public static void main(String[] args) 
		{   
		
		Calculator c =new Calculator();
	      Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      int b=sc.nextInt();
		c.add(a,b);
		c.sub(a,b);
		c.multi(a,b);
		c.div(a,b);
		c.percentage();
		
		}
	
	}

