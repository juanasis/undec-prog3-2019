package conversor;

public class ConversorMoneda {
    private double cambio;

    public ConversorMoneda ( double valorCambio ) {
        // valor en la moneda de 1 dolar
        cambio = valorCambio;
    }

    public double dolaresAmoneda (double cantidad) {
        return cantidad * cambio;
    }

    public double monedaAdolares (double cantidad) {
        return cantidad / cambio;
    }
}
