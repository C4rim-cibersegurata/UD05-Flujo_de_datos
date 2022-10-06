package bootcamp_java_UD05;
import javax.swing.JOptionPane;  
public class Ex3 {

	public static void main(String[] args) {
		//Modifica la aplicación anterior (Ex2), para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
		JOptionPane dialog = new JOptionPane();
		String nom=JOptionPane.showInputDialog("¿cómo te llamas?");
		JOptionPane.showMessageDialog(dialog,"Bienvenido "+nom);
	}

}
