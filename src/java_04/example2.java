package java_04;

import java.util.*;

public class example2 {
	public static void main(String[] args) {
		
		String[] class3 = {"������","������","�谡��","�質��","�輱��","�����","������","�ڱ���","������","���¿�","������","��ä��","�̼���","��ä��","������","������","������","�����","�Ѵٿ�"};
		System.out.println("��ȣ�� �Է��ϼ��� �̸��� �˷��帳�ϴ�.");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int number = sc.nextInt();
			
			if(1<=number && number<=18)
			System.out.println(class3[number-1]);
			System.out.println("==========");
	}
 }
}