package day27.student.controller;

import java.util.Scanner;

import day27.student.vo.Student;
import day27.student.vo.AttendanceBook;


public class AttendanceController {

	private Scanner sc = new Scanner(System.in);
	
	AttendanceBook book = new AttendanceBook();

	public void run() {
		int menu;
		do {
			//메뉴 출력
			System.out.println("=============");
			printMenu();
			//메뉴 선택(메뉴를 입력받음) : Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu);
			System.out.println("=============");
			
		}while(menu != 4);
		sc.close();
	}
	

	private void runMenu(int menu) {
			
			switch(menu) {
			case 1:
				insertStudent();
				break;
			case 2:
				attendancesStudent();
				break;
			case 3:
				checkStudent();
				break;	
			case 4:
				System.out.println("프로그램 종료!");
				break;
			default:
				System.out.println("잘못된 메뉴 선택!");
			}
			
		}

	
	private void checkStudent() {
		// TODO Auto-generated method stub
		
	}

	private void insertStudent() {
		System.out.print("학생 번호 : ");
		String num = sc.next();
		
		sc.nextLine();
		System.out.print("학생명 : ");
		String name = sc.nextLine();
		//입력받은 정보를 이용하여 학생 객체를 생성
		Student std = new Student(num, name);
		
		//학생 객체를 출석부에 추가
		boolean insertSuccess = book.insertStudent(std);
				
		//추가에 성공하면 성공했다고, 실패하면 실패했다고 출력
		System.out.println("================");
		if(insertSuccess) {
			System.out.println("학생 정보 추가 성공!");
		} else {
			System.out.println("학생 정보 추가 실패!");
		}
	}

	private void attendancesStudent() {
		//날짜 입력
		
		//날짜가 제대로 입력됐는지 체크
		//simpleDateFormat을 이용
		
		//출석부에서 학생 정보들을 가져와서 저장
		//=>AttendanceBook에 학생정보들을 가져오도록 추가 작업
		
		//반복문
			//학생 정보를 출력
		
			//학생의 출결을 입력(O or X)
		
			//출석부에 체크
			//학생정보, 출결을 이용하여 출석 객체를 생성
		
			//출석부에 출석 객체를 추가
			//AttendanceBook에 출석 객체가 주어지면 출석명단에 추가하는 작업
		
	}


	private void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생등록");
		System.out.println("2. 출석 체크");
		System.out.println("3. 출석부 확인");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
		
	}
}
