import java.util.Scanner;
public class Checkinput {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int month;
	
	do {
		System.out.println("�ùٸ� ���� �Է��Ͻÿ�: ");
		month = input.nextInt();

	}while(month < 1 || month>12 );
	
	System.out.println("����ڰ� �Է��ѿ��� "+month+"�Դϴ�");
	}

}
