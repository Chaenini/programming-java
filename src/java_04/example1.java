package java_04;

import java.util.*;

public class example1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
		System.out.print("�����ϴ� �׷��� ��� ���� �Է��ϼ��� >>> ");
		int member = sc.nextInt();
		
		if(member == 5) {
			System.out.println("ITZY�� �����Ͻñ��� :)");
		}
		else if(member == 7) {
			System.out.println("BTS�� �����Ͻñ��� :)");
		}
		else if(member == 9) {
			System.out.println("EXO�� �����Ͻñ��� :)");
		}
		else if(member == 13) {
			System.out.println("Seventeen�� �����Ͻñ��� :)");
		}
		else {
			System.out.println("�����մϴ�. ");
			break;
	    	}
		}
		
		System.out.println("------------------------------------------------------------");
		
		for(int i=0;; i++) {
			System.out.print("�ڽ��� ���� �Է��ϼ��� >>> ");
			
			int classroom = sc.nextInt();
			
			if(classroom == 1) {
				System.out.println("2�г� 1�� �̽ñ��� :)");
			}
			else if(classroom == 2) {
				System.out.println("2�г� 2�� �̽ñ��� :)");
			}
			else if(classroom == 3) {
				System.out.println("2�г� 3�� �̽ñ��� :)");
			}
			else if(classroom == 4) {
				System.out.println("2�г� 4�� �̽ñ��� :)");
			}
			else if(classroom == 5) {
				System.out.println("2�г� 5�� �̽ñ��� :)");
			}
			else if(classroom == 6) {
				System.out.println("2�г� 6�� �̽ñ��� :)");
			}
			
			else {
				System.out.println("�����մϴ�.");
				break;
			}
			System.out.print("�ڽ��� ��ȣ�� �Է��ϼ��� >>>");
			int name = sc.nextInt();
			
			switch(name) {
			case 1 : System.out.println("������"); break;
			case 2 : System.out.println("������"); break;
			case 3 : System.out.println("�谡��"); break;
			case 4 : System.out.println("�質��"); break;
			case 5 : System.out.println("�輱��"); break;
			case 6 : System.out.println("�����"); break;
			case 7 : System.out.println("������"); break;
			case 8 : System.out.println("�ڱ���"); break;
			case 9: System.out.println("������"); break;
			case 10 : System.out.println("���¿�"); break;
			case 11 : System.out.println("������"); break;
			case 12 : System.out.println("��ä��"); break;
			case 13 : System.out.println("�̼���"); break;
			case 14 : System.out.println("��ä��"); break;
			case 15 : System.out.println("������"); break;
			case 16 : System.out.println("������"); break;
			case 17 : System.out.println("������"); break;
			case 18 : System.out.println("�����"); break;
			case 19 : System.out.println("�Ѵٿ�"); break;
			default : System.out.println("�����մϴ�."); break;
			}
			System.out.println("------------------------------------------------------------");
		}
	}
}