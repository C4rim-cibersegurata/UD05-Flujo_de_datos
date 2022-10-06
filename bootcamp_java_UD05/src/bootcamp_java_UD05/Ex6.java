package bootcamp_java_UD05;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. 
		 * El IVA sera una constante que sera del 21% */
		Scanner sc = new Scanner(System.in);
		Double num1;
		final double IVA=0.21;
		System.out.println("Introduce el precio del producto sin IVA: ");
		num1=sc.nextDouble();
		System.out.println("Precio final: "+(num1+(num1*IVA)));
		sc.close();
	}

}
