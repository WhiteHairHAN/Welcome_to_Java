import java.util.Scanner;
public class LoopExample2 {

	public static void main(String[] args) {
		System.out.println("������ �߿��� ����ϼ� ���� ���� �Է��Ͻÿ�:");
		Scanner inputter = new Scanner(System.in);
		int number;
		number = inputter.nextInt();
		
		//while ������
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
