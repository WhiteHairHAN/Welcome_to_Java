import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("a�� �Է��ϼ���");
		//�Է� �ȳ� ���
		x = input.nextInt();
		//����ڷκ��� ù��° ���ڸ� �д´�.
		
		System.out.print("b�� �Է��ϼ���");
		//�Է� �ȳ� ���
		y = input.nextInt();
		//����ڷκ��� ù��° ���ڸ� �д´�.
		
		System.out.println("�հ�� "+ (x+y)+" �Դϴ�");
	}

}
