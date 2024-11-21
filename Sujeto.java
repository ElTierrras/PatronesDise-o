package com.mycompany.proyectofinal;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(estado);
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }
}
