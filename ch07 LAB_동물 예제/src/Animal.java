
public class Animal {
	//private 접근자는 자신의 클래스에만 접근이 가능하다.
	//정보은닉 이라고 불리며 객체변수를 숨기는 기능을 한다. 
	private double weight;
	String picture;
	
	void eat()
	{
		System.out.println("esa()가 호출되었음");
	}
	void sleep()
	{
		System.out.println("sleep()가 호출되었음");
	}
}
