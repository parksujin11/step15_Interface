  package test.mypac;
/*
 * 인터페이스를 구현 할때는 implements 예약어를 사용한다.
 * 여러개의 인터페이스를 구현 할 수 도 있다.(다중 구현 가능)
 * 인터페이스에 정의된 모든 추상메소드로 오버라이딩 해야 한다. 
 * 인터페이스의 모든 메소드는 public 접근 제한을 갖기 때문에 
 * public 보다 더 낮은 접근제한으로 작성할 수 없다.
 */
public class MyRemocon implements Remocon {
//MyRemocon에 마우스->add 
	@Override//재정의 되었는지 컴파일러가 체크하도록 해줌.재정의된것 표시.
	public void up() {
		System.out.println("온도를 올려요");
	}

	@Override
	public void down() {
		System.out.println("온도를 내려요 ");
	}
	
}