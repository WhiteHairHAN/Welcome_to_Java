import java.util.Scanner;

public class CircleArea {
	
	public static void main(String[] args) {
		float radius;
		double result;
		
		@SuppressWarnings("resource")
		//�� �����Ͽ��� �߰��϶���� �𸣰ڴ�
		//�ڵ�����δ� ��������̴µ�...
		Scanner input = new Scanner(System.in);
		
		System.out.println("�������� �Է��Ͻÿ�");
		radius = input.nextFloat();
		
		result = 3.141592*radius*radius;
		System.out.println("���� ������: "+ result);
	}

}
