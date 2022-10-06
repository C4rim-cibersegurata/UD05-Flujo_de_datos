package bootcamp_java_UD05;
import java.util.Scanner;
import javax.swing.JOptionPane;  
public class CalculadoraInversa {
	public static void main(String[] args) {
		/*Crea una aplicación llamada Calculadoralnversa, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente. 
		 * Al final mostrara el resultado en un cuadro de dialogo. */
		Scanner sc = new Scanner(System.in);
		JOptionPane dialog = new JOptionPane();
		int num1;
		int num2;
		String operador;
		System.out.println("Primer operando: ");
		num1=sc.nextInt();
		System.out.println(" Segundo operando: ");
		num2=sc.nextInt();
		System.out.println(" Introduce uno de los siguientes operadores: ");
		System.out.print(" + Suma \n - Resta \n * Multiplicación \n / División \n ^ Potenciación \n % Módulo  ");
		operador=sc.next();
		switch (operador) {
		  case "+":
			JOptionPane.showMessageDialog(dialog,(num1+"+"+num2+" = "+(num1+num2)));
			break;
		  case "-":
			JOptionPane.showMessageDialog(dialog,(num1+"-"+num2+" = "+(num1-num2)));
			break;
		  case "*":
			JOptionPane.showMessageDialog(dialog,(num1+"x"+num2+" = "+(num1*num2)));
			break;
		  case "/":
			JOptionPane.showMessageDialog(dialog,(num1+"/"+num2+" = "+((double)num1/(double)num2)));
			break;
		  case "^":
			JOptionPane.showMessageDialog(dialog,(num1+"^"+num2+" = "+(Math.pow(num1,num2))));
			break;
		  case "%":
			JOptionPane.showMessageDialog(dialog,(num1+"%"+num2+" = "+(num1%num2)));
			break;
		  default:
			System.out.println("No has escogido ninguna operación");
		}
		sc.close();
	}
}
