package java_05;

public class classPractice {
	public static void main (String ars[]) {
		Star 박나래 = new Star ();
		박나래.실명 = "박나래";
		박나래.여자 = true;
		박나래.방송하기();
		박나래.인터뷰하기();
		
		Actor 박서준 = new Actor();
		박서준.실명 = "박서준";
		박서준.여자 = false;
		박서준.방송하기();
		박서준.인터뷰하기();
		박서준.대표작 = "청년경찰";
		박서준.울기();
		박서준.개인기하기();
		
		Star 연예인A씨 = 박서준;
		연예인A씨.방송하기();
		연예인A씨.인터뷰하기();
	}
}
