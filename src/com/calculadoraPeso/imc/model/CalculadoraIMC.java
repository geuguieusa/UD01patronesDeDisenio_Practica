package com.calculadoraPeso.imc.model;

/**
 *
 * @author Guillermo Eugui Sánchez
 */
public class CalculadoraIMC {
    
     // Aplica la fórmula del IMC
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    // Traduce el número del IMC a la categoría de la OMS.
    public String clasificar(double imc) {
        if (imc < 18.5) {
            return "Bajo Peso";
        } else if (imc < 25.0) {
            return "Peso Normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}