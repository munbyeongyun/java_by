package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		// 1~100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
		// 랜덤한 수 : 45
		// input : 50
		// Down!
		// input : 40
		// Up!
		// input : 45
		// Good!

		int min =1, max = 100;		
		int input = min - 1; //1~100이 아닌 정수로 초기화 하면됨. 최소값 -1을 해서 랜덤으로 나올수 없는 수
		
		int random =(int)(Math.random() * (max - min + 1) + min);
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자 중에서 하나의 숫자를 맞추세요. :");
		
		
		// 입력한 정수가 정답이 아니면 반복
		while (input != random) {
			input = sc.nextInt();

			if(input > random) {
				System.out.println(input + "보다 더 작은 정수를 입력하세요! :");
			} else if(input < random) {
				System.out.println(input + "보다 더 큰 정수를 입력하세요! :");
			} else {
				System.out.println("정답 입니다! :");
			}
			input++;
		}
		sc.close();
	}

}
