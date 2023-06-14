package day11.homework;

import java.util.Scanner;

public class BaseballGameEx {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 구현하세요.
		1 ~ 9 사이의 중복되지 않은 세 수를 맞추는 게임.
		규칙 :
		B : 같은 숫자가 있지만 위치가 다름
		S : 같은 숫자가 있고 위치가 같음
		30 : 일치하는 숫자가 하나도 없음
		*/

		int min =1, max = 9;	
		int arr [] = new int[3];
		int userArr [] = new int[3];
		int strike = 0;
		int ball = 0;
		int out = 0;
		boolean checkArr[] = new boolean[10];
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//방법1 : 9번지까지 있는 배열을 이용
		//작업이 단순. 저장 공간이 필요
		for (int i = 0; i < 3;) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//checkArr 배열에 random번지에 있는 값이 false이면
			if(!checkArr[random]) {
				//random을 배열에 저장.
				arr[i] = random;
				//i를 증가.
				i++;
				//checkArr 배열에 random번지에 있는 값을 true로 변경
				checkArr[random] = true;
			}
		}
		for(int i = 0; i<3; i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println(" ");
		while(true) {
			System.out.println("1~9사이의 정수를 입력하세요 :  ");
			for(int i = 0; i < arr.length; i++) {
				//여기다 쓰면 반복 
				userArr [i] = sc.nextInt();
				for(int j = 0; j < i; j++) {
					if(userArr[j] == userArr[i]) {
						System.out.println("중복된 값을 입력 했습니다.");
						i--;
						break;
					}
				}
			}
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < userArr.length; j++) {
					if(arr[i] == userArr[j] && i == j) {
						strike++;
					} else if (arr[i] == userArr[j] && i != j){
						ball++;
					}
						
				}
			}
			
			System.out.println(strike + "스트라이크" + ball + "볼" + out + "아웃" );
			System.out.println(" ");
        	if(strike == 3) {
            		System.out.println("정답!");
                    	break;     
        	}

        	strike = 0;
        	ball = 0;
		
	}
		
	}
}
