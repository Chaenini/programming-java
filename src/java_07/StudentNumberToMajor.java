package java_07;

import java.util.*;

public class StudentNumberToMajor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�г��� �Է��ϼ��� >>>");
		int grade = sc.nextInt();
		
		if(grade == 1 || grade ==2) {
			System.out.print("���� �Է��ϼ��� >>>");
			int classroom = sc.nextInt();
			if (classroom == 1 || classroom == 2) {
				System.out.println("���̵�� ����Ʈ����� �Դϴ� :)");
			}
			else if (classroom == 3 || classroom == 4) {
				System.out.println("���̵�� �� �ַ�ǰ� �Դϴ� :)");
			}
			else if (classroom == 5 || classroom == 6) {
				System.out.println("���̵�� �����ΰ� �Դϴ� :)");
			}
			else
				System.out.println("�߸� �Է� �ϼ̽��ϴ� :(");
		}
		
		else if(grade == 3) {
			System.out.print("���� �Է��ϼ��� >>>");
			int classroom = sc.nextInt();
			if (classroom == 1 || classroom == 2) {
				System.out.println("���ͷ�Ƽ�� �̵��� �Դϴ� :)");
			}
			else if (classroom == 3 || classroom == 4) {
				System.out.println("���̵�� �����ΰ� �Դϴ� :)");
			}
			else if (classroom == 5 || classroom == 6) {
				System.out.println("���̵��  �ַ�ǰ� �Դϴ� :)");
			}
			else
				System.out.println("�߸� �Է� �ϼ̽��ϴ� :(");
		}
		
		else
			System.out.println("�̸����� �������а���б����� 6�ݱ��� �ֽ��ϴ� !");
		
		System.out.println("--------------------------------------------------------");
		System.out.print("�й��� �Է��ϼ��� >>>");
		String number = sc.next();
		if(number.substring(0,1).equals("1") || number.substring(0,1).equals("2")) {
		if(number.substring(1,2).equals("1") || number.substring(1,2).equals("2")) 
			System.out.println("���̵�� ����Ʈ����� �Դϴ� :)");
		else if(number.substring(1,2).equals("3") || number.substring(1,2).equals("4")) 
			System.out.println("���̵�� �� �ַ�ǰ� �Դϴ� :)");
		else if(number.substring(1,2).equals("5") || number.substring(1,2).equals("6")) 
			System.out.println("���̵�� �����ΰ� �Դϴ� :)");
		}
		
		else if(number.substring(0,1).equals("3")) {
			if(number.substring(1,2).equals("1") || number.substring(1,2).equals("2")) 
				System.out.println("���ͷ�Ƽ�� �̵��� �Դϴ� :)");
			else if(number.substring(1,2).equals("3") || number.substring(1,2).equals("4")) 
				System.out.println("���̵�� �����ΰ� �Դϴ� :)");
			else if(number.substring(1,2).equals("5") || number.substring(1,2).equals("6")) 
				System.out.println("���̵�� �ַ�ǰ��Դϴ� :)");
			}
		System.out.println("--------------------------------------------------------");

		}
	}