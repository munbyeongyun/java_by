package day6.whileex;

public class SumEx {

	public static void main(String[] args) {
		// 1부터 n까지 합을 구하는 코드를 작성하세요.(n은 10)
		/* 반복횟수 : i는 1부터 n까지 1씩 증가
		 * 규칙성 : 
		 * 반복문 종료 후 : 누적합인 sum을 출력
		 * 			sum = 0
		 * i = 1  	sum = 0 + 1 
		 * i = 2  	sum = 0 +1 + 2
		 * ...
		 * i = 10  	sum = 0 +1 + 2 + 3 + ... + 9 + 10
		 * i = n	sum = sum + i => sum += i
		 * */
		int n = 10, sum = 0;
		int i = 1; //i는 1부터
		
		//i가 n보다 작거나 같으면 반복
		while (i <= n) {
			sum += i; //i는 n까지 1씩증가
			i++;
		}
		System.out.println("1 ~ " + n + " sum : " + sum);
	}

}
