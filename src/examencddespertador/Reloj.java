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
public class Reloj {
    private boolean modoHora=true;
    private int horas;
    private int minutos;
    private boolean alarmaActiva=false;
/**
 * @return modoHora
 */
    public boolean isModoHora() {
        return modoHora;
    }
/**
 * 
 * @param modoHora 
 */
    public void setModoHora(boolean modoHora) {
        this.modoHora = modoHora;
    }
/**
 * 
 * @return horas
 */
    public int getHoras() {
        return horas;
    }
/**
 * 
 * @param horas 
 */
    public void setHoras(int horas) {
        this.horas = horas;
    }
/**
 * 
 * @return minutos
 */
    public int getMinutos() {
        return minutos;
    }
/**
 * 
 * @param minutos 
 */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
/**
 * 
 * @return alarmaActiva
 */
    public boolean isAlarmaActiva() {
        return alarmaActiva;
    }
/**
 * 
 * @param alarmaActiva 
 */
    public void setAlarmaActiva(boolean alarmaActiva) {
        this.alarmaActiva = alarmaActiva;
    }
/**
 * Change the alrm mode
 * @return modoHora
 */
    public boolean cambiarModo(){
        return modoHora;
    }
/**
 * The heurs grow up 1 heur
 * @return horas
 */
    public int aumentarHoras(){
        return horas;
    }
    /**
     * The minutes grow up 1 minute
     * @return minutos
     */
    public int aumentarMinutos(){
        return minutos;
    }
    /**
     * Active or desactive the alarm
     * @return alarmaActiva
     */
    public boolean activarAlarma(){
        return alarmaActiva;
    }

}