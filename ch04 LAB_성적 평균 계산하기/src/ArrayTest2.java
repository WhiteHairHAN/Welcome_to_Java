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
			System.out.println("������ �Է��Ͻÿ�: ");
			student[i] = input.nextInt();
			sum += student[0];
		}
		
		average = sum / (i+1);
		System.out.println("��� ������ " + average +"�Դϴ�");
	}

}
