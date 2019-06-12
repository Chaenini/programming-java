package java_12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLineFileExam {
	public static void main(String[] args) {
			FileReader fr;
			try {
				fr = new FileReader("dataw.txt");
				BufferedReader br= new BufferedReader(fr);
				
				String s;
				while ((s=br.readLine()) != null) {
					System.out.println(s);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}
