package day4.homework;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		//세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성하세요.	
		//세 변 중 작은 두 변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		Scanner sc = new Scanner(System.in);
		System.out.println("세 변으로 삼각형을 만들수 있는가?");
		
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
			
		if(num1 + num2 <= num3) {
			System.out.println("삼각형을 만들수 있습니다.");
		} else {
			System.out.println("삼각형을 만들수 없습니다.");
		}
		
		sc.close();
	}

}
