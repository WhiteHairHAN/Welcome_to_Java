import java.util.Scanner;
public class inputtt {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.println("입력하세요");

		String line= input.nextLine();
		System.out.println(line);
	}

}
