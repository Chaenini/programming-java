package java_03;
import java.util.*;

public class example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			System.out.print("���Ͻô� �������� ���ڸ� �Է��ϼ��� >>> ");
			int a = sc.nextInt();	
			
		for(int i =1; i<=9; i++) {
				System.out.println(a+" x "+i+" = "+a*i);
		}
	}
}