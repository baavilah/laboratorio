/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author Alex
 */

public class Parqueadero {
    
     public static String[] parqueadero1 = new String [87];
     public static int[] tiempo = new int [87];
     public static int dineroDia;   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 0; i<87; i++){   
            parqueadero1[i] = "###000";
            tiempo[i] = 0;
        }
        System.out.println();
        parqueaderoFuncional();
    }
    public static void ingresoCarro(String placa, int horaEntrada){
        for(int i=0; i<parqueadero1.length; i++){
            if("###000".equals(parqueadero1[i])){
                parqueadero1[i] = placa;
                tiempo[i] = horaEntrada;
                System.out.println("Por favor parquée en el puesto: "+(i+1));
                break;
            }
        } 
    }
    public static void salidaCarro(String placa, int horaSalida){
        int tarifa = 5000;
        int horaEntrada = 0;
        
        for(int i=0; i<parqueadero1.length; i++){
            if(parqueadero1[i].equals(placa)){
                parqueadero1[i] = "###000";
                horaEntrada = tiempo[i];
                break;
            }
        }
        int tiempo = horaSalida - horaEntrada;
        int cobro = tiempo*tarifa;
        dineroDia += cobro;
        System.out.println("Debe pagar: $"+cobro);
    }
    public static void dineroDia(){
        System.out.println("Dinero recibido el dia de hoy es: $"+dineroDia);
    }
    public static void puestosLibres(){
        int contadora = 0;
         for (String parqueadero11 : parqueadero1) {
             if ("###000".equals(parqueadero11)) {
                 contadora++;
             }
         }
        System.out.println("El número de puestos vacios son: "+contadora);
    }
    public static void parqueaderoFuncional(){
       java.util.Scanner lectura = new java.util.Scanner(System.in);
       String letra;
       String placa;
       int horaEntrada;
       int horaSalida;
       System.out.println("Para el ingreso de un auto escriba: I\nPara la salida de un auto escriba: S\nPara ver el dinero cobrado hoy escriba: D");
       System.out.println("Para ver la cantidad de puestos libres escriba: P\nPara finalizar el programa escriba: E\nPara observar el estado del parqueadero escriba: V");
       letra = lectura.nextLine();
       switch(letra){
           case "I":
               System.out.println("Escriba la placa del carro: ");
               System.out.println("Ejemplo: ABC123");
               placa = lectura.nextLine();
               System.out.println("Escriba la hora de entrada: ");
               System.out.println("Abierto entre las 6 y las 21 horas");
               horaEntrada = lectura.nextInt();
               System.out.println();
               ingresoCarro(placa, horaEntrada);
               break;
           case "S": 
               System.out.println("Escriba la placa del carro: ");
               placa = lectura.nextLine();
               System.out.println("Escriba la hora de salida: ");
               System.out.println("Abierto entre las 6 y las 21 horas");
               horaSalida = lectura.nextInt();
               System.out.println();
               salidaCarro(placa, horaSalida);
               break;
           case "D": 
               System.out.println();
               dineroDia();
               break;
           case "P":
               System.out.println();
               puestosLibres();
               break;
           case "E":
               System.exit(0); 
           case "V":
               System.out.println();
               parqueaderoImpreso();
               break;
           default: break;
       }
       System.out.println();
       parqueaderoFuncional();
    }
    public static void parqueaderoImpreso(){

        for (int i=0; i<24; i++) {
            System.out.print(parqueadero1[i]+" ");
        }   
        System.out.println();
        for(int c=24; c<parqueadero1.length; c++){
            if (c%7 == 0){
                System.out.print("       ");
            }
            if(c==45) {  
                System.out.println();
            }
            if(c==66) {  
                System.out.println();
            }
            System.out.print(parqueadero1[c]+" ");
        }  
    }
}
