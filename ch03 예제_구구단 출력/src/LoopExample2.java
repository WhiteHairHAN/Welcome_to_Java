import java.util.Scanner;
public class LoopExample2 {

	public static void main(String[] args) {
		System.out.println("구구단 중에서 출력하소 싶은 단을 입력하시오:");
		Scanner inputter = new Scanner(System.in);
		int number;
		number = inputter.nextInt();
		
		//while 문으로
		int i =1;
		while(i<=9)
		{
			System.out.println(number+"*"+i+" = " + number*i);
			i++;
		}
		/*
		for(int i=1;i<=9;i++)
		{
			System.out.println(number+"*"+i+" = " + number*i);
		}
		*/

	}

}
