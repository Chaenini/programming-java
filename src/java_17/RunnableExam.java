package java_17;
class Top2 implements Runnable{
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+"\t");
		}
	}
}
public class RunnableExam {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Top2 t = new Top2();
		Thread thr = new Thread();
		thr.start();
		Thread thr2 = new Thread();	
		
		System.out.println("프로그램 종료");
	}
}
