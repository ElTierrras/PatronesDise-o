package com.mycompany.proyectofinal;

public class ObservadorDemo {
    public static void ejecutar() {
        Sujeto sistemaInscripcion = new Sujeto();
        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("María");

        sistemaInscripcion.agregarObservador(estudiante1);
        sistemaInscripcion.agregarObservador(estudiante2);

        System.out.println("Actualizando estado del sistema...");
        sistemaInscripcion.setEstado("Inscripción abierta para el semestre 2024-1.");
    }
}
