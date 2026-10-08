/**
 *
 * @author Guillermo Eugui Sánchez
 */

package com.calculadoraPeso.imc.main;

import com.calculadoraPeso.imc.controller.IMCController;
import com.calculadoraPeso.imc.view.IMCVista;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        // La vista es un JPanel, así que necesita un JFrame que la contenga
        JFrame ventana = new JFrame("Calculadora de IMC");
        IMCVista vista = new IMCVista();
        
        // El controlador se engancha a la vista en su constructor
        IMCController controlador = new IMCController(vista);
        ventana.setContentPane(vista);
        
         // pack() ajusta el tamaño de la ventana al contenido
        ventana.pack();
        
        // null en setLocationRelativeTo centra la ventana en pantalla
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    }
