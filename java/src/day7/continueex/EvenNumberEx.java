package day7.continueex;

public class EvenNumberEx {

	public static void main(String[] args) {
		// continue문을 이용한 10이하 짝수 출려 예제
		int i;
		
		for( i =1 ; i <= 10  ; i++ ) {
			//i홀수면 건너뜀
			if(i % 2 != 0) {
				continue;	
			}
				
			System.out.println(i);
		}
		
		i = 0;
		while( ++i <= 10) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
