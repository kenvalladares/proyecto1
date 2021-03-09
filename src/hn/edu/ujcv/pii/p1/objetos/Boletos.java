package hn.edu.ujcv.pii.p1.objetos;

import java.util.ArrayList;

public class Boletos {
    private ArrayList<Integer> NumerosB;
    private int Numero;
    public Boletos(){
    }
    public Boletos(ArrayList<Integer> NumerosB, int Numero){
        this.NumerosB = NumerosB;
        this.Numero = Numero;
    }
    public ArrayList<Integer> getNumerosB (){
        return NumerosB;
    }
    public void setNumerosB(ArrayList<Integer> NumerosB){
        this.NumerosB = NumerosB;
    }
    public int getNumero(){
        return Numero;
    }
    public void setNumero(int Numero){
        this.Numero= Numero;
    }
}
