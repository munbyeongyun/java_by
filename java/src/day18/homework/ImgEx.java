package day18.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ImgEx {

	public static void main(String[] args) {
		/*파일명을 입력받아 파일이 이미지인지 확인하는 코드를 작성하세요.
		 * 이미지 확장자 img, bmp, png
		 * input : dog.jpg
		 * dog.jpg : Image
		 * 
		 * input : dog.exe
		 * dog.exe : Not image*/ 

		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		String img = sc.nextLine();
		String str = "^[a-zA-Z]+[.bmp|img|png]+$"; 
		
		//boolean regex = Pattern.matches(str, img);
		if(img != str) {
			System.out.println(img + " : " + "Not imge");
		} else {
			System.out.println(img + " : " + "Imge");
		}
	}

}
