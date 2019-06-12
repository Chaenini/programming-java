package java_17;

class Top extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+"\t");
		}
	}
}
public class ThreadExam {
	public static void main(String[] args) {
			System.out.println("프로그램 시작");
			Top t = new Top();
			Top t2 = new Top();
			t.start();
			t2.start();
			System.out.println("프로그램 종료");
	}
}
