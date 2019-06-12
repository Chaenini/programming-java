package java_17;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class p158_fileExam {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
