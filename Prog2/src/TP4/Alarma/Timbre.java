package TP4.Alarma;

public class Timbre {
    private boolean prendida;

    public Timbre() {
        this.prendida = false;
    }

    public boolean sonando() {
        return prendida;
    }

    public void hacerSonar() {
        this.prendida = true;
        System.out.println("Timbre sonando.");
    }

    public void apagar() {
        this.prendida = false;
        System.out.println("Timbre apagado.");
    }
}