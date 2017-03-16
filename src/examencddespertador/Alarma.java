/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencddespertador;

/**
 *
 * @author Adry
 */
public class Alarma {
    private int horaAlarma;
    private int minAlarma;

    public int getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public int getMinAlarma() {
        return minAlarma;
    }

    public void setMinAlarma(int minAlarma) {
        this.minAlarma = minAlarma;
    }
    public int ponerHoraAlarma(int horas){
        return horaAlarma;
    }
    public int ponerMinAlarma(int minutos){
        return minAlarma;
    }
}
