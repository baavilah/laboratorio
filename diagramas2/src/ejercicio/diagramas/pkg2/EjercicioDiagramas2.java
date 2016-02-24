/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.diagramas.pkg2;

/**
 *
 * @author FamiliaOrjRod
 */
public class EjercicioDiagramas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuenta_as = 1;
        int contador = 1;
        int blan = 1;
        int num = 5;
        char ast = 42;
        char esp =  32;
        
        System.out.println("");
        for(contador = 1; contador <= num; blan = num - contador){
            for(blan = 1;  blan>0 ; blan--){
                System.out.println(esp);
            }
            for(cuenta_as =1; cuenta_as <(2*contador); cuenta_as++){
                System.out.println(ast);
            }
            contador++;
            System.out.println("");
        }
  
        
    }
    
}
