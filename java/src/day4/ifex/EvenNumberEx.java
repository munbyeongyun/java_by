package day4.ifex;

import java.util.Scanner;

public class EvenNumberEx {

	public static void main(String[] args) {
		// if else문을 이용한 홀짝 판별 예제
		//num가 짝수이면 짝수라고 출력하고 아니면 홀수라고 출력해라.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수입니다.");
		} else {
			System.out.println(num + "는 홀수입니다.");
		}

		sc.close();
	}

}
