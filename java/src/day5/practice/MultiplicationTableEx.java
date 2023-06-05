package day5.practice;

import java.util.Scanner;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 2단을 출력하는 코드를 작성하세요");
		int gugu = sc.nextInt();
		
		i = 1;
		while(i <= 9) {		
			System.out.println(gugu + " X " + i + " = " + gugu*i);
			++i;
		}

	}

}
