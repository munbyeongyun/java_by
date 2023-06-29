package day22.practice.controler;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import day22.practice.vo.Student;


public class StudentManager implements Program{
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
		int grade=1, classNum=1, num=1;
		switch(menu) {
		case 1:	
			studentAll();
			break;
		case 2:
			//검색할 학년 입력
			System.out.print("grade : ");
			grade = sc.nextInt();
			studentGrade(grade);
			break;
		case 3:	
			//검색할 학년, 반, 번호입력
			System.out.print("grade : ");
			grade = sc.nextInt();
			System.out.print("class : ");
			classNum = sc.nextInt();
			System.out.print("number:");
			num = sc.nextInt();
			studentSearch(grade, classNum, num);
			break;
		case 4:	
			break;
		default:
			System.out.println("Wrong menu!");
		}
		
	}

	private void studentSearch(int grade, int classNum, int num) {
		for(Student tmp : list) {
			if(tmp.equals(new Student(grade, classNum, num, ""))) {
			System.out.println(tmp);
			}
		}
	}

	private void studentGrade(int grade) {
		for(Student tmp : list) {
			if(tmp.getGrade() == grade) {
			System.out.println(tmp);
			}
		}
		
	}

	private void studentAll() {
		for(Student tmp : list) {
			System.out.println(tmp);
		}
		
	}

	


}
