package day18.string;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String fruits = "apple,orange,banana";
		
		StringTokenizer st = new StringTokenizer(fruits, ",");
		//hasMoreTokens : 다음 토큰이 있다면. 없으면 끝났다는 의미
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}