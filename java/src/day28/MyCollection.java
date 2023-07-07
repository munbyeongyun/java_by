package day28;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyCollection {

	public static void main(String[] args) {
		
		FileWriter fw = null;
	    try {
	        fw = new FileWriter("test.txt", true); // Open the file in append mode
	        fw.write(97);
	        fw.write(65);
	        fw.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } 
	}

}
