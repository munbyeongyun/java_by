package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		
		int num1, num2;
		int max; //두 수 중 큰 수를 저장할 변수
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 중 큰 수를 출력하세요.");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		//num1이 num2보다 크거나 같으면 max에 num1를 저장.
		if(num1 >= num2) {
			max = num1;
		} else {
			max = num2;
		}
		//max를 출력
		System.out.println(num1 + " 과 " + num2 + " 중 더 큰 수는 " + max + "이(가) 큰수 입니다.");
		max = 100;
		max = num1 >= num2 ? num1 : num2;
		System.out.println(num1 + " 과 " + num2 + " 중 더 큰 수는 " + max + "이(가) 큰수 입니다.");
		
		sc.close();

	}

}
