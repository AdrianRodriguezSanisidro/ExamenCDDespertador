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
/**
 * 
 * @return horaAlarma
 */
    public int getHoraAlarma() {
        return horaAlarma;
    }
/**
 * 
 * @param horaAlarma 
 */
    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }
/**
 * 
 * @return minAlarma
 */
    public int getMinAlarma() {
        return minAlarma;
    }
/**
 * 
 * @param minAlarma 
 */
    public void setMinAlarma(int minAlarma) {
        this.minAlarma = minAlarma;
    }
/**
 * Get the heurs and set the alarm with these heurs
 * @param horas
 * @return horaAlarma
 */
    public int ponerHoraAlarma(int horas){
        return horaAlarma;
    }
/**
 * Get the minutes and ser the alarm with these minutes
 * @param minutos
 * @return minAlarma
 */
    public int ponerMinAlarma(int minutos){
        return minAlarma;
    }
}
