import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		
		System.out.println("Hello World");
		System.out.println(str);
	}

}
