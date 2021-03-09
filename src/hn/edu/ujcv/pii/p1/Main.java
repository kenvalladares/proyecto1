package hn.edu.ujcv.pii.p1;
import hn.edu.ujcv.pii.p1.objetos.Vender;
import hn.edu.ujcv.pii.p1.objetos.jugar;
import hn.edu.ujcv.pii.p1.objetos.Boletos;
import hn.edu.ujcv.pii.p1.objetos.Participantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int clientes =0;
        try{
        // write your code here
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
            System.out.println("Cuantos clientes va a ingresar");
            clientes = teclado.nextInt();
            String respuesta=" ", respuesta1="";
        ArrayList<Participantes> jugadores1 = new ArrayList<>();
        ArrayList<Participantes> jugadores2 = new ArrayList<>();
        ArrayList<Participantes> jugadores3 = new ArrayList<>();
            for (int i = 0; i < clientes; i++) {
                String nombreCliente = " ";
                System.out.println("Ingrese su nombre");
                nombreCliente = teclado.next();

                do{
                    System.out.println("* *  * MENÚ DE VENTA  * * *");
                    System.out.println("*     1.Vender diario    *");
                    System.out.println("*     2.Vender semanal   *");
                    System.out.println("*     3.Vender mensual   *");
                    System.out.println("*     4.Salir            *");
                    System.out.println("*  * * * * * * * * * * * *");
                    System.out.println("");
                    System.out.print("Elija una opción: ");
                    int opcion = teclado.nextInt();
                    switch (opcion){
                        case 1: Vender.venderDiario(nombreCliente,jugadores1);
                        break;
                        case 2: Vender.venderSemanal(nombreCliente,jugadores2);
                        break;
                        case 3: Vender.venderMensual(nombreCliente,jugadores3);
                        break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    System.out.println("Desea comprar otro boleto? S/N?");
                     respuesta = teclado.next();
                }while(respuesta.equalsIgnoreCase("s"));
            }
                do{System.out.println("* *  * MENÚ DE Juegos  * * *");
                    System.out.println("*     1.Juego diario     *");
                    System.out.println("*     2.Juego semanal    *");
                    System.out.println("*     3.Juego mensual    *");
                    System.out.println("*     4.Salir            *");
                    System.out.println("*  * * * * * * * * * * * *");
                    System.out.println("");
                    System.out.print("Elija una opción: ");
                    int opcion1 = teclado.nextInt();
                    switch (opcion1){
                        case 1: jugar.JugarDiario(jugadores1);
                        break;
                        case 2: jugar.JugarSemanal(jugadores2);
                        break;
                        case 3: jugar.JugarMensual(jugadores3);
                        break;
                        default:
                            System.out.println("La Opcion que ingreso es invalida");
                            System.out.println("----------------------------------");

                    }
                    System.out.println("Desea los resultados de otro juego? S/N");
                    respuesta1=teclado.next();
                }while(respuesta1.equalsIgnoreCase("s"));

        }
        catch (Exception e){
            System.err.println("Error"+e.getMessage());
            }
    }

}