
package boletin3;
import java.util.Scanner;


/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1=new Coche();
        Scanner sc=new Scanner (System.in);
        coche1.acelerar(10);
        System.out.println("Acelero : "+coche1.getVelocidade());
        coche1.frenar(7);
        System.out.println("Freno : "+coche1.getVelocidade());
    }
    
}
