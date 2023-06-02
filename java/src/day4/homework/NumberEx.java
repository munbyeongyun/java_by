package day4.homework;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수면 2를 나누고 홀수면 1을 더하는 코드를 작성하세요.");
		
		int num1;
		num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println(num1 / 2);
		} else {
			System.out.println(++num1);
		}
	}
}
