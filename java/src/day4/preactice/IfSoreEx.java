package day4.preactice;

import java.util.Scanner;

public class IfSoreEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input score : ");
		int score = sc.nextInt();

		/*
		if(score >= 90 && score <= 100 ) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 50) {
			System.out.println("D");
		} else if(score >= 0 && score < 60){
			System.out.println("F");
		} else {
			System.out.println("wrong score");
		}
		*/
		
		/* score가 0미만 이거나 100초과이면 wrong scroe!
		 * score가 90이상이면 A
		 * score가 80이상이면 B
		 * score가 70이상이면 C
		 * score가 60이상이면 D
		 * 아니면 F
		 */
		if(score < 0 || score > 60) {
			System.out.println("wrong score");
		} else if(score >= 90) {
			System.out.println("A");
		} else if(score > 80) {
			System.out.println("B");
		} else if(score > 50) {
			System.out.println("C");
		} else if(score > 60){
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		sc.close();
	}

}
