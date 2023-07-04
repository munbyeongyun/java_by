package day25.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		//List 인터페이스는 List 인터페이스를 구현한
		//구현 클래스 ArrayList의 객체를 관리할 수 있다.
		//List는 제네릭 클래스.
		//제네릭 클래스는 <>연산자에 클래스명이 들어가야함. 기본 자료형x
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		//Test3
		//HashSet은 List의 구현 클래스가 아니기 때문에 List가 관리할 수 없다.
		List<Integer> list1 = new ArrayList<>();
		list.add(3);
		list.add((int)4);
		list.add((Integer)5);
		
		//Tset4
		//num이 짝수인지 홀수인지 판별하는 예제
		int num = 3;
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		//Test5
		Set<Integer> set = new HashSet<>();
		//Collection 인터페이스에 있는 메서드 : add, size
		//Collection 인터페이스의 자식으로 List와 Set
		set.add(1);
		set.add(2);
		/*
		for(int i = 0; i<set.size(); i++) {
			//get은 List에 있는 메서드. Set은 없는 메서드
			System.out.println(set.get(i));
		}
		*/
		for(Integer tmp : set) {
			System.out.println(tmp);
		}
	}

}
