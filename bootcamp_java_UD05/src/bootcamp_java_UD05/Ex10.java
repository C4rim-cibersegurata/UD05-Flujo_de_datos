package bootcamp_java_UD05;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		/*Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
		 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.  */
		Scanner sc = new Scanner(System.in);
		int suma=0;
		System.out.print("Introduce el número de ventas: ");
		int numVentas=sc.nextInt();
		for (int i = 0; i < numVentas; i++) {
			System.out.println((i+1)+"º venta (€): ");
			int venta=sc.nextInt();
			suma=suma+venta;
		}
		System.out.println("Has hecho: "+suma+"€ en ventas");
		sc.close();
	}

}
