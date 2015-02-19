package ejercicio1;

/**
 *
 * @author oquintansocampo
 */
public class Informacion {

    private String texto;
    private int copias;

    public Informacion() {
    }

    public Informacion(String texto, int copias) {
        this.texto = texto;
        this.copias = copias;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Informacion{" + "texto=" + texto + ", copias=" + copias + '}';
    }

}
