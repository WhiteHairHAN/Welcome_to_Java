/* ������ �� ����ϱ�
 * �̹� �ǽ������� for ������ �̿��Ͽ� 0���� 99������ ������ ����
 * ����ϴ� ���α׷��� �ۼ��غ���
 * ������ ������ ����ڰ� �Է��Ѵ�.
 */

import java.util.Random;
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
	
		Random generator = new Random();
		
		System.out.println("������ ����: ");
		Scanner inputnumber = new Scanner(System.in);
		int number = inputnumber.nextInt();		
		int sum =0;
		
		for(int i =0; i<=number ;i++)
		{
			int acce = generator.nextInt(100);
			sum += acce;
		}
		System.out.println("����" +number+"�� ����"+sum);
	}

}
