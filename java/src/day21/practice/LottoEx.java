package day21.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {
		int arr [] = new int[6];
		int min = 1, max = 45;
		int bonus;
		
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> user = new HashSet<>();
		
		while(set.size() < 6) {
			int r = random(min, max);
			set.add(r);
		}
		//보너스 생성
		do {
			bonus = random(min, max);
		} while(set.contains(bonus));
		
		//내림차순 오름차순
		ArrayList<Integer> list = new ArrayList<>(set);
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println(list);
		System.out.println("bonus : " + bonus);
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 6 Numbers : ");
		while(user.size() < 6) {
			user.add(sc.nextInt());
		}
		sc.close();
		
		//등수 체크
		//일치하는 개수확인
		int count = 0;
		for(Integer tmp : user) {
			if(set.contains(tmp)) {
				count++;
			}
		}
		
		//개수를 이용하여 등수 체크
		switch(count) {
		case 6: System.out.println("rank 1"); break;
		case 5: 
			if(user.contains(bonus)) {
				System.out.println("rank 2");
			} else {
				System.out.println("rank 3");
			}
			break;
		case 4: System.out.println("rank 4"); break;
		case 3: System.out.println("rank 5"); break;
		default: System.out.println("fail");
		}
	}
	
	
	
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random() * (max - min + 1) + min);
	}

}
