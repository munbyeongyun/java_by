package day4.preactice;

import java.util.Scanner;

public class IfAdultEx {

	public static void main(String[] args) {
		// 나이를 입력받아 20살 이상이면 성인 아니면 미성년자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		boolean result = age >= 20;
		
		if(result) {
			System.out.println(age + "는(은) 성인입니다.");
		} else {
			System.out.println(age + "는(은) 미성년자입니다.");
		}

		sc.close();
	}

}