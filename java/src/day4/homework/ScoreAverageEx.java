package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {


		double kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 성적을 입력하세요.");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		double avg = (kor+eng+math)/3;
		
		System.out.println(avg);
		
	}

}
