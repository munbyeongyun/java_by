package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		int min =1, max = 100;		
		int input = min - 1; //1~100이 아닌 정수로 초기화 하면됨. 최소값 -1을 해서 랜덤으로 나올수 없는 수
		char menu = 'y';
		Scanner sc = new Scanner(System.in);
			
		/* 외부 반복문 : 게임을 더 진행할건지 결정하는 반복문
		 * 반복횟수 : 입력받은 문자가 n이 아니면 반복
		 * 규칙성 : Up Down 게임 한 판 진행
		 * */
		do {
			//랜덤한 수 생성
			int random =(int)(Math.random() * (max - min + 1) + min);						
			/* 내부 반복문 : Up Down 진행하는 반복문
			 * 반복횟수 : 입력받은 숫자가 랜덤 숫자랑 다르면 반복
			 * 규칙성 : 입력받은 숫자가 랜덤 숫자가 크면 Down!, 작으면 Up! 맞으면 Good!을 출력
			 * */
			do {
				//입력
				System.out.println("input :");
				input = sc.nextInt();
				
				//판별한 후 결과 출력
				if(input > random) {
					System.out.println(input + "Down!");
				} else if(input < random) {
					System.out.println(input + "Up!");
				} else {
					System.out.println("Good!");
				}
			}while(input != random);
			//menu 선택 더 할건지 말건지
			System.out.println("continue?(y/n) : ");
			menu = sc.next().charAt(0);
		} while(menu != 'n');
			
			
			sc.close();
		
		}

	}

