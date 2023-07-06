package day27.iostram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOStreamEx {

	public static void main(String[] args) {
		//문자 단위로 읽어오는 예제
		try(FileReader fr = new FileReader("file.txt")) {
			char buffer[] = new char[1024];
			while(fr.read(buffer) != -1) {
				System.out.print(buffer);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception!");
		}
		//문자 단위로 쓰는 예제
		try(FileWriter fw = new FileWriter("file.txt", true)) {
			String str = "Hello World!\n";
			fw.write(str);
			String str2 = "Hi. Java!\n";
			fw.write(str2);
		} catch (IOException e) {
			System.out.println("Exception!");
		}
	}

}
