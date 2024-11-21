package com.mycompany.proyectofinal;

public class MatriculaPorCredito extends CalculoMatricula {
    private int creditos;
    private double costoPorCredito;
    private int creditosAdicionales;
    private double total; // Almacena el total calculado

    public MatriculaPorCredito(int creditos, double costoPorCredito, int creditosAdicionales) {
        this.creditos = creditos;
        this.costoPorCredito = costoPorCredito;
        this.creditosAdicionales = creditosAdicionales;
    }

    @Override
    protected void seleccionarMaterias() {
        System.out.println("Seleccionando materias...");
        System.out.println("Créditos iniciales: " + creditos);
        System.out.println("Créditos adicionales a agregar: " + creditosAdicionales);
    }

    @Override
    protected void calcularCosto() {
        int totalCreditos = creditos + creditosAdicionales;
        total = totalCreditos * costoPorCredito;
        System.out.println("Total de créditos: " + totalCreditos);
        System.out.println("Costo calculado (sin adicionales): " + total);
    }

    @Override
    protected void agregarAdicionales() {
        System.out.println("Agregando costo del seguro estudiantil.");
        total += 50.0; // Ejemplo: se suma un costo fijo por el seguro estudiantil
    }

    @Override
    protected void mostrarTotal() {
        System.out.println("El total a pagar es: " + total);
    }
}
