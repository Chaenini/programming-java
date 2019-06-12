package java_03;

public class example1 {
	public static void main(String[] args) {
		int num=3;
		System.out.println(num+" x "+1+" = "+num*1);
		System.out.println(num+" x "+2+" = "+num*2);
		System.out.println(num+" x "+3+" = "+num*3);
		System.out.println(num+" x "+4+" = "+num*4);
		System.out.println(num+" x "+5+" = "+num*5);
		System.out.println(num+" x "+6+" = "+num*6);
		System.out.println(num+" x "+7+" = "+num*7);
		System.out.println(num+" x "+8+" = "+num*8);
		System.out.println(num+" x "+9+" = "+num*9);
		System.out.println("------------------------");
		
		int i=1;
		while (i<=9) {
			System.out.println(4+" x "+i+" = "+4*i);
			i++;
		}
		
		System.out.println("------------------------");
		
		int arr[] = new int [] {5,7,8,4,2};
		for (int a : arr) {
			System.out.println(a+""); //숫자를 문자열로 바꾸는 방법 이래 
		}
	}
}
