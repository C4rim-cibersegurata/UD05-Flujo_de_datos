package bootcamp_java_UD05;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		// Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		int num1=sc.nextInt();
		if (num1%2==0) {
			System.out.print(num1+" es divisible entre 2");
		} else {
			System.out.print(num1+" no es divisible entre 2");
		}
		sc.close();
	}

}
