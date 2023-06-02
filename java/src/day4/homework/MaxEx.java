package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 중 큰 수를 출력하세요.");

		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " 이(가)  큰수 입니다.");
		} else {
			System.out.println(num2 + " 이(가) 큰수 입니다.");
		}
		
		sc.close();

	}

}
