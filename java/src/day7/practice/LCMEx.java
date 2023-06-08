package day7.practice;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		// 2의 배수 : 2, 4, 6, 8, 10, ....
		// 공배수 : 공통으로 있는 배수
		// 6과 8의 공배수 : 24, 48, 72, ....
		// 최소 공배수 : 공배수 중 가장 작은 배수
		// 6과 8의 최소 공배수 : 24
		
		int num1, num2, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//i는 1부터 (num1 * num2)까지 1씩 증가
		for( i = 1; ; i++ ) {
			//i가 num1의 배수이고 i가 num2의 배수이면
			if( i % num1 == 0 && i % num2 == 0 ) {
				System.out.println(i);
				break;
			}
		}
		
		//i는 num1부터 (num1 * num2)까지 num1씩 증가
		for( i = num1; ; i+=num1) {
			//i가 num2의 배수이면
			if(i % num2 == 0) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
