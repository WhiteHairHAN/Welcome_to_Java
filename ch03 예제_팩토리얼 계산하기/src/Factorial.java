import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		long fact =1;
		long sum = 1;;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		fact = input.nextLong();
		for(int i=1; i<=fact;i++) 
		{
			sum *= i;
		}
		System.out.println(sum+"입니다");
	}

}
