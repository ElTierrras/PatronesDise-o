package com.mycompany.proyectofinal;

public class SingletonDemo {
    public static void ejecutar() {
        SistemaNotas sistema = SistemaNotas.getInstancia();
        sistema.registrarNota("Juan Pérez", 4.5, "Primer Corte", 30);
        sistema.registrarNota("María López", 3.8, "Segundo Corte", 40);
        sistema.mostrarNotas();
    }
}
