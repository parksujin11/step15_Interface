package test.mypac;
/*
 * [Interface]
 * -�����ڰ� ���� (�ܵ� ��ü �����Ұ�)
 * -������ �ɹ� �޼ҵ�� ���� �� ���� (�߻� �޼ҵ常 ���� �� �ִ�)
 * -�ɹ��ʵ�� static final �ɹ��ʵ常 ���� �� �ִ�.
 * -data type �� �������� �ʿ��ϸ� ����(implements) Ŭ������ ���� ��ü�� �����ؾ� �Ѵ�.
 */
public interface Remocon {
	//�ɹ��ʵ�
	public static final int VERSION=1;
	public String COMPANY="LG";// static final ���� ���� 
	
	//�޼ҵ� �����ϱ� abstract �߻�����
	public abstract void up();
	public void down();//abstract ���� ���� 
	
}
