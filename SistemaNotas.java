package com.mycompany.proyectofinal;

import java.util.HashMap;
import java.util.Map;

public class SistemaNotas {
    private static SistemaNotas instancia;
    private Map<String, Double> notas = new HashMap<>();

    private SistemaNotas() {}

    public static SistemaNotas getInstancia() {
        if (instancia == null) {
            instancia = new SistemaNotas();
        }
        return instancia;
    }

    public void registrarNota(String estudiante, double nota, String corte, double porcentaje) {
        double notaFinal = nota * (porcentaje / 100);
        notas.put(estudiante + " - " + corte, notaFinal);
        System.out.println("Registrando nota para " + estudiante + ": " + nota + " (" + porcentaje + "% del total) = " + notaFinal);
    }

    public void mostrarNotas() {
        System.out.println("\nNotas registradas:");
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
