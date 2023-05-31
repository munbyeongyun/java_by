package day2.variable;

public class CastEx {

	public static void main(String[] args) {
		int pi = (int) 3.14; //3.14는 double형 리터럴 이기 때문에 int에 저장할 수 없기에 강제형변환을 해야 함.
		
		double num1 = 3; //3은 int형 리터럴이기 때문에 double형 변수에 저장할 수 있기에 자동형변환
		
		int num2 = (int) 123L; //123L은 Long형 리터럴이기 때문에 int에 저장할 수 업음.
		//실제 데이터 분실이 없어도 타입에 맞게 강제형변환을 해야 함.

		System.out.println(pi);
		System.out.println(num2);
		
		System.out.println((double)1/2); //문법엔 문제 없지만 소수점 결과를 위해 double을 사용
	}

}
