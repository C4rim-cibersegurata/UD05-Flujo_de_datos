package bootcamp_java_UD05;

public class Ex1 {

	public static void main(String[] args) {
		/*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. 
		 * Si son iguales indicarlo también. 
		 * Ves cambiando los valores para comprobar que funciona. */
		int num1=13;
		int num2=42;
		if (num1<num2) {
			System.out.println(num2+" es mayor que "+num1);
		} else if (num1>num2) {
			System.out.println(num2+ " es menor que "+num1);
		} else {
			System.out.println(num1+" y "+num2+" son iguales");
		}
	}

}
