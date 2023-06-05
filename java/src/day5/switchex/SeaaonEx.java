package day5.switchex;

import java.util.Scanner;

public class SeaaonEx {

	public static void main(String[] args) {
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 월을 입력하세요. : ");
		month = sc.nextInt();
		
		String season = "겨울";
		String a = "현재 계절은 %s입니다.";
		
		
		//case 1, 2, 12: jdk 7버전 이후로 가능
		if(month>0 && month<13)
		{
			switch(month/3)
			{
				case 1 :
					season = "봄";
					break;
				case 2 :
					season = "여름";
					break;
				case 3 :
					season = "가을";
					break;
			}
		}
		else
		{
			a = "입력값이 잘못되었습니다.";
		}
		System.out.printf(a, season);
		
		sc.close();
	}

}
