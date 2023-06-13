package day10.thisex;

public class StudentMain {

	public static void main(String[] args) {
		Student1.printCount();
		
		Student1 std1 = new Student1(1,1,1,"hong");
		Student1.printCount();
		
		Student1 std2 = new Student1(1,1,2,"lim");
		Student1.printCount();

		//std2.studentCount = 1;
		//System.out.println(std1.studentCount);
		std1.print();
		//std1.printCount();//에러 발생. static이 print에는 안붙어서
		std2.print();
		System.out.println(std1);
		System.out.println(std2);
	}

}
class Student1 {
	private static int studentCount;
	private int grade, classNum, number;
	private String name;
	
	//아래 생성자는 매개변수가 있고, 매개변수의 이름이 멤버변수와 같기 때문에 this를 사용.
	//멤버변수를 호출할 때 this를 반드시 붙여야함.
	public Student1(int grade, int classNum, int number, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
		
	}
	//기본 생성자는 매개변수가 없기 때문에 this를 안써도 됨.
	public Student1() {
		//멤버변수와 이름이 같은 지역 변수를 만들수도 있따.(비추천)
		//int grade = 10;
		//this.grade = grade;
		//다른 생성자 호출 시 첫 라인에 this를 써야 하며 다른 라인에 쓰면 에러 발생
		this(1,1,1,"");
		name = "";
		/*
		grade = 1;
		classNum = 1;
		number = 1;
		name = "";
		*/
	}
	
	public void print() {
		System.out.println("===============");
		System.out.println("grade : " + grade); //객체 변수 사용 가능
		System.out.println("classNum : " + classNum);
		System.out.println("number : " + number);
		System.out.println("name : " + name) ;
		//클래스 변수 사용 가능
		//System.out.println("count : " + studentCount);
		//클래스 메서드 사용가능
		//printCount();
	}
	
	public static void printCount() {
		//클래스 변수 사용 가능
		System.out.println("Registered student count : " + studentCount);
		//객체 변수 사용 불가능
		//grade = 1;
		//객체 메서드 사용 불가능
		//print();
		//객체를 생성 후 호출해서 사용 가능
		Student1 std1 = new Student1();
		std1.name = "hong";
		std1.print();
	}
}
