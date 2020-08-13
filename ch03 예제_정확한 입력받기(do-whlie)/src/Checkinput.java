import java.util.Scanner;
public class Checkinput {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int month;
	
	do {
		System.out.println("올바른 월을 입력하시오: ");
		month = input.nextInt();

	}while(month < 1 || month>12 );
	
	System.out.println("사용자가 입력한월은 "+month+"입니다");
	}

}
