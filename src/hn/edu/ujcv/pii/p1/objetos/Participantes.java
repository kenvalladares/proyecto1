package hn.edu.ujcv.pii.p1.objetos;

import java.util.ArrayList;

public class Participantes {
 private String Nombre;

private Boletos Boletos;

 public Participantes(){
 }
 public Participantes(String Nombre, Boletos Boletos){
     this.Nombre = Nombre;
     this.Boletos = Boletos;
 }
 public String getNombre(){

     return Nombre;
 }
 public void setNombre(String Nombre){

     this.Nombre = Nombre;
 }


 //public ArrayList<Participantes> getParticipante(){
     //return Participante;
 //}
 //public  void setParticpante(ArrayList<Participantes> Participante){

     //this.Participante = Participante;
// }
public Boletos getBoletos(){
     return Boletos;
}
public void setBoletos(Boletos Boletos){
     this.Boletos = Boletos;
}

}

