package java_14;

public class ���� {
		//�̸�
		String name;
		//�ּ�
		String address;
		//����
		double math;
		//����
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
			return "[ ���� ]\n�̸� : "+name+"\t�ּ� : "+address+"\t���� : "+math+"\t���� : "+english+"\t���� :"+getTotal()+"\t��� : "+getAverage();
		}
		
	}
