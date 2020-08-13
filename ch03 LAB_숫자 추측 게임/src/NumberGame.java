import java.util.*;
public class NumberGame {
	public static void main(String[] args) {
		
		Random rn = new Random();
		int answer = rn.nextInt(100);		
		int number;
		int count=0;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("숫자를 입력하세요: ");
			number = input.nextInt();
			count++;
			if(number == answer) {
				System.out.println("일치합니다");
				break;
			}
				
			else if(number <=answer)
			{
				System.out.println("제시한 정수가 낮습니다.");
			}
			
			else if(number >=answer)
			{
				System.out.println("제시한 정수가 높습니다.");
			}
		}while(number != answer);
		System.out.println("시도횟수: "+count);
	}

}
