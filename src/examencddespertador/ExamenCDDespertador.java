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
        int eleccion=5;
        do{
        switch(eleccion=Integer.parseInt(JOptionPane.showInputDialog("1=Cambiar modo;2=Aumentar las horas;3=Aumentar los minutos;4=Activar/Desactivar la alarma"))){
            case 1:
        }
    }while(eleccion>4&&eleccion<1);
    
}
}