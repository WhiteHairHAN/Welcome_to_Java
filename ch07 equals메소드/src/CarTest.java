/*
 * Object에서 제공되는 equals()는 == 연산자를 사용하여서 
 * 객체의 주소가 동일한지를 검사하여서 true 또는 false를 반환한다. 
 * 하지만 객체에 대해서는 이것이 올바르지 않는 경우가 많이 있다
 */

public class CarTest {

	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
	

	if (firstCar.equals(secondCar))
	{	System.out.println("동일한 종류의 자동차 입니다.");
	}
	else 
	{
		System.out.println("동일한 종류의 자동차가 아닙니다.");
	}
}
}
