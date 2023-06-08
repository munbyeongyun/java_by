package day7.practice;

public class StarEx4 {

	public static void main(String[] args) {
		int i, j;
		
		for(i = 1; i < 7; i+=2) {
			for(j = 7; j >= i; j -=2 ) {
				System.out.print(" ");
			}
			for(j = 1; j <= i; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		for(i = 1; i <= 7; i+=2) {
			for(j = 1; j <= i; j +=2 ) {
				System.out.print(" ");
			}
			for(j = 7; j >= i; j --) {
				System.out.print("*");
			}
			System.out.println();
		}	

	}

}
