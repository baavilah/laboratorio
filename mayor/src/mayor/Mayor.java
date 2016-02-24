/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor;

/**
 *
 * @author EL MEJOR
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mayor = 0;
        int A = 0;
        int B = 0;
        int C = 0;
        java.util.Scanner lectura = new java.util.Scanner (System.in);
        System.out.println("Ingrese A");
        A = lectura.nextInt();
        System.out.println("Ingrese B");
        B = lectura.nextInt();
        System.out.println("Ingrese C");
        C = lectura.nextInt();
        
        if( A > B){
            if(A > C){
                mayor = A;
            }else{
                mayor = C;
            }
        }else{
            if(B > C){
                mayor = B;
            }else{
                mayor = C;
            }
        }
        
        System.out.println("El mayor es " + mayor);
    }
    
}
