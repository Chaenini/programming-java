package java_07;

import java.util.Scanner;

		public class EasyStudent {
			 
		 public static void main(String ar[]) {
			 String[] grade3 = {"���ͷ�Ƽ��̵���" , "���ͷ�Ƽ��̵���","���̵������ΰ�",
						"���̵������ΰ�","���̵��ַ�ǰ�","���̵��ַ�ǰ�"};
		     String[] grade2 = {"���̵�����Ʈ�����" , "���̵�����Ʈ�����","���̵�����ַ�ǰ�",
		"���̵�����ַ�ǰ�","���̵������ΰ�","���̵������ΰ�"};
			 Scanner sc = new Scanner(System.in);
			 String number  = sc.nextLine();
			 

			String classroomStr = number.substring(1,2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(grade2[classroom]);
			
		 		}
			}