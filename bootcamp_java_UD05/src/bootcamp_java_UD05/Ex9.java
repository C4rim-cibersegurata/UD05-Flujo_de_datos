package bootcamp_java_UD05;

public class Ex9 {

	public static void main(String[] args) {
		// Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
		for (int i = 1; i <= 100; i++) {
			if (i%2==0 || i%3==0) {
				  System.out.print(i+" ");			
			}
		}
	}

}
