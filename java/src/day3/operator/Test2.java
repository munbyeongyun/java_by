package day3.operator;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		int score = sc.nextInt();
		String result = score >= 60 ? "pass" : "false";
		System.out.println("Do you pass " + score + " points?" + result);
		
		sc.close();
		

	}

}
