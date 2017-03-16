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

    public boolean isModoHora() {
        return modoHora;
    }

    public void setModoHora(boolean modoHora) {
        this.modoHora = modoHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public boolean isAlarmaActiva() {
        return alarmaActiva;
    }

    public void setAlarmaActiva(boolean alarmaActiva) {
        this.alarmaActiva = alarmaActiva;
    }
    
    }

