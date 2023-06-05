package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		//정수 num을 입력받아 num의 약수를 출력하는 코드를 작성하세요.
		//반복횟수 : i는 1부터 num까지 1씩증가
		//규칙성 : i가 num의 약수이면 i를 출력
		
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input positive number : ");
		num = sc.nextInt();
		i = 1;
		// i는 1부터 num까지 1씩 증가.
		while(i <= num) {
			//num을 i로 나누었을때 나머지가 0과 같다면 i를 출력
			if(num % i == 0) {
				System.out.println(i);
			}	
			i++;
		}

		sc.close();
	}

}
