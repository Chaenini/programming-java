package java_05;

import java_05.Singer;
import java_05.Star;
import java_05.Actor;

 class index {
		public static void main(String[] args) {
					Star �ڳ��� = new Star();
					�ڳ���.�Ǹ� = "�ڳ���";
					�ڳ���.���� = true;
					�ڳ���.����ϱ�();
					�ڳ���.���ͺ��ϱ�();
					
					Actor ������ = new Actor();
					������.�Ǹ�="����";
					������.����ϱ�();
					������.���ͺ��ϱ�();
					������.��ǥ�� ="VIP";
					������.���();
					������.���α��ϱ�();
					
					
					Star ������A�� = ������;
					������A��.����ϱ�();
					������A��.���ͺ��ϱ�();
					������A��.���α��ϱ�();
					((Actor)������A��).���α��ϱ�();
					
					Singer �迵ö = new Singer();
					�迵ö.�Ǹ� = "�迵ö";
					�迵ö.���� = false;
					�迵ö.��ǥ��="�� ������� �ʾ�";
					�迵ö.�����ϱ�();
					�迵ö.���α��ϱ�();
					
					���();
		}
		
		private static void ���() {
			
		}
	}