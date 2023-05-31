package day2.variable;

public class Practice {

	public static void main(String[] args) {
		char ch1 = 'A';
		//문자는 ''로 감싸여야 한다.
		
		double kor, eng, math; //int는 소수점 불가.
		kor = 90.5;
		eng = 90.8;
		math = 90.7;
		
		double avg = (kor+eng+math)/3;
		
		System.out.println(avg);

	}

}
