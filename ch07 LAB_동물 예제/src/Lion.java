
public class Lion extends Animal{
//private 접근자는 자신의 클래스에만 접근이 가능하다.
//정보은닉 이라고 불리며 객체변수를 숨기는 기능을 한다. 
	private int legs = 4;
	void rar() {
		System.out.println("roar()가 호출되었음");
	}
}
