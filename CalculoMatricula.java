    package com.mycompany.proyectofinal;

    public abstract class CalculoMatricula {
        public final void calcular() {
            seleccionarMaterias();
            calcularCosto();
            agregarAdicionales();
            mostrarTotal();
        }

        protected abstract void seleccionarMaterias();
        protected abstract void calcularCosto();

        protected void agregarAdicionales() {
            System.out.println("Agregando costo del seguro estudiantil.");
        }

        protected void mostrarTotal() {
            System.out.println("Mostrando el total a pagar.");
        }
    }
