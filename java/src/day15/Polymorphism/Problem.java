package day15.Polymorphism;

public class Problem {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
		
		for(int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		/*
		다음 빈칸에 맞는 내용을 채우세요.
		객체는 멤버변수, 생성자, 메서드로 이루어져있다.
		객체의 속성을 멤버변수이라 한다.
		객체의 기능을 메서드이라 한다.
		멤버 변수를 초기화 하는 것을 생성자이라 한다.
		메서드에서 멤버 변수와 매개변수의 이름이 같을 때 구별하기 위해 this 키워드를 사용한다.
		*/

		/*다음 빈칸에 맞는 내용을 채우세요.
			모든 객체들이 공유하며 1개의 변수만 생성하기 위해서 static 키워드를 멤버 변수 앞에 붙인다.
			같은 자료형을 모아놓은 것을 배열이라 한다.
			배열은 0번지부터 시작
			배열의 길이는 배열명. length을 이용하여 알 수 있다.
		 */
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(i);
		}
		
		class A{
			int num;	
			public A(int num){
				this.num = num;
			}
			
			public A() {
				
			}
		}
		//main메서드
		A a = new A();

	}

}
