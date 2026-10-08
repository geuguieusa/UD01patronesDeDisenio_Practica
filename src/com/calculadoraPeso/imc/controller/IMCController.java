package com.calculadoraPeso.imc.controller;

/**
 *
 * @author Guillermo Eugui Sánchez
 */


import com.calculadoraPeso.imc.model.CalculadoraIMC;
import com.calculadoraPeso.imc.view.IMCVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.calculadoraPeso.imc.model.CalculadoraIMC;

public class IMCController {
    private final CalculadoraIMC calculadora = new CalculadoraIMC();

    // Referencias a los componentes de la vista, para leerlos y modificarlos
    private final JTextField txtPeso;
    private final JTextField txtAltura;
    private final JButton btnCalcular;
    private final JLabel lblResultado;
    private final JLabel lblClasificacion;

    public IMCController(IMCVista vista) {
        // Se sacan los componentes de la vista a través de sus getters
        lblResultado = vista.getLblResultado();
        lblClasificacion = vista.getLblClasificacion();
        txtPeso = vista.getTxtPeso();
        txtAltura = vista.getTxtAltura();
        btnCalcular = vista.getBtnCalcular();

        
        // Aquí se conecta la vista con el controlador. addActionListener solo
        // registra quién debe reaccionar, no ejecuta nada todavía.
        // El código del interior se lanza cada vez que se pulsa el botón
        this.btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                calcularIMC();
            }
        });
    }

    // trim() quita espacios y replace cambia la coma por punto
    private void calcularIMC() {
        String textoPeso = txtPeso.getText().trim().replace(',', '.');
        String textoAltura = txtAltura.getText().trim().replace(',', '.');

        double peso;
        double altura;
        
        // Si el texto no es un número, parseDouble lanza NumberFormatException 
        // y se salta al catch
        try {
            peso = Double.parseDouble(textoPeso);
            altura = Double.parseDouble(textoAltura);
            
        } catch (NumberFormatException nfn) {
            lblClasificacion.setText("Error: Introduce solo números válidos");
            lblResultado.setText("");
            return;
        }
        
        // El controlador no calcula nada, delega en el modelo
        double imc = calculadora.calcular(peso, altura);
        String clasificacion = calculadora.clasificar(imc);
        
        // %.2f deja el número con dos decimales
        lblResultado.setText(String.format("Tu IMC es: %.2f", imc));
        lblClasificacion.setText("Clasificación: " + clasificacion);
    }
}
