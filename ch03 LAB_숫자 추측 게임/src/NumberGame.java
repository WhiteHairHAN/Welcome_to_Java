import java.util.*;
public class NumberGame {
	public static void main(String[] args) {
		
		Random rn = new Random();
		int answer = rn.nextInt(100);		
		int number;
		int count=0;
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("���ڸ� �Է��ϼ���: ");
			number = input.nextInt();
			count++;
			if(number == answer) {
				System.out.println("��ġ�մϴ�");
				break;
			}
				
			else if(number <=answer)
			{
				System.out.println("������ ������ �����ϴ�.");
			}
			
			else if(number >=answer)
			{
				System.out.println("������ ������ �����ϴ�.");
			}
		}while(number != answer);
		System.out.println("�õ�Ƚ��: "+count);
	}

}
