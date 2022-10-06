package bootcamp_java_UD05;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		/* Haz una aplicación que calcule el área de un circulo (pixR2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
		 * Usa la constante PI y el método pow de Math. */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del círculo: ");
		String r=sc.nextLine();
		System.out.println("Área: "+(Math.PI*Double.parseDouble(r)));
		sc.close();
	}

}
