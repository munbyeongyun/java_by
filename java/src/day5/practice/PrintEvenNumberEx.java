package day5.practice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		int i;


		i = 1;
		while(i <= 10) {
			if( i % 2 == 0 ){
				System.out.println(i);
			}
			++i;
		}
		i = 2;
		while(i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
		i = 1;
		while(i <= 5) {
			System.out.println(i*2);
			i++;
		}
	}


}
