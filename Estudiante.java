package com.mycompany.proyectofinal;


public class Estudiante implements Observador {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Estudiante " + nombre + ", notificación: " + mensaje);
    }
}
