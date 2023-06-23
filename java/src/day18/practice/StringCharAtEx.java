package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabet[] = new int[26];//각 알파벳 개수를 정하는 배열 0 = a , 1 = b
		
		System.out.println("input : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			//ch가 알파벳 소문자인 경우 0~25사이의 값이 나옴
			int distance = ch - 'a';
			//영문 소문자가 아닌 경우
			if(distance < 0 || distance > 25) {
					continue;
			}
			//맞는 경우
			alphabet[distance]++;
		}
		//알파벳 개수 추가
		for(int i = 0; i < alphabet.length; i++) {
			
			if(alphabet[i] == 0) {
				continue;
			}
			System.out.println((char)('a'+i) + " : " + alphabet[i]);
		}
		sc.close();
	}

}
