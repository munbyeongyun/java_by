package day5.practice;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		// 다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지 반복적으로 실행되는 코드를 작성하세요.
		// menu가 3이 아닐때까지
		// 메뉴를 출력
		// 메뉴를 입력
		// 입력받은 메뉴에 따라 콘솔에 출력
		// 입력받은 메뉴가 1이면 프로그램 스타트
		// 입력받은 메뉴가 2이면 프로그램 세이브
		// 입력받은 메뉴가 3이면 프로그램 종료.
		int menu = 0; //3이 아닌 값으로 초기화
		Scanner sc = new Scanner(System.in);
		
		//메뉴를 출력
		while(menu != 3) {
			System.out.println("Menu");
			System.out.println(" ");
			System.out.println("1. Start ");
			System.out.println("2. Save ");
			System.out.println("3. Exit ");
			System.out.println(" ");
			System.out.println("Select Menu : ");
			
			//메뉴를 입력
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Program Start!");
				break;
			case 2:
				System.out.println("Program Save!");
				break;
			case 3:
				System.out.println("Program Exit!");
				break;
			}
			
		}

		sc.close();
	}

}
