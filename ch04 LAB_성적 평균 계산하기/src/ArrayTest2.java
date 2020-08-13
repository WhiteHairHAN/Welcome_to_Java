import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
		int [] student = new int[10];
		int i;
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		double average = 0;
		
		for(i=0; i<5;i++)
		{
			System.out.println("성적을 입력하시오: ");
			student[i] = input.nextInt();
			sum += student[0];
		}
		
		average = sum / (i+1);
		System.out.println("평균 성적은 " + average +"입니다");
	}

}
