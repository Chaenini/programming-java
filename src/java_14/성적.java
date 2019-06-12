package java_14;

public class 성적 {
		//이름
		String name;
		//주소
		String address;
		//수학
		double math;
		//영어
		double english;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public double getMath() {
			return math;
		}
		public void setMath(double math) {
			this.math = math;
		}
		public double getEnglish() {
			return english;
		}
		public void setEnglish(double english) {
			this.english = english;
		}
		//getTotal()
		public double getTotal() {
			return math+english;
		}
		//getAddress()
		public double getAverage() {
			return getTotal()/2;
		}
		public String toString() {
			return "[ 성적 ]\n이름 : "+name+"\t주소 : "+address+"\t수학 : "+math+"\t영어 : "+english+"\t총점 :"+getTotal()+"\t평균 : "+getAverage();
		}
		
	}
