import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("a를 입력하세요");
		//입력 안내 출력
		x = input.nextInt();
		//사용자로부터 첫번째 숫자를 읽는다.
		
		System.out.print("b를 입력하세요");
		//입력 안내 출력
		y = input.nextInt();
		//사용자로부터 첫번째 숫자를 읽는다.
		
		System.out.println("합계는 "+ (x+y)+" 입니다");
	}

}
