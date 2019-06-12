package java_05;

import java_05.Singer;
import java_05.Star;
import java_05.Actor;

 class index {
		public static void main(String[] args) {
					Star 박나래 = new Star();
					박나래.실명 = "박나래";
					박나래.여자 = true;
					박나래.방송하기();
					박나래.인터뷰하기();
					
					Actor 이종석 = new Actor();
					이종석.실명="종석";
					이종석.방송하기();
					이종석.인터뷰하기();
					이종석.대표작 ="VIP";
					이종석.울기();
					이종석.개인기하기();
					
					
					Star 연예인A씨 = 이종석;
					연예인A씨.방송하기();
					연예인A씨.인터뷰하기();
					연예인A씨.개인기하기();
					((Actor)연예인A씨).개인기하기();
					
					Singer 김영철 = new Singer();
					김영철.실명 = "김영철";
					김영철.여자 = false;
					김영철.대표곡="널 사랑하지 않아";
					김영철.공연하기();
					김영철.개인기하기();
					
					놀기();
		}
		
		private static void 놀기() {
			
		}
	}