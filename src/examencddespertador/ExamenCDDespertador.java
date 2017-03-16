/*
 *Programa de un despertador
 */
package examencddespertador;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class ExamenCDDespertador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj objR=new Reloj();
        int eleccion=5;
        do{
        switch(eleccion=Integer.parseInt(JOptionPane.showInputDialog("1=Cambiar modo;2=Aumentar las horas;3=Aumentar los minutos;4=Activar/Desactivar la alarma;0=Salir"))){
            case 1:objR.cambiarModo();
            break;
            case 2:objR.aumentarHoras();
            break;
            case 3:objR.aumentarMinutos();
            break;
            case 4:objR.activarAlarma();
            break;
            case 0:System.exit(eleccion);
        }
    }while(eleccion>4&&eleccion<0);
    
}
}