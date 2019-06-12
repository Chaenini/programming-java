package java_04;

import java.util.*;

public class example1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
		System.out.print("좋아하는 그룹의 멤버 수를 입력하세요 >>> ");
		int member = sc.nextInt();
		
		if(member == 5) {
			System.out.println("ITZY를 좋아하시군요 :)");
		}
		else if(member == 7) {
			System.out.println("BTS를 좋아하시군요 :)");
		}
		else if(member == 9) {
			System.out.println("EXO를 좋아하시군요 :)");
		}
		else if(member == 13) {
			System.out.println("Seventeen을 좋아하시군요 :)");
		}
		else {
			System.out.println("종료합니다. ");
			break;
	    	}
		}
		
		System.out.println("------------------------------------------------------------");
		
		for(int i=0;; i++) {
			System.out.print("자신의 반을 입력하세요 >>> ");
			
			int classroom = sc.nextInt();
			
			if(classroom == 1) {
				System.out.println("2학년 1반 이시군요 :)");
			}
			else if(classroom == 2) {
				System.out.println("2학년 2반 이시군요 :)");
			}
			else if(classroom == 3) {
				System.out.println("2학년 3반 이시군요 :)");
			}
			else if(classroom == 4) {
				System.out.println("2학년 4반 이시군요 :)");
			}
			else if(classroom == 5) {
				System.out.println("2학년 5반 이시군요 :)");
			}
			else if(classroom == 6) {
				System.out.println("2학년 6반 이시군요 :)");
			}
			
			else {
				System.out.println("종료합니다.");
				break;
			}
			System.out.print("자신의 번호를 입력하세요 >>>");
			int name = sc.nextInt();
			
			switch(name) {
			case 1 : System.out.println("강지민"); break;
			case 2 : System.out.println("강혜정"); break;
			case 3 : System.out.println("김가영"); break;
			case 4 : System.out.println("김나영"); break;
			case 5 : System.out.println("김선옥"); break;
			case 6 : System.out.println("김수진"); break;
			case 7 : System.out.println("류정민"); break;
			case 8 : System.out.println("박교령"); break;
			case 9: System.out.println("서남경"); break;
			case 10 : System.out.println("오승연"); break;
			case 11 : System.out.println("원예린"); break;
			case 12 : System.out.println("원채린"); break;
			case 13 : System.out.println("이서현"); break;
			case 14 : System.out.println("이채린"); break;
			case 15 : System.out.println("이현수"); break;
			case 16 : System.out.println("임현진"); break;
			case 17 : System.out.println("장유경"); break;
			case 18 : System.out.println("장원이"); break;
			case 19 : System.out.println("한다연"); break;
			default : System.out.println("종료합니다."); break;
			}
			System.out.println("------------------------------------------------------------");
		}
	}
}