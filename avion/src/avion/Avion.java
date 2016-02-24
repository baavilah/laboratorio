/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

/**
 *
 * @author Alex
 */
public class Avion {

    public static String[] avionEjenombre = new String[8];
    public static String[] avionEconombre = new String[42];
    public static int[] avionEjecedula = new int[8];
    public static int[] avionEcocedula = new int[42];
    public static int[] avionEjepuesto = new int[8];
    public static int[] avionEcopuesto = new int[42];
    public static int contadora;
    public static int puestoEco;
    public static int contadora1;
    public static String clase1;
    public static String ubicacion1;
    public static String nombre1;
    public static int cedula1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<8; i++){
            avionEjepuesto[i] = i+1;
        }
        for(int i=0; i<42; i++){
            avionEcopuesto[i]= i+9;
        }
        for(int i=0; i<8; i++){
            avionEjenombre[i] = "nombre"+i;
        }
        for(int i=0; i<42; i++){
            avionEconombre[i] = "nombre"+i;
        }
        for(int i=0; i<8; i++){
            avionEjecedula[i] = 0;
        }
        for(int i=0; i<42; i++){
            avionEcocedula[i] = 0;
        }
        menuAvion();
    }
    public static void asignacionSilla(String nombre, int cedula, String clase, String ubicacion){
        boolean checker = false;
        
        if("ejecutiva".equals(clase)){
            if("ventana".equals(ubicacion)){
                for(int i=0; i<8; i++){
                    if((i%4 == 0 || i%4 == 3) && ("nombre"+i).equals(avionEjenombre[i])){
                        avionEjenombre[i] = nombre;
                        avionEjecedula[i] = cedula;
                        contadora++;
                        System.out.println("El pasajero identificado como "+nombre+" ha sido asignado al puesto "+(i+1)+" en clase ejecutiva en la ventana");
                        checker = true;
                        break; 
                    }    
                }
                if(checker == false){
                    System.out.println("No se encuentra ningun asiento disponible en ventana en clase ejecutiva");
                }
            } else if ("pasillo".equals(ubicacion)){
                for(int i=0; i<8; i++){
                    if((i%4 == 1 || i%4 == 2) && ("nombre"+i).equals(avionEjenombre[i])){
                        avionEjenombre[i] = nombre;
                        avionEjecedula[i] = cedula;
                        contadora++;
                        System.out.println("El pasajero identificado como "+nombre+" ha sido asignado al puesto "+(i+1)+" en clase ejecutiva en la ubicacion pasillo");
                        checker = true;
                        break;
                    }
                }
                if(checker == false){
                    System.out.println("No se encuentra ningun asiento disponible en la ubicacion pasillo en clase ejecutiva");
                }
            } else System.out.println("La ubicacion que escribio no existe");
        } else if("economica".equals(clase)){
            if("ventana".equals(ubicacion)){
                for(int i=0; i<42; i++){
                    if(((i+9)%6 == 2 || (i+9)%6 == 3) && ("nombre"+i).equals(avionEconombre[i])){
                        avionEconombre[i] = nombre;
                        avionEcocedula[i] = cedula;
                        contadora1++;
                        System.out.println("El pasajero identificado como "+nombre+" ha sido asignado al puesto "+(i+9)+" en clase economica en la ubicacion ventana");
                        checker = true;
                        break;
                    }
                }
                if(checker == false){
                    System.out.println("No se encuentra ningun asiento disponible en la ubicacion ventana en clase economica");
                }
            } else if ("pasillo".equals(ubicacion)){
                for(int i=0; i<42; i++){
                    if(((i+9)%6 == 0 || (i+9)%6 == 5) && ("nombre"+i).equals(avionEconombre[i])){
                        avionEconombre[i] = nombre;
                        avionEcocedula[i] = cedula;
                        System.out.println("El pasajero identificado como "+nombre+" ha sido asignado al puesto "+(i+9)+" en clase economica en la ubicacion pasillo");
                        checker = true;
                        break;
                    }
                }
                if(checker == false){
                    System.out.println("No se encuentra ningun asiento disponible en la ubicacion pasillo en clase economica");
                }
            } else if("centro".equals(ubicacion)){
                for(int i=0; i<42; i++){
                    if(((i+9)%6 == 1 || (i+9)%6 == 4) && ("nombre"+i).equals(avionEconombre[i])){
                        avionEconombre[i] = nombre;
                        avionEcocedula[i] = cedula;
                        System.out.println("El pasajero identificado como "+nombre+" ha sido asignado al puesto "+(i+9)+" en clase economica en la ubicacion centro");
                        checker = true;
                        break;
                    }
                }
                if(checker == false){
                    System.out.println("No se encuentra ningun asiento disponible en la ubicacion centro en clase economica");
                }
            } else System.out.println("La ubicacion que escribio no existe");
        } else System.out.println("La clase que escribio no existe");
    }
    public static void sillasOcupadaseje(){
        System.out.println("La cantidad de sillas de clase ejecutiva ocupadas en el momento es: "+contadora);
    }
    public static void localizadorCedula(int cedula){
        for(int i=0; i<8; i++){
            if(avionEjecedula[i] == cedula){
                System.out.println("El pasajero identificado con la cedula: "+cedula+" se encuentra en la silla: "+avionEjepuesto[i]+" en clase ejecutiva"); 
                break;
            }
        }
        for(int i=0; i<42; i++){
            if(avionEcocedula[i] == cedula){
                System.out.println("El pasajero identificado con la cedula: "+cedula+"se encuentra en la silla: "+avionEcopuesto[i]+" en clase economica"); 
                break;
            } 
        }
    }
    public static void localizadorSillaeco(){
        for(int i=0; i<42; i++){
            if(("nombre"+i).equals(avionEconombre[i])){
               puestoEco = i+9;
               System.out.println("El puesto numero: "+puestoEco+" esta disponible en clase economica");
               break;
            } else System.out.println("Buscando puesto disponible en clase economica");
        }
    }
    public static void cambioAsillaeco(int cedula, String nombre){
        localizadorSillaeco();
        cleaner(cedula);
        avionEconombre[puestoEco-9] = nombre;
        avionEcocedula[puestoEco-9] = cedula;
        System.out.println("El pasajero identificado como "+nombre+" ha sido trasladado al puesto "+puestoEco+" en clase economica");
    }
    public static void cleaner(int cedula){
        for(int i=0; i<8; i++){
            if(avionEjecedula[i] == cedula){
                avionEjecedula[i] = 0;
                avionEjenombre[i] = "nombre"+i;
                contadora--;
                break;
            }
        }
        for(int i=0; i<42; i++){
            if(avionEcocedula[i] == cedula){
                avionEcocedula[i] = 0;
                avionEconombre[i] = "nombre"+i;
                if((i+9)%6 == 2 || (i+9)%6 == 3){
                        contadora1--;
                    }
                break;
            } 
        }
    }
    public static void anularReserva(int cedula, String clase){
        boolean checker = false;
        switch(clase){
            case "ejecutiva":
                for(int i=0; i<8; i++){
                    if(avionEjecedula[i] == cedula){
                        avionEjecedula[i] = 0;
                        avionEjenombre[i] = "nombre"+i;
                        System.out.println("Su reserva ha sido anulada con exito");
                        contadora--;
                        checker = true;
                        break;
                    } 
                } break;
            case "economica":
                for(int i=0; i<42; i++){
                    if(avionEcocedula[i] == cedula){
                        avionEcocedula[i] = 0;
                        avionEconombre[i] = "nombre"+i;
                        System.out.println("Su reserva ha sido anulada con exito");
                        if((i+9)%6 == 2 || (i+9)%6 == 3){
                           contadora1--;
                        }
                        checker = true;
                        break;
                    } 
                } break;
            default: break;
        }
        if(checker == false){
            System.out.println("La reserva no existe");
        }
    }
    public static void puestosVentanaeco(){
        int puestosLibres = 14 - contadora1;
        System.out.println("El numero de puestos disponibles en la ubicacion ventana en clase economica es: "+puestosLibres);
    }
    public static void nombresIgualeseco(){
        String nombre;
        for(int i=0; i<42; i++){
            nombre = avionEconombre[i];
            for(int c=i+1; c<42; c++){
                if(nombre == null ? avionEconombre[c] == null : nombre.equals(avionEconombre[c])){
                    System.out.println("El siguiente nombre se repite: "+nombre);
                    break;
                }
            }
        }
    }
    public static void imprimirAvion(){
        for(int i=0; i<4; i++){
            System.out.print("  "+avionEjepuesto[i]+" ");
            if(i%4==1){
                System.out.print(" ");
            }
        } System.out.println();
        for(int i=4; i<8; i++){
            System.out.print("  "+avionEjepuesto[i]+" ");
            if(i%4==1){
                System.out.print(" ");
            }
        } System.out.println();
        System.out.println();
        System.out.println();
        for(int c=0; c<42; c++){
            if(avionEcopuesto[c]==9){
               System.out.print(" "); 
            }
            System.out.print(avionEcopuesto[c]+" ");
            if(avionEcopuesto[c]%6 == 5){
                System.out.print("  ");
            }
            if(avionEcopuesto[c]%6 == 2) {  
                System.out.println();
            }
        }System.out.println();
    }
    public static void menuAvion(){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        String letra;
        System.out.println("Para asignar silla a pasajero escriba: A\nPara saber el numero de silla ocupadas en clase ejecutiva escriba: O\nPara encontrar el numero de silla de un pasajero escriba E");
        System.out.println("Para localizar una silla disponible en clase economica escriba: L\nPara asignar silla en clase economica a pasajero escriba: P\nPara anular reserva a pasajero escriba: V");
        System.out.println("Para saber el numero de puestos libres en la ubicación ventana en clase económica escriba: U\nPara saber si dos pasajeros en clase economica tienen el mismo nombre: M");
        System.out.println("Para observar el avion escriba: W\nPara salir del programa escriba: Q");
        System.out.println();
        letra = lectura.nextLine();
        switch(letra){
            case "A":
                System.out.println("Escriba el nombre del pasajero");
                nombre1 = lectura.nextLine();
                System.out.println("Escriba el documento del pasajero");
                cedula1 = lectura.nextInt();
                System.out.println("Escriba la clase que desea el pasajero");
                clase1 = lectura.next();
                System.out.println("Escriba la ubicación que desea el pasajero");
                ubicacion1 = lectura.next();
                System.out.println();
                asignacionSilla(nombre1, cedula1, clase1, ubicacion1);
                break;
            case "O":
                sillasOcupadaseje();
                break;
            case "E":
                System.out.println("Escriba el documento del pasajero");
                cedula1 = lectura.nextInt();
                localizadorCedula(cedula1);
                break;
            case "L":
                localizadorSillaeco();
                break;
            case "P":
                System.out.println("Escriba el nombre del pasajero");
                nombre1 = lectura.nextLine();
                System.out.println("Escriba el documento del pasajero");
                cedula1 = lectura.nextInt();
                cambioAsillaeco(cedula1, nombre1);
                break;
            case "V":
                System.out.println("Escriba el documento del pasajero");
                cedula1 = lectura.nextInt();
                System.out.println("Escriba la clase del pasajero");
                clase1 = lectura.next();
                anularReserva(cedula1, clase1);
                break;
            case "U":
                puestosVentanaeco();
                break;
            case "M":
                nombresIgualeseco();
                break;
            case "W":
                imprimirAvion();
                break;
            case "Q":
                System.exit(0);
            default: break;
        }
        System.out.println();
        menuAvion();
    }
}
