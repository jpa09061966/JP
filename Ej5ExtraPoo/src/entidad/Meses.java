
package entidad;

/**
 *
 * @author Jorge
 */
public class Meses {
    private String[] meses;
    private String mesSecreto;

    public Meses() {
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre"};
        mesSecreto = meses[9];
    }

    public boolean adivinarMes(String mesIngresado) {
        return mesIngresado.equals(mesSecreto);
    }
}

