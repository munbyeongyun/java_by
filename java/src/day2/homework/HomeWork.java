package day2.homework;

public class HomeWork {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2;
		
		/*콘솔에서 정수 2개와 문자 (산술연사자)를 입력받아 출력하는 코드를 작성하세요. 
		 * 두 정수와 산술연산자를 입력하세요 (예: 1 + 2)*/
		System.out.println("문제1번");
		System.out.println("" + num1 + " + " + num2 + " = " + sum);
		int mov = num1 % num2;
		
		
		System.out.println("=============================");
		//두 정수를 입력받아 두 정수의 산술연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님.
		/* 예: 두정수를 입력하세요 1 2 [엔터] 
		1 + 2 = 3 
		1 - 2 = -1 
		1 * 2 = 2 
		1 / 2 = 0.5 
		*/
		
		System.out.println("문제2번");
		System.out.println("" + num1 + " + " + num2 + " = " + sum);
		System.out.println("" + num1 + " - " + num2 + " = " + sub);
		System.out.println("" + num1 + " * " + num2 + " = " + mul);
		System.out.println("" + num1 + " / " + num2 + " = " + div);
		System.out.println("" + num1 + " % " + num2 + " = " + mov);

	}

}
