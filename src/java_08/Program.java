package java_08;

public class Program {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append("Project");
		// sb1에도 프로젝트가 추가된다 
		//sb1 = "Java Programming Project"
		str2 = sb1.append(sb2);
		//append : 추가한다
		//sb1 = "Java Programming Project Project"
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("---------------------------------------------------");
		StringBuffer sb3 = new StringBuffer("Funny Java");
		StringBuffer sb4 = null;
		sb4 = sb3.replace(0, 5, "Happy");
		System.out.println("sb3 = " + sb3);
		System.out.println("sb4 = "+sb4);
		System.out.println("---------------------------------------------------");
		
		StringBuffer sb5 = sb4.reverse();
		System.out.println("sb5 = " + sb5);
		System.out.println("---------------------------------------------------");
		
	}
}