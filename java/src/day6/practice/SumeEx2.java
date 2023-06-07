package day6.practice;

import java.util.Scanner;

public class SumeEx2 {

	public static void main(String[] args) {
		// n을 입력받아 1부터 n까지 짝수의 합을 구하는 코드를 작성하세요
		// 예 : 10 ==> 1 ~ 10 even sum : 30
		
		int n, sum = 0;
		int i = 1; //i는 1부터
		Scanner sc = new Scanner(System.in);	
		System.out.println("Input : ");
		n = sc.nextInt();
		
		//i가 n보다 작거나 같으면 반복
		while (i <= n) {
			//i가 짝수이면 누적
			if (i % 2 == 0) { 
			sum += i;			
			}
			i++;
		}
		System.out.println("1 ~ " + n + " even sum : " + sum);
	}


}
