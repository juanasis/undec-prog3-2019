package conversor;

public class Main {

    public static void main(String[] args) {
        // el modelo:
        ConversorDolarPeso modelo = new ConversorDolarPeso();
        // la vista:
        VentanaConversor vista = new VentanaConversor();
        // y el control:
        ControlConversor control = new ControlConversor (vista,modelo);
        // configura la vista
        vista.setControlador(control);
        // y arranca la interfaz (vista):
        vista.arranca();
    }
}
