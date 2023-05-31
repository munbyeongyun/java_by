package day2.operator;

public class Arithmetic {

	public static void main(String[] args) {
		int num1 = 1, num2 =2;
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2; // 1/2의 결과가 0이어서, 1.0/2로 바꾸어 0.5가 나오게 함
		int mod = num1 % num2;
		
		System.out.println("" + num1 + '+' + num2 + "=" + sum);
		System.out.println("" + num1 + '-' + num2 + "=" + sub);
		System.out.println("" + num1 + '*' + num2 + "=" + mul);
		System.out.println("" + num1 + '/' + num2 + "=" + div);
		System.out.println("" + num1 + '%' + num2 + "=" + mod);
		
		int res = 0;
		// 1 + res = 2;  대입연사자 = 왼쪽에 식이 와서 에러가 발생
		res = 2 - 1; //대입연산자 = 오른쪽에 식이 와서 에러 없이 잘 실행
		//1 = res + 1; //대입연산자 = 왼쪽에는 리터럴이 올 수 없음
		
		
		/*콘솔에서 정수 2개와 문자 (산술연사자)를 입력받아 출력하는 코드를 작성하세요. 
		 * 두 정수와 산술연산자를 입력하세요 (예: 1 + 2)*/
		
		//두 정수를 입력받아 두 정수의 산술연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님.
		/* 예: 두정수를 입력하세요 1 2 [엔터] 1 + 2 = 3 1 - 2 = -1 1 * 2 = 2 1 / 2 = 0.5 */

	}

}
