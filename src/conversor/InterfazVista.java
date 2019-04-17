package conversor;

public interface InterfazVista {
// Constantes que definen las posibles operaciones:
    static final String ADOLARES = "Pesos a Dolares";
    static final String APESOS = "Dolares a peso";

    void setControlador(ControlConversor c);
    void arranca(); // comienza la visualización
    double getCantidad(); // cantidad a convertir
    void escribeCambio(String s); //texto con la conversión
}