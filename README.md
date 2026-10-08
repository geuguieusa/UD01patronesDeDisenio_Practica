#  Calculadora de IMC (Java Swing)

Aplicación de escritorio desarrollada en **Java** con interfaz **Swing** que calcula el Índice de Masa Corporal (IMC) y clasifica el resultado según los estándares de salud. Diseñada bajo el patrón de arquitectura **MVC (Modelo-Vista-Controlador)**.

| Datos del Desarrollador | Asignatura |
| :--- | :--- |
| **Autor:** Guillermo Eugui Sánchez | **Módulo:** Desarrollo de interfaces | 


---

##  Tecnologías utilizadas

- **Lenguaje:** Java
- **GUI:** Java Swing
- **Patrón de diseño:** MVC (Modelo-Vista-Controlador)

---

##  Estructura del proyecto

```text
src/com/calculadoraPeso/imc/
│
├── model/
│   └── CalculadoraIMC.java      # Lógica matemática del IMC y clasificación
├── view/
│   ├── IMCVista.java            # Formulario e interfaz gráfica en Swing
│   └── IMCVista.form            # Archivo de diseño visual de NetBeans
├── controller/
│   └── IMCController.java       # Manejo de eventos y comunicación Vista-Modelo
└── main/
    └── Main.java                # Punto de entrada de la aplicación
