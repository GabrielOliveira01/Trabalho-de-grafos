/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classe;

/**
 *
 * @author fredy-18
 */
public class Esquinas {    
   private  int nome ;
   private boolean visitado ;
   private boolean etiqueta;
   private int Acumulador; // lleva el acoulado de cada nodo
   private Esquinas Antecessor;
   
   public Esquinas(){
       this.nome =-1;
       this.visitado = false;
       this.etiqueta = false;
       this.Antecessor  = null;
       this.Acumulador =0;       

   }

     public int getNome() {
        return nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public int getAcumulador() {
        return Acumulador;
    }

    public Esquinas getAntecessor() {
        return Antecessor;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAcumulador(int empilhado) {
        this.Acumulador = empilhado;
    }

    public void setAntecessor(Esquinas antecessor) {
        this.Antecessor = antecessor;
    }

    
}
