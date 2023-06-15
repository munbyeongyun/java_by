package day11.homework;

import java.util.Scanner;

import array.Array;

public class BaseballGameEx1 {

	public static void main(String[] args) {
		// 숫자 야구 게임을 구현하세요.
		int com[] = new int [3]; // 랜덤 수 저장
		int user[] = new int[3]; // 사용자가 입력한 수 저장
		int min =1, max = 9;
		int strike = 0;
		int ball = 0;
		Scanner sc = new Scanner(System.in);
		// 맞춰야할 숫자 3개를 랜덤으로 생성(중복x)
		Array.createRandomArray(min, max, com);
		//Array.printArray(com);// 나중에 주석처리
		
		// 반복문
		do {
			// 사용자가 숫자 3개를 입력
			System.out.print("user : ");
			for(int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
			}
			//사용자 입력 체크
			if(Array.arrayCheck(user) ) {
				System.out.println("You must not enter the same number!");
				continue;
			}
			
			// 판별
			strike = 0;
			ball = 0;
			//스트라이크 개수 판별
			strike = strike(com,user);
			
			//볼의 개수 판별
			ball = ball(com, user);
			
			//스트라이크와 볼의 개수에 맞게 출력
			
		} while(strike < 3);
			
	}
	
	/**스트라이크 개수를 판별하는 메서드
	 * 매개변수 : 두 배열 => int arr1[], int arr2[]
	 * 리턴 타입: 같은 번지에 있는 값들이 몇개 같은지
	 * 메서드명 : strike
	 * 
	 */
	public static int strike(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 하나라도 있으면 비교할 수 없어서 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		//배열의 개수가 다른 경우 작은 크기의 배열을 기준으로 비교하기 위해 size 계산
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		
		int count = 0; //스트라이크 개수
		for(int i = 0; i < size; i ++) {
			//같은 번지에 있는 값들이 서로 같으면 스트라이크
			if(arr1[i] == arr2[i]) {
				count++;
			}
		}
		return count;
	}
	
	/**볼 개수를 판별하는 메서드
	 * 매개변수 : 두 배열 => int arr1[], int arr2[]
	 * 리턴 타입: 다른 번지에 있는 값들이 몇개 같은지
	 * 메서드명 : strike
	 */
	public static int ball(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 하나라도 있으면 비교할 수 없어서 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		//다른 번지를 비교해서 찾아도 되지만
		//두 배열에서 같은 숫자의 개수에서 스트라이크 개수를 빼면 볼의 개수
		for(int tmp : arr1) {
			//배열1에서 꺼낸 값이 arr2에 있으면 개수를 증가 
			if(Array.contains(arr2, tmp, arr2.length)) {
				count++;
			}
		}
		return count - strike(arr1, arr2);
		/*for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(i==j) {
					continue;
				}
				if(arr1[i] == arr2[i]) {
					count++;
				}
			}
		}
		return count;
		*/
	}
	
	/**스트라이크와 볼의 개수가 주어지면 결과를 출력하는 메서드
	 * 매개변수 : 스트라이크 개수, 볼의 개수=> int strike, int ball
	 * 리턴 타입: 없음 => void
	 * 메서드명 : printResilt
	 */
	public static void printResilt(int strike, int ball) {
		if(strike != 0) {
			System.out.println(strike + "S");
		}
		if(ball !=0) {
			System.out.println(ball + "B");
		}
		if(strike == 0 && ball == 0) {
			System.out.println("3O");
		}
		System.out.println();
	}
	
}
