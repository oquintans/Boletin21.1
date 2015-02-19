/*
 Hacer un programa que gestione una cola para mandar un trabajo a la fotocopiadora.
 */
package ejercicio1;

/**
 *
 * @author oquintansocampo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impresora obj = new Impresora();
        obj.imprimir();
        obj.visualizar();
    }

}
