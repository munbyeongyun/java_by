package day4.ifex;

public class NestedIfEx {

	public static void main(String[] args) {
		/* 2,3,6의 배수 판별 예제 
		 * (day4.practice패키지에 IfMultipleEx1 문제)*/
		int num = 14 ;
		
		//2의 배수 ==> 2,4,6,8,10,12
		if(num % 2 == 0) {
			//3의 배수 ==> 6의 배수 ==> 6,12,18
			if(num % 3 == 0) {
				System.out.println("A multiple of 6");
			} 
			//아닌수 ==> 2의 배수 2,4,6,8,10
			else {
				System.out.println("A multiple of 2");
			}
			//3의 배수
		} else if(num % 3 == 0) {
			System.out.println("A multiple of 3");
		} else {
			System.out.println("Not multiple of 2,3,6");
		}

	}

}
