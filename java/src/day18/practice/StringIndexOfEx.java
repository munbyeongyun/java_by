package day18.practice;

public class StringIndexOfEx {

	public static void main(String[] args) {
		String str = "Hello world";
		
		int count = 0;
		String search = "l";
		int index = -1;
		//반복 : 찾으면 반복
		do {
			index = str.indexOf(search, ++index);
			//찾았으면 갯수를 추가
			if(index != -1) {
				count++;
			}
		} while(index != -1);
		System.out.println(str + " : " + search + " : " + count);
	}

}
