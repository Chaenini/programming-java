package java_11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedExam {
	public static void main(String[] args) {
		BufferedInputStream b1 = new BufferedInputStream(System.in);
		BufferedOutputStream b0 = new BufferedOutputStream(System.out);
		
		int aa;
		try {
			while((aa = b1.read()) != -1) {
				b0.write(aa);
			}
			b0.flush();
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
}
