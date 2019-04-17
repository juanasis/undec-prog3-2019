package conversor;

public class ConversorDolarPeso extends ConversorMoneda{
    // Adaptador de objetos

    public ConversorDolarPeso () {
        super(15.25D);
    }

    public double dolaresApesos(double cantidad) {
        return dolaresAmoneda(cantidad);
    }

    public double pesosAdolares(double cantidad) {
        return monedaAdolares(cantidad);
    }
}