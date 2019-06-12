package java_04;

import java.util.*;

public class example2 {
	public static void main(String[] args) {
		
		String[] class3 = {"강지민","강혜정","김가영","김나영","김선옥","김수진","류정민","박교령","서남경","오승연","원예린","원채린","이서현","이채린","이현수","임현진","장유경","장원이","한다연"};
		System.out.println("번호를 입력하세요 이름을 알려드립니다.");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int number = sc.nextInt();
			
			if(1<=number && number<=18)
			System.out.println(class3[number-1]);
			System.out.println("==========");
	}
 }
}