package day20.practice.student.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day20.practice.student.vo.Student;


public class StudentController implements Program {

	/* Student 클래스를 이용하여 학생을 등록/수정/삭제하는 기능의 프로그램을 작성하세요.
		 * 1. 학생추가
		 * 2. 학생수정
		 * 3. 학생삭제
		 * 4. 프로그램 종료
		 * 
		 * 메뉴 선택 :*/ 
		private final static int EXIT = 4;
		private Scanner sc = new Scanner(System.in);
		
		private ArrayList<Student> list = new ArrayList<>();
		
		@Override
		public void run() {
			System.out.println("프로그램 시작!!");
			
			int menu;
			//반복 : 선택한 메뉴가 종료가 아닐때
			do {
				try {
				//메뉴 출력
				System.out.println(list);
				printMenu();
				
				//메뉴 선택
				menu = sc.nextInt();
				
				//선택한 메뉴에 따른 기능을 실행
				runMenu(menu);
				}catch(InputMismatchException e) {
					menu = EXIT-1;//종료 메뉴가 아닌 아무 메뉴를 추가
					sc.nextLine();//앞에서 잘못 입력한 내용을 비워줌
					System.out.println("잘못된 입력값!");
				}
				
			}while(menu != EXIT);
			System.out.println("프로그램 종료!!");
		}
		@Override
		public void printMenu() {
			System.out.println("================");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 수정");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 포로그램 종료");
			System.out.print("메뉴 선택 : ");
		
		}


		@Override
		public void runMenu(int menu) {
			switch(menu) {
			case 1:	
				insertStudent();
				break;
			case 2:
				updateStudent();
				break;
			case 3:	
				deleteStudent();
				break;
			case 4:	
				break;
			default:
			}
		}
		private void deleteStudent() {
			//삭제할 학생 정보를 입력(학년, 반, 번호)
			System.out.print("몇학년  : ");
			int grade = sc.nextInt();
			
			System.out.print("몇반  : ");
			int classNum = sc.nextInt();
	
			System.out.print("번호  : ");
			int number = sc.nextInt();
			
			//삭제할 학생정보를 이용하여 학생 객체를 생성
			Student tmp = new Student(grade, classNum, number, null);
			
			//삭제를 시도해서 성공하면 성공했다고, 실패하면 실패했다고 알려줌
			if(list.remove(tmp)) {
				//삭제 성공
				System.out.println("삭제 성공!");
				return;
			}
			System.out.println("삭제 실패!");
		}
		private void updateStudent() {
			// 수정할 학생의 정보를 입력(학년, 반, 번호)
			System.out.print("몇학년  : ");
			int grade = sc.nextInt();
			
			System.out.print("몇반  : ");
			int classNum = sc.nextInt();
	
			System.out.print("번호  : ");
			int number = sc.nextInt();
			
			// 수정할 학생이 있는지 없는지 확인.
			// 학생 객체를 생성
			Student tmp = new Student(grade, classNum, number, null);
			int index = list.indexOf(tmp);
			// 없으면 종료
			if(index == -1) {
				System.out.println("업데이트 실패!");
				return;
			}
			// 수정될 학생 정보를 입력(학년, 반, 번호)
			System.out.print("몇학년  : ");
			grade = sc.nextInt();
			
			System.out.print("몇반  : ");
			classNum = sc.nextInt();
	
			System.out.print("번호  : ");
			number = sc.nextInt();
			
			System.out.print("학생명 : ");
			sc.nextLine();
			String name = sc.nextLine();
			
			// 학생 정보를 수정
			// 수정된 학생 정보가 이미 있는 학생인지 확인
			tmp = new Student(grade, classNum, number, name);
			// 학년, 반, 번호가 일치하는 학생이 있는지 확인해서 있으면 종료
			if(list.contains(tmp)) {
				System.out.println("업데이트 실패!");
				return;
			}
			list.get(index).update(grade, classNum, number, name);
		}
		private void insertStudent() {
			//추가할 학생의 정보를 입력(학년, 반, 번호, 이름)
			System.out.print("몇학년  : ");
			int grade = sc.nextInt();
			
			System.out.print("몇반  : ");
			int classNum = sc.nextInt();
	
			System.out.print("번호  : ");
			int number = sc.nextInt();
			
			System.out.print("학생명 : ");
			sc.nextLine();
			String name = sc.nextLine();
			
			//입력받은 정보를 이용하여 학생 객체를 생성
			Student std = new Student(grade, classNum, number, name);
			
			//학생리스트에 추가
			//학생이 있는지 없는지 확인(학년, 반, 번호)해서 없으면 추가
			if(!list.contains(std)) {
				list.add(std);
				System.out.println("학생 정보 추가 성공!");
				return;
			}
			//추가 성공하면 추가했다고, 실패하면 실패했다고 콘솔에 출력
			System.out.println("학생 정보 추가 실패!");
		}

}
