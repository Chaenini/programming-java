package java_09;

import java.util.Random;

public class Mathmatics {
	public static void main(String[] args) {
		System.out.println(Math.round(15));
		System.out.println(Math.round(15.3));
		System.out.println(Math.round(15.5));
		System.out.println(Math.round(-15));
		System.out.println(Math.round(-15.5));
		System.out.println(Math.round(-15.6));
		System.out.println("--------------------------------");
		
		System.out.println(Math.pow(3,2));
		System.out.println(Math.pow(3.0,2));
		System.out.println(Math.pow(3,2));
		System.out.println("--------------------------------");
		
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(3.0));
		System.out.println("--------------------------------");
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*5)); //4까지
		System.out.println((int)(Math.random()*10)); //9까지
		System.out.println((int)(Math.random()*100)); //99까지
		
		Random random = new Random();
		int randomNum = random.nextInt();
		int start = 100;
		int end = 999;
		int randomNum100to999 = random.nextInt(end-start+1)+start;
		System.out.println(randomNum100to999);
		}
}
