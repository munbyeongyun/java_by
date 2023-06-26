package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		try {
		
		int num = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
	
		
		switch(op) {
			case '+' : System.out.println(num+" + "+num2+" = "+(num+num2)); break;
			case '-' : System.out.println(num+" - "+num2+" = "+(num-num2)); break;
			case '*' : System.out.println(num+" * "+num2+" = "+(num*num2)); break;
			case '/' : System.out.println(num+" / "+num2+" = "+(num/num2)); break;
			case '%' : System.out.println(num+" % "+num2+" = "+(num/num2)); break;
			default: System.out.println("Not!");
		}
		
		} catch(InputMismatchException e) {
			System.out.println("Wrong Input");
		} catch(ArithmeticException e) {
			System.out.println("Not operation!");
		}
		catch (Exception e) {
			System.out.println("Exception!");
		}
		test1();
		test2();
		sc.close();
	}

	public static void test1() {
		try {
			System.out.println(1/0);
		} catch(Exception e) {
			System.out.println("Exception!!!");
			return;
		}finally {
			System.out.println("Method1 EXIT!");
		}
	}
	public static void test2() {
		try {
			System.out.println(1/0);
		} catch(Exception e) {
			System.out.println("Exception!!!");
			return;
		}
		System.out.println("Method2 EXIT!!!");
	}
}
