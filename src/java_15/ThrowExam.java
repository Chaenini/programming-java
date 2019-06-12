package java_15;

public class ThrowExam {
	public static void main(String[] args) {
		ThrowExam ts = new ThrowExam();
		try {
			arrayMethod();			
		}
		catch(ArrayIndexOutOfBoundsException e	){
			System.out.println("¹è¿­ ÀÍ¼Á¼Ç");
		}
	}
	
	private static void arrayMethod() throws ArrayIndexOutOfBoundsException {
		String[] irum = new String[3];
		irum[3] = "È«±æµ¿";
	}
}