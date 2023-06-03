package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
// Jesus Ortega
// 29891702
public class CreandoMarcoCentrado {

	public static void main(String[] args) {

		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamanioPantalla.height;
		int anchoPantalla = tamanioPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
	}
}