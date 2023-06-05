package day4.homework;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		//세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성하세요.	
		// 세 변 중 작은 두 변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		int a, b, c;
		int max; // 세변 길이 중 가장 큰 변의 길이
		Scanner sc = new Scanner(System.in);
		System.out.println("세 변의 길이를 입력하세요.");
				
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//세변 중 가장 큰 변의 길이를 계산
		//a가 b보다크면
		if( a > b) {
			//a가 c보다 크면 a를 max에 저장
			if( a > c ) {
				max = a;
			} else {
			//아니면 c를 max에 저장
				max = c;
			}
		//아니면 b가 c보다 크면 max에 b를 저장	
		} else if( b > c ) {
			max = b;
		} else {
		//아니면 max에 c를 저장
			max = c;
		}
		
		//max = a > b ? ( a > c ? a : c) : ( b > c ? b : c);
		//작은 두변의 합이 >= max
		//세변의 합 - max == 작은 두변의 합
		//세변의 합에서 max를 뺀값이 max보다 크면 삼각형이라고 출력
		if( a + b + c - max > max) {
			System.out.println("삼각형을 만들 수 없습니다.");
		} else {
			System.out.println("삼각형을 만들 수 있습니다");
		}
			
		
		
		sc.close();
	}

}
