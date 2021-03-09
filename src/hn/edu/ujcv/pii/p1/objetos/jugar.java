package hn.edu.ujcv.pii.p1.objetos;

import java.util.ArrayList;

public class jugar {
    public  jugar() {
    }
    public static void JugarDiario(ArrayList<Participantes> jugadores1){

     ArrayList<Integer> ganadorDiario= new ArrayList<>();
     int total = 0;
     int contador = 0, valorActual;
     for(Participantes item: jugadores1){
         System.out.println("Nombre:"+item.getNombre());
         System.out.println("Los numeros que compro son:"+item.getBoletos().getNumerosB());
     }
        System.out.println();
     do{
         System.out.println("Numeros ganadores");
         for (int i = 0; i < 5; i++) {
             valorActual= (int) (Math.random() * ((100-1)+1))+1;
            ganadorDiario.add(valorActual);
         }
         for (int item: ganadorDiario) {
             System.out.println(item);
         }
         System.out.println("");
         contador = 0;
         for (int j = 0; j < 5; j++) {
             for (int k = 0; k < 5; k++) {
              if(ganadorDiario.get(j)==ganadorDiario.get(k)){
                 contador++;
             }
         }
         }
     }while(contador > 5);
        for(Participantes item: jugadores1){
            ArrayList<Integer> valoresActuales = new ArrayList<>();
            valoresActuales = item.getBoletos().getNumerosB();
            System.out.println("Los valores que compro fueron:");
            for (int item2: valoresActuales) {
                System.out.println(item2);
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if(valoresActuales.get(j)==ganadorDiario.get(k)){
                            total++;
                        }
                    }

                }
            }
            switch (total){
                case 3:
                    System.out.println("***");
                    System.out.println("El jugador "+item.getNombre()+"Ha adivinado 3 numeros");
                    System.out.println("Los numero que compro fueron:");
                    for (int item3:valoresActuales) {
                        System.out.println("("+item3+")");
                    }
                    System.out.println("Ha ganado 5,000 Lps!");
                    break;
                case 4:
                    System.out.println("***");
                    System.out.println("El jugador "+item.getNombre()+"Ha adivinado 4 numeros");
                    System.out.println("Los numero que compro fueron:");
                    for (int item3:valoresActuales) {
                        System.out.println("("+item3+")");
                    }
                    System.out.println("Ha ganado 10,000 Lps!");
                    break;
                case 5:
                    System.out.println("***");
                    System.out.println("El jugador "+item.getNombre()+"Ha adivinado 5 numeros");
                    System.out.println("Los numero que compro fueron:");
                    for (int item3:valoresActuales) {
                        System.out.println("("+item3+")");
                    }
                    System.out.println("Ha ganado 100,000 Lps!");
                    break;
                default:
                    System.out.println("No adivino numeros, Suerte la proxima♥");
            }
            total =0;
        }

}
    public static void JugarSemanal(ArrayList<Participantes> jugadores2){

        ArrayList<Integer> ganadorDiario= new ArrayList<>();
        int total = 0;
        int contador = 0, valorActual;
        for(Participantes item: jugadores2){
            System.out.println("Nombre:"+item.getNombre());
            System.out.println("Los numeros que compro son:"+item.getBoletos().getNumerosB());
        }
        System.out.println();
        do{
            System.out.println("Numeros ganadores");
            for (int i = 0; i < 2; i++) {
                valorActual= (int) (Math.random() * ((100-1)+1))+1;
                ganadorDiario.add(valorActual);
            }
            for (int item: ganadorDiario) {
                System.out.println(item);
            }
            contador = 0;
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if(ganadorDiario.get(j)==ganadorDiario.get(k)){
                        contador++;
                    }
                }
            }
        }while(contador > 2);
        for(Participantes item: jugadores2){
            ArrayList<Integer> valoresActuales= new ArrayList<>();
            valoresActuales = item.getBoletos().getNumerosB();
            System.out.println("Los valores que compro fueron:");
            for (int item2: valoresActuales) {
                System.out.println(item2);
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        if(valoresActuales.get(j)==ganadorDiario.get(k)){
                            total++;
                        }
                    }

                }
            }
            switch (total){
                case 1:
                    System.out.println("***");
                    System.out.println("El jugador "+item.getNombre()+"Ha adivinado 1 numero");
                    for (int item3:valoresActuales) {
                        System.out.println(item);
                    }
                    System.out.println("Ha ganado 5,000 Lps!");
                    break;
                case 2:
                    System.out.println("***");
                    System.out.println("El jugador "+item.getNombre()+"Ha adivinado 2 numeros");
                    for (int item3:valoresActuales) {
                        System.out.println(item);
                    }
                    System.out.println("Ha ganado 100,000 Lps!");
                    break;
                   default:
                    System.out.println("No adivino numeros, Suerte la proxima♥");
            }
            total =0;
        }

    }
    public static void JugarMensual(ArrayList<Participantes> jugadores3){

        ArrayList<Integer> ganadorMensual= new ArrayList<>();
        int total = 0;
        int contador = 0, valorActual;
        for(Participantes item: jugadores3){
            System.out.println("Nombre:"+item.getNombre());
            System.out.println("Los numeros que compro son:"+item.getBoletos().getNumerosB());
        }
        System.out.println();
        do{
            System.out.println("Numeros ganadores");
            for (int i = 0; i < 1; i++) {
                valorActual= (int) (Math.random() * ((100-1)+1))+1;
                ganadorMensual.add(valorActual);
            }
            for (int item: ganadorMensual) {
                System.out.println(item);
            }
            contador = 0;
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 1; k++) {
                    if(ganadorMensual.get(j)==ganadorMensual.get(k)){
                        contador++;
                    }
                }
            }
        }while(contador > 1);
        for(Participantes item: jugadores3){
            ArrayList<Integer> valoresActuales= new ArrayList<>();
            valoresActuales = item.getBoletos().getNumerosB();
            System.out.println("Los valores que compro fueron:");
            for (int item2: valoresActuales) {
                System.out.println(item2);
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                    for (int k = 0; k < 1; k++) {
                        if(valoresActuales.get(j)==ganadorMensual.get(k)){
                            total++;
                        }
                    }

                }
            }
            switch (total){
                case 1:
                    System.out.println("***");
                    System.out.println("El jugador "+item.getNombre()+"Ha adivinado el numero");
                    for (int item3:valoresActuales) {
                        System.out.println(item);
                    }
                    System.out.println("Ha ganado 10,000 Lps!");
                    break;
                    default:
                    System.out.println("No adivino numeros, Suerte la proxima♥");
            }
            total =0;
        }

    }
}
