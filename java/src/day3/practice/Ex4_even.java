package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요?");
		int num = sc.nextInt();	
		
		if((num % 2) == 0) {
			System.out.println(num + "는(은) 짝수 입니다.");
		}
		
		else {
			System.out.println(num + "는(은) 홀수 입니다.");
		}
		
		sc.close();
	}

}

