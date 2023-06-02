package day4.ifex;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		// 정수가 양수이면 positive number라 출력하고 음수면 nagative로 출력
		// 0이면 0이라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("input in: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println(num + " is a positive number.");
		} else if(num < 0) {
			System.out.println(num + " is a nagative number.");
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}

}
