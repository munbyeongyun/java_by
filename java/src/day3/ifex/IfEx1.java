package day3.ifex;

public class IfEx1 {

	public static void main(String[] args) {
		//정수 num가 0이면 0입니다라고 출력하는 코드
		//정수 unm가 0이다
		//정수 unm가 0과 같다
		int num = 10;
		if(num == 0) {
			//0입니다라고 출력;
			System.out.println("0입니다.");
		}
		//정수 num가 0아니면 0이 아닙니다라고 출력하는 코드
		//정수 unm가 0아니다.
		if(num != 0) {
			//0입니다라고 출력;
			System.out.println(num + "은 0이 아닙니다.");
		}
	}
}