package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class ManiClass01 {
	public static void main(String[] args) {
		//Remocon �������̽� Ÿ���� ���� �������� �����
		Remocon r1=null;
		//Remocon type �� �������� �ʿ��ϴٸ�?
		r1=new MyRemocon();
		useRemocon(r1);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
