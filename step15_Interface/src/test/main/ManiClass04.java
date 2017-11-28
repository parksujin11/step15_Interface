package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class ManiClass04 {
	public static void main(String[] args) {
		//�͸��� local inner class �� �̿��ؼ� ��ü�� �����ϰ� 
		//�������� Remocon type ������ ��� 
		Remocon r1=new Remocon() {

			@Override
			public void up() {
				System.out.println("�Ӹ��� �÷���");
				
			}

			@Override
			public void down() {
				System.out.println("�Ӹ��� ������");
				
			}
			
		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {

			@Override
			public void up() {
				System.out.println("�Ӹ��� �÷���");
				
			}

			@Override
			public void down() {
				System.out.println("�Ӹ��� ������");
				
			}
			
		});
		
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
