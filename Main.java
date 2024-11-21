package com.mycompany.proyectofinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Gestión Académica ---");
            System.out.println("1. Gestión de Inscripción de Materias (Patrón: Observador)");
            System.out.println("2. Cálculo de Matrícula por Créditos Inscritos (Patrón: Plantilla Método)");
            System.out.println("3. Registro de Notas por Cortes Académicos (Patrón: Singleton)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ObservadorDemo.ejecutar();
                    break;
                case 2:
                    PlantillaMetodoDemo.ejecutar();
                    break;
                case 3:
                    SingletonDemo.ejecutar();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
