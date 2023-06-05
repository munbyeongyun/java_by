package day4.homework;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		//정수가 짝수면 2를 나누고 홀수면 1을 더한후 num을 출력하는 코드를 작성하세요.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수면 2를 나누고 홀수면 1을 더하는 코드를 작성하세요.");
			
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			num = num / 2;
			//num /= 2;
		} else {
			num += 1;
		}
		System.out.println(num);
		sc.close();
	}
}
