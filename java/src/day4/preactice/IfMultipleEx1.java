package day4.preactice;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수가 2,3,6 의 배수인가?");
		num = sc.nextInt();

		//6의 배수가 아닌 2의 배수만 찾기 위해 3의 배수가 아닌 정수를 확인
		if((num % 2) == 0 && num % 3 !=0) {
			System.out.println(num + "는(은) 2의 배수입니다");
		} else if((num % 3) == 0 && num % 2 !=0){
			System.out.println(num + "는(은) 3의 배수입니다");
		} else if((num % 6) == 0){
			System.out.println(num + "는(은) 6의 배수입니다");
		} else {
			System.out.println(num + "는(은) 2,3,6의 배수가 아닙니다");
		}
		
		
		//6의 배수일 때 원하는 동작이 먼저 실행되기 위해
		if((num % 6) == 0) {
			System.out.println(num + "는(은) 6의 배수입니다");
		} else if((num % 3) == 0){
			System.out.println(num + "는(은) 3의 배수입니다");
		} else if((num % 2) == 0){
			System.out.println(num + "는(은) 2의 배수입니다");
		} else {
			System.out.println(num + "는(은) 2,3,6의 배수가 아닙니다");
		}
	}

}
