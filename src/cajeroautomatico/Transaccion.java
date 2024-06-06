
package cajeroautomatico;

/**
 * La clase Transaccion.
 * Representa una transacción bancaria.
 * Contiene información sobre el tipo de transacción y el monto.
 */
public class Transaccion {
    private String tipo;
    private double monto;

    /**
     * Constructor que inicializa una transacción con el tipo y el monto.
     * 
     * @param tipo El tipo de transacción (por ejemplo, "Depósito", "Retiro", "Transferencia").
     * @param monto El monto de la transacción.
     */
    public Transaccion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    /**
     * Obtiene el tipo de la transacción.
     * 
     * @return El tipo de la transacción.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene el monto de la transacción.
     * 
     * @return El monto de la transacción.
     */
    public double getMonto() {
        return monto;
    }
}


