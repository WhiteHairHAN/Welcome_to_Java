import java.util.*;

public class Averager {

	public static void main(String[] args) {
		
		int total = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("������ �Է��ϼ���");
			int grade = scan.nextInt();
			if(grade <0)
				break;
	
		total +=grade;
		count++;
		}
		System.out.println("����� "+total/count);
	}
}