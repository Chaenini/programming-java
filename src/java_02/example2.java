package java_02;

public class example2 {
	public static void main(String ar[]) {
	int member = 5;
	
	if(member == 5) {
		System.out.println("itzy");
	}
	else if(member == 9) {
		System.out.println("exo");
	}
	else if(member == 1) {
		System.out.println("IU");
	}
	else if(member == 13) {
		System.out.println("seventeen");
	}
	else {
		System.out.println("Nope");
	}	
	
	System.out.println("------------------------");
	
	switch (member) {
	case 5:
		System.out.println("itzy");
		break;
	case 9:
		System.out.println("exo");
		break;
	case 1:
		System.out.println("IU");
		break;
	case 13:
		System.out.println("seventeen");
		break;
	default:
		break;
	}
	
	System.out.println("------------------------");
	
	for(int i=1; i<=9; i++) {
		System.out.println("2 x "+i+" = "+2*i);
	}
	
	System.out.println("------------------------");
  }
}