package java_10;

import java.io.IOException;
import java.util.Scanner;

public class IOProgram {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputString = sc.next();
//		System.out.println(inputString);
//		System.err.println(inputString);
		int bt;
		try {
			while((bt = System.in.read())!=-1) {
			//한 int 값을 읽음
			System.out.println((char)bt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
