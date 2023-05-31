package day2.variable;

public class ContstantEx {
	
	public static void main(String[] args) {
		final int MAX_AGE; //상수는 선언과 동시에 초기화 하는것이 좋다.
		// MAX_AGE는 상수, 100은 리터럴
		MAX_AGE = 100;
		// MAX_AGE = 101; 에러 발생 1번 초기화 한 후 수정하려고 했기 때문에
		System.out.println(MAX_AGE);
		
		//지역 변수는 자동으로 초기화가 안됨
		int totlaCount;
		//System.out.println(totlaCount); totalCount 변수가 초기화 되어있지 않기 때문에 사용이 불가능
		// int totlaCount =100; 로 해야 sysout이 가능함
		

	}

}
