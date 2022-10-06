package bootcamp_java_UD05;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		// Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día de la semana: ");
		String dia=sc.next();
		switch (dia.toUpperCase()) {
		  case ("LUNES"):
			  System.out.println(dia+" es día laboral");
			break;
		  case ("MARTES"):
			  System.out.println(dia+" es día laboral");
			break;
		  case ("MIÉRCOLES"):
			  System.out.println(dia+" es día laboral");
			break;
		  case ("JUEVES"):
			  System.out.println(dia+" es día laboral");
			break;
		  case ("VIERNES"):
			  System.out.println(dia+" es día laboral");
			break;
		  case ("SABADO"):
			  System.out.println(dia+" no es día laboral");
			break;
		  case ("DOMINGO"):
			  System.out.println(dia+" no es día laboral");
			break;
		  default:
			System.out.println("No has introduciod un valor válido");
		}
		sc.close();
	}

}
