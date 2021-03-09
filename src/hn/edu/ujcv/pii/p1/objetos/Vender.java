package hn.edu.ujcv.pii.p1.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Vender {

    public Vender(){
    }
    public static void venderDiario(String Nombre, ArrayList<Participantes> jugadores1){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        ArrayList<Integer> NumerosTemp = new ArrayList<Integer>();
        ArrayList<Boletos> boletos = new ArrayList<Boletos>();
        Participantes participante1 = new Participantes();
        System.out.println("****************************");
        System.out.println("       Juego diario         ");
        System.out.println("****************************");
        int valor=0;
        Boletos boleto1= new Boletos();
            System.out.println("Ingrese sus 5 números");
            for(int j=0; j<5; j++){
                valor = teclado.nextInt();
                NumerosTemp.add(valor);
                for (int l=0; l<j;l++){
                    if(NumerosTemp.get(j)==NumerosTemp.get(l)){
                        System.out.println("El número que ingresó está repetido");
                        NumerosTemp.remove(j);
                        j--;
                    }
                }
            }
            boleto1.setNumerosB(NumerosTemp);
            boletos.add(boleto1);
            participante1.setBoletos(boleto1);
            participante1.setNombre(Nombre);
            jugadores1.add(participante1);
            System.out.println(boleto1.getNumerosB());

    }
    public static void venderSemanal(String Nombre, ArrayList<Participantes> jugadores2){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        ArrayList<Integer> NumerosTemp = new ArrayList<Integer>();
        ArrayList<Boletos> boletos = new ArrayList<Boletos>();
        Boletos boleto2  = new Boletos();
        Participantes participante2 = new Participantes();
        System.out.println("****************************");
        System.out.println("       Juego Semanal         ");
        System.out.println("****************************");
            int valor=0;
            System.out.println("Ingrese sus 2 números");
            for(int j=0; j<2; j++){
                valor = teclado.nextInt();
                NumerosTemp.add(valor);
                for (int l=0; l<j;l++){
                    if(NumerosTemp.get(j)==NumerosTemp.get(l)){
                        System.out.println("El número que ingresó está repetido");
                        NumerosTemp.remove(j);
                        j--;
                    }
                }
            }
            boleto2.setNumerosB(NumerosTemp);
            boletos.add(boleto2);
            participante2.setBoletos(boleto2);
            participante2.setNombre(Nombre);
            jugadores2.add(participante2);
            System.out.println(boleto2.getNumerosB());


    }
    public static void venderMensual(String Nombre, ArrayList<Participantes> jugadores3){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        ArrayList<Integer> NumerosTemp = new ArrayList<Integer>();
        ArrayList<Boletos> boletos = new ArrayList<Boletos>();
        Participantes participante3 = new Participantes();
        Boletos boleto3             = new Boletos();
        System.out.println("****************************");
        System.out.println("       Juego Mensual        ");
        System.out.println("****************************");
        int valor=0;
            System.out.println("Ingrese su número");
            for(int j=0; j<1; j++){
                valor = teclado.nextInt();
                NumerosTemp.add(valor);
                for (int l=0; l<j;l++){
                    if(NumerosTemp.get(j)==NumerosTemp.get(l)){
                        System.out.println("El número que ingresó está repetido");
                        NumerosTemp.remove(j);
                        j--;
                    }
                }
            }
            boleto3.setNumerosB(NumerosTemp);
            boletos.add(boleto3);
            participante3.setBoletos(boleto3);
            participante3.setNombre(Nombre);
            jugadores3.add(participante3);
            System.out.println(boleto3.getNumerosB());

    }

}

