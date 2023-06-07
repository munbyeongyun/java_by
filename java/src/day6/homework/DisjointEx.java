package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요.
		// 서로소 : 최대 공약수가 1인 두수의 관계
		// 3 4 서로소
		// 8 4 서로소가 아님
		
		int num1, num2;
		int gcd = 1;
		int i  =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Two Input Number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i <= num1 && i <= num2) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		if (gcd == 1) {
			System.out.println(num1 + " and " + num2  + " Disjoint");
		} else {
			System.out.println(num1 + " and " + num2  + " Not Disjoint");
		}
		sc.close();
	}

}
