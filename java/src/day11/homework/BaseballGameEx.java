package day11.homework;

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
		int [] arr = new int[3];
		boolean checkArr[] = new boolean[10];
		
		System.out.println("input Number : ");
		
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
	}

}
