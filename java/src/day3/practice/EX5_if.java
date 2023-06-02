package day3.practice;

import java.util.Scanner;

public class EX5_if {

	public static void main(String[] args) {
		// 성별(M: 남자,W:여성)을 입력받아 여성인지 확인하는 코드를 작성하세요.
		// 조건 연산자 이용
		// 입력 : M  -> 당신은 여자입니까? false
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 적으세요 (M 또는 W):");
		String gender = sc.nextLine();
		//boolean result = gender.equals("W");
		
		/* if (result) { 
		*  System.out.println(gender + "는 여자입니다."); 
		*  } else { 
		* 	 System.out.println(gender + "여자가 아닙니다."); 
		*  } */
		
		//result라는 변수를 선언해서 또 쓸거 아니면 효율상으로는 이렇게 쓰는게 권장
		if(gender.equals("W")) {
			System.out.println(gender + "는 여자입니다.");
		}
		else if(gender.equals("M")) {
			System.out.println(gender + "는 남자입니다.");
		}
		else {
			System.out.println("제대로 된 성별이 아닙니다.");
			}

		sc.close();
	}

}
