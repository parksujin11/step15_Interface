package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class ManiClass05 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("���𰡸� �÷���");
				
			}
			
			@Override
			public void down() {
				System.out.println("���𰡸� ������ ");
				
			}
		};
		useRemocon(r1);
	}	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
