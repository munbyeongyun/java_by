package day2.variable;

public class OverflowEx {

	public static void main(String[] args) {
		byte num = 127;
		num = ++num;  //byte는 127까지 오버플로우 발생해서 -128 결과를 나옴
		
		System.out.println(num);
		
		
		num = -128;
		--num;
		
		System.out.println(num); //언더 플로우가 발생
	}

}
