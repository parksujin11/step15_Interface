  package test.mypac;
/*
 * �������̽��� ���� �Ҷ��� implements ���� ����Ѵ�.
 * �������� �������̽��� ���� �� �� �� �ִ�.(���� ���� ����)
 * �������̽��� ���ǵ� ��� �߻�޼ҵ�� �������̵� �ؾ� �Ѵ�. 
 * �������̽��� ��� �޼ҵ�� public ���� ������ ���� ������ 
 * public ���� �� ���� ������������ �ۼ��� �� ����.
 */
public class MyRemocon implements Remocon {
//MyRemocon�� ���콺->add 
	@Override//������ �Ǿ����� �����Ϸ��� üũ�ϵ��� ����.�����ǵȰ� ǥ��.
	public void up() {
		System.out.println("�µ��� �÷���");
	}

	@Override
	public void down() {
		System.out.println("�µ��� ������ ");
	}
	
}