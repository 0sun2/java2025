package sec03.exam2;
import java.utill.Scanner;
public class IntTest {
	
	public static void main(String[] args) {
		byte val1 = 1;
		byte val2 = 2;
		
		//byte val3 = val1 +val2;
		
		//System.out.println("1/2 : " + 1/2);
		//System.out.println("1.0/2.0 : " + 1.0/2.0);
		
		String str = "10";
		int value = 20;
		String str1 = str + value;
		//int result = val1 + Integer.parseInt(str);
		
		java.util.Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		System.out.println(input);
	}

}
