package day5.switchex;

public class HelloWordEx {

	public static void main(String[] args) {
		// Hello world를 10번 출려하는 코드를 작성하세요.
		/* 반복횟수 : 10번, 1번부터 10번까지 1씩 증가
		 *  => 변수의 초기값 : 1
		 *  => 조건식 : 10까지 => 10보다 작거나 같을때 까지
		 *  => 증가하는식 : 1씩 증가
		 * 규칙성 : Hello world를 출력
		 * */
		int max = 3;
		int i = 1; //변수의 초기값 : 1
		while( i <= max ) {
			System.out.println("Hello world");
			++i;
		}
		System.out.println("=========================");
		/* 반복횟수 : 10번, 10번부터 1번까지 1씩 감소
		 * */
		i = max;
		while( i >= 1 ) {
			System.out.println("Hello world");
			--i;
		}
		System.out.println("=========================");
		i = max;
		while( i-- > 0 ) {
			System.out.println("Hello world");
		}
	}

}
