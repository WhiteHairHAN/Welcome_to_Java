import java.util.Scanner;
public class Larger {
	public static void main(String[] args) {
		int x,y,max;
		
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하시오");
		x = input.nextInt();
		
		System.out.println("두번째 정수를 입력하시오");
		y = input.nextInt();
		
		if(x >y)
			max  = x;
		else if(x<y)
			max  = y;
		else
		{
			max = x;
			System.out.println("두 수는 같습니다.");
		}
		System.out.println("두 정수중 가장큰 수는  "+max+"입니다" );
	}

}
