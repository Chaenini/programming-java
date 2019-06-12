package java_07;

import java.util.*;

public class StudentNumberToMajor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요 >>>");
		int grade = sc.nextInt();
		
		if(grade == 1 || grade ==2) {
			System.out.print("반을 입력하세요 >>>");
			int classroom = sc.nextInt();
			if (classroom == 1 || classroom == 2) {
				System.out.println("뉴미디어 소프트웨어과 입니다 :)");
			}
			else if (classroom == 3 || classroom == 4) {
				System.out.println("뉴미디어 웹 솔루션과 입니다 :)");
			}
			else if (classroom == 5 || classroom == 6) {
				System.out.println("뉴미디어 디자인과 입니다 :)");
			}
			else
				System.out.println("잘못 입력 하셨습니다 :(");
		}
		
		else if(grade == 3) {
			System.out.print("반을 입력하세요 >>>");
			int classroom = sc.nextInt();
			if (classroom == 1 || classroom == 2) {
				System.out.println("인터렉티브 미디어과 입니다 :)");
			}
			else if (classroom == 3 || classroom == 4) {
				System.out.println("뉴미디어 디자인과 입니다 :)");
			}
			else if (classroom == 5 || classroom == 6) {
				System.out.println("뉴미디어  솔루션과 입니다 :)");
			}
			else
				System.out.println("잘못 입력 하셨습니다 :(");
		}
		
		else
			System.out.println("미림여자 정보과학고등학교에는 6반까지 있습니다 !");
		
		System.out.println("--------------------------------------------------------");
		System.out.print("학번을 입력하세요 >>>");
		String number = sc.next();
		if(number.substring(0,1).equals("1") || number.substring(0,1).equals("2")) {
		if(number.substring(1,2).equals("1") || number.substring(1,2).equals("2")) 
			System.out.println("뉴미디어 소프트웨어과 입니다 :)");
		else if(number.substring(1,2).equals("3") || number.substring(1,2).equals("4")) 
			System.out.println("뉴미디어 웹 솔루션과 입니다 :)");
		else if(number.substring(1,2).equals("5") || number.substring(1,2).equals("6")) 
			System.out.println("뉴미디어 디자인과 입니다 :)");
		}
		
		else if(number.substring(0,1).equals("3")) {
			if(number.substring(1,2).equals("1") || number.substring(1,2).equals("2")) 
				System.out.println("인터렉티브 미디어과 입니다 :)");
			else if(number.substring(1,2).equals("3") || number.substring(1,2).equals("4")) 
				System.out.println("뉴미디어 디자인과 입니다 :)");
			else if(number.substring(1,2).equals("5") || number.substring(1,2).equals("6")) 
				System.out.println("뉴미디어 솔루션과입니다 :)");
			}
		System.out.println("--------------------------------------------------------");

		}
	}