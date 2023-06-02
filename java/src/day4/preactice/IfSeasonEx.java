package day4.preactice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(월)을 입력해주세요. ");
		int month = sc.nextInt();
		
		if(month >= 3 && month <= 5) {
			System.out.println(month + " 은 봄입니다.");
		} else if(month >= 6 && month <= 8) {
			System.out.println(month + " 은 여름입니다.");
		} else if(month >= 9 && month <= 11) {
			System.out.println(month + " 은 가을입니다.");
		} else if(month == 12 || (month >= 1 && month <= 2)) {
			System.out.println(month + " 은 겨울입니다.");
		} else {
			System.out.println(month + " 은 잘못된 (월)입니다.");
		}
		
		sc.close();
	}
}