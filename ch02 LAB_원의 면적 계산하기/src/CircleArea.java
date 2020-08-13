import java.util.Scanner;

public class CircleArea {
	
	public static void main(String[] args) {
		float radius;
		double result;
		
		@SuppressWarnings("resource")
		//왜 컴파일에서 추가하라는지 모르겠다
		//코드상으로는 문제없어보이는데...
		Scanner input = new Scanner(System.in);
		
		System.out.println("반지름을 입력하시오");
		radius = input.nextFloat();
		
		result = 3.141592*radius*radius;
		System.out.println("원의 면적은: "+ result);
	}

}
