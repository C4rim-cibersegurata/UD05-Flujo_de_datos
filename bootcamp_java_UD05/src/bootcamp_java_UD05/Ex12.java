package bootcamp_java_UD05;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		/* Escribe una aplicación con un String que contenga una contraseña cualquiera. 
		 * Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo "Enhorabuena". 
		 * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos). */
		Scanner sc = new Scanner(System.in);
		String passwd = "pwnd";
		String prueba= "";
		int intents = 0;
		System.out.println("Tienes 3 intentos para acertar la contraseña");
		while (intents < 3) {
			System.out.println((3-intents)+" intentos restantes, introduce la contraseña: ");
			prueba = sc.next();
			if (passwd.equals(prueba)) {
				  System.out.println("Enhorabuena");
				  intents=3;
				}
			else {System.out.println("Contraseña incorrecta");};
			intents++;
		}
		sc.close();
	}

}
