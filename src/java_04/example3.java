package java_04;

import java.util.Scanner;

public class example3 {
	public static void main(String[] args) {
		
		System.out.print("��ȣ�� �Է��ϼ��� �̸��� �˷��帱�Կ� >>> ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String[] class3 = {"������","������","�谡��","�質��","�輱��","�����","������","�ڱ���","������","���¿�","������","��ä��","�̼���","��ä��","������","������","������","�����","�Ѵٿ�"};
		
		System.out.println(class3[num-1]);
		
//		for (String name : class3) {
//			System.out.println(name);
//		}
	}
}