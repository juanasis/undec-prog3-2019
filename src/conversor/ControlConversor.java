package conversor;

import java.awt.event.*;


public class ControlConversor implements ActionListener {
    private InterfazVista vista;
    private ConversorDolarPeso modelo;

    public ControlConversor(InterfazVista vista, ConversorDolarPeso modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    public void actionPerformed(ActionEvent evento) {
        double cantidad;
        cantidad = vista.getCantidad();
        if (evento.getActionCommand().equals(InterfazVista.ADOLARES))
            vista.escribeCambio(cantidad + " pesos son: " + modelo.pesosAdolares(cantidad) + " dolares.");
        else 
            vista.escribeCambio(cantidad + " dolares son: " + modelo.dolaresApesos(cantidad) + "pesos.");
    }
}
