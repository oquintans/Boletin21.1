package ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Impresora {

    ArrayList cola = new ArrayList();

    public Impresora() {
    }

    public void imprimir() {
        int aux = 0;
        do {

            String t = JOptionPane.showInputDialog("Introducir Texto.");
            int c = Integer.parseInt(JOptionPane.showInputDialog("Introducir Nº de copias."));
            cola.add(new Informacion(t, c));
            aux = JOptionPane.showConfirmDialog(null, "Introducir mas?");

        } while (aux != 1);
    }

    public void visualizar() {
        while(cola.isEmpty()==false){
            JOptionPane.showMessageDialog(null, cola.get(0));
            cola.remove(0);
        }
    }
}
