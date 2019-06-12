package java_17;

class Top3 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+i+"\t");
		}
	}
}

public class Runnable3Exam {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top3 t = new Top3();
		Thread thr1 = new Thread(t,"a");
		Thread thr2 = new Thread(t,"b");
		thr1.start();
		thr2.start();
		System.out.println(thr1.MAX_PRIORITY);
		System.out.println(thr2.MIN_PRIORITY);
		
		System.out.println("프로그램 종료");
	}
}
