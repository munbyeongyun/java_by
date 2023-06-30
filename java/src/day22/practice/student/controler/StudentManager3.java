package day22.practice.student.controler;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day22.practice.student.vo.Student;


public class StudentManager3 implements Program{
	/* 학생 정보를 출력하는 기능을 구현하세요
	 * 1. 학생 전체 출력
	 * 2. 학생 학년 출력
	 * 3. 학생 검색 출력
	 * 4. 종료
	 * */
	private static final int EXIT = 4;
	Scanner sc = new Scanner(System.in);

	List<Student> list = Arrays.asList(
			new Student(1, 1, 1, "Hong"),
			new Student(1, 1, 2, "Ling"),
			new Student(2, 1, 1, "Park"),
			new Student(3, 1, 1, "Lee"),
			new Student(3, 3, 2, "Kim")
		);
		
	
	@Override
	public void printMenu() {
		System.out.println("================");
		System.out.println("1. All");
		System.out.println("2. Grade");
		System.out.println("3. Search");
		System.out.println("4. Exit");
		System.out.print("select : ");
		
	}

	@Override
	public void run() {
		System.out.println("Program Start!!");
		
		int menu;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			
		}while(menu != EXIT);
		
	}

	@Override
	public void runMenu(int menu) {
		Stream<Student> stream = list.stream();
		switch(menu) {
		case 1:	
			stream.forEach(std->System.out.println(std));
			break;
		case 2:
			//검색할 학년 입력
			System.out.print("grade : ");
			final int grade1 = sc.nextInt();
			stream
				.filter(std->std.getGrade()== grade1)
				.forEach(std->System.out.println(std));
			break;
		case 3:	
			//검색할 학년, 반, 번호입력
			System.out.print("grade : ");
			final int grade2 = sc.nextInt();
			System.out.print("class : ");
			final int classNum2 = sc.nextInt();
			System.out.print("number:");
			final int num2 = sc.nextInt();
			stream
				.filter(std->std.equals(new Student(grade2, classNum2, num2, null)))
				.forEach(std->System.out.println(std));
			break;
		case 4:	
			break;
		default:
			System.out.println("Wrong menu!");
		}
		
	}

}
