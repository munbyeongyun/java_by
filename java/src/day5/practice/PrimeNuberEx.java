package day5.practice;

import java.util.Scanner;

public class PrimeNuberEx {

	public static void main(String[] args) {
		// 정수 num을 입력받아 num가 소수인지 아닌지를 판별하는 코드를 작성하세요.
		// 소수 : 2, 3, 5, 7, 11, 13등
		// 소수 : 약수가 1과 자기 자신밖에 없는수
		//반복횟수 : i는 1부터 num까지 1씩증가
		//규칙성 : i가 num의 약수이면 개수 count를  1증가

		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Prime number : ");
		num = sc.nextInt();
		
		i = 1;
		
		while(i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if(count == 2 ){
			System.out.println(num + " is a Prime number : ");
		} else {
			System.out.println(num + " is not a Prime number : ");
		}
		sc.close();
	}

}
