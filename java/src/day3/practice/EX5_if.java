package day3.practice;

import java.util.Scanner;

public class EX5_if {

	public static void main(String[] args) {
		// 성별(M: 남자,W:여성)을 입력받아 여성인지 확인하는 코드를 작성하세요.
		//조건 연산자 이용
		// 입력 : M  -> 당신은 여자입니까? false
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 적으세요.");
		String gender = sc.next();
		boolean result = gender == "W";
		
		if (gender != "W"){
			System.out.println("여자입니다.");
		}
		else{
			System.out.println("여자가 아닙니다.");
		}
		
		
		sc.close();
	}

}
