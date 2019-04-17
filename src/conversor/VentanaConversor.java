package conversor;

import java.awt.*;
import javax.swing.*;

public class VentanaConversor extends JFrame implements InterfazVista {
    private JButton convertirApesos;
    private JButton convertirAdolares;
    private JTextField cantidad;
    private JLabel resultado;
    private JPanel panelPrincipal;
    private JPanel panelaux;
    private JPanel panelaux2;
    private JPanel botonera;

    public VentanaConversor () {
//        this.setTitle("Conversor de Dolares y Pesos");
        super("Conversor de Dolares y Pesos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10,10));
        cantidad = new JTextField(8);
//        cantidad.setSize(20, 20);
        cantidad.setHorizontalAlignment(JTextField.RIGHT);
        cantidad.setActionCommand("tecla");
        panelaux = new JPanel();
        panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        resultado = new JLabel("Indique una cantidad y pulse uno de los botones");
        panelaux2 = new JPanel();
        panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        convertirApesos = new JButton("A pesos");
        convertirApesos.setActionCommand(APESOS);
        convertirAdolares = new JButton("A dolares");
        convertirAdolares.setActionCommand(ADOLARES);
        botonera = new JPanel();
        botonera.add(convertirApesos);
        botonera.add(convertirAdolares);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
    }

    public void escribeCambio(String s) {
        resultado.setText(s);
    }

    public double getCantidad() {
        try {
            return Double.parseDouble(cantidad.getText());
        }
        catch (NumberFormatException e) {
            cantidad.setText("");
            return 0.0D;
        }
    }
    public void setControlador(ControlConversor c) {
        convertirApesos.addActionListener(c);
        convertirAdolares.addActionListener(c);
    }

    public void arranca() {
        pack();// coloca los componentes
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);// visualiza la ventana
    }
}