package day16.homework;

import java.util.Scanner;


public class BeverageMachineEX {

	/*단 음료수 자판기에 음료수는 사이다, 콜라, 환타가 고정이라고 가정
	 * 메뉴를 선택하면 음료수와 잔액이 나옴(출력)
	 * 1. 금액투입
	 * 2. 메뉴 선택
	 * 3. 제품 입고
	 * 4. 프로그램 종료
	 * */
	public static final int MAX = 10;
	private Scanner sc = new Scanner(System.in);
	static String[] box = new String[MAX];
    static int[] price = new int[MAX];
    static int[] stock = new int[MAX];
    static int count = 3; // 메뉴의 갯수
    private int totalPrice; //매출금액
    
	public void run() {
		System.out.println("프로그램 시작!!");
		
		int menu = -1;
		final int EXIT = 4;
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//선택한 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("프로그램 종료!!");
	}
	
	private void printMenu() {
		System.out.println("================");
		System.out.println("메뉴");
		System.out.println("1. 금액 투입");
		System.out.println("2. 메뉴 선택");
		System.out.println("3. 제품 입고");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	private void runMenu(int menu) {
		System.out.println("================");
		
		switch(menu) {
		case 1:	
	
			break;
		case 2:
	
			break;
		case 3:	
	
			break;
		case 4:	

			break;
		default:
			System.out.println("잘못된 메뉴!");
		}
	}

}
