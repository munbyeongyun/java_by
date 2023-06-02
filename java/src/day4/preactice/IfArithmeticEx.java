package day4.preactice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		int num1, num2;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요. (예: 1 + 2)");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2; // 1/2의 결과가 0이어서, 1.0/2로 바꾸어 0.5가 나오게 함
		int mod = num1 % num2;

		if(operator == '+') {
			System.out.println(num1 + " " + operator + " " + num2  + " = " + sum);
		} else if(operator == '-'){
			System.out.println(num1 + " " + operator + " " + num2  + " = " + sub);
		} else if(operator == '*'){
			System.out.println(num1 + " " + operator + " " + num2  + " = " + mul);
		} else if(operator == '/'){
			System.out.println(num1 + " " + operator + " " + num2  + " = " + div);
		} else if(operator == '%'){
			System.out.println(num1 + " " + operator + " " + num2  + " = " + mod);
		} else {
			System.out.println(operator + "는 산술 연산자가 아닙니다.");
		}
		
	}

}
