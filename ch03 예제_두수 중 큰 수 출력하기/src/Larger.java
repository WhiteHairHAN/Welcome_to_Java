import java.util.Scanner;
public class Larger {
	public static void main(String[] args) {
		int x,y,max;
		
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��Ͻÿ�");
		x = input.nextInt();
		
		System.out.println("�ι�° ������ �Է��Ͻÿ�");
		y = input.nextInt();
		
		if(x >y)
			max  = x;
		else if(x<y)
			max  = y;
		else
		{
			max = x;
			System.out.println("�� ���� �����ϴ�.");
		}
		System.out.println("�� ������ ����ū ����  "+max+"�Դϴ�" );
	}

}
