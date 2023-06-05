package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {


		int kor, eng, math;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 성적을 입력하세요.");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		avg = (kor+eng+math)/3.0; //(double)로도 형변환 가능.
		
		System.out.println("평균 점수 : " + avg);
		
		sc.close();
		
	}

}
