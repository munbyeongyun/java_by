package day23.stream;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		File file = new File("tset");
		try {
			//해당 파일 또는 폴더가 존재하지 않고 파일이 폴더가 아닌 파일이면 파일을 생성
			if(!file.exists() && file.getName().contains(".")) {
				file.createNewFile();
				System.out.println("Create Flie!");
			}

			if(!file.exists() && !file.getName().contains(".")) {
				file.mkdir();
				System.out.println("Create Directtory!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//file.delete();
	}

}
