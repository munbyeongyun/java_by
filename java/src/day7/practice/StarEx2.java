package day7.practice;

public class StarEx2 {

	public static void main(String[] args) {
		/* *      i = 1
		 * **     i = 2
		 * ***    i = 3
		 * ****   i = 4
		 * *****  i = 5
		 * */

		int i, j;
		//반복문 : i는 1부터 5까지 1씩증가
		//규칙성 : * i개를 출력후 엔터
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i =1; i <= 5; i++) {
			for(j = 4; j >= i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(i=1; i<=5;i++) {

			for(j=1; j<=i; j++) {

				System.out.print('*');

			}

			System.out.println();

		}
	}
	
}


