/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author Shutdown
 */
public class Ruas {
   private int coeficiente[][] = new int [51][51];
   private int adjacente [][] = new int [51][51];
   private int vertical [] = new int [51];
   private int horizontal [] = new int [51];
   private int nome [] = new int [51];
   private int ars [];

   public Ruas(){
       
   }
    public int getCoeficiente(int i, int j) {
        return coeficiente [i][j];
    }

    public void setCoeficiente(int i, int j, int coeficiente) {
        this.coeficiente [i][j] = coeficiente;
    }

    public int getAdjacente(int i, int j) {
        return adjacente [i][j];
    }

    public void setAdjacente(int i, int j,int adjacente) {
        this.adjacente [i][j] = adjacente;
    }

    public int getVertical(int i) {
        return vertical [i];
    }

    public void setVertical(int i, int vertical) {
        this.vertical [i] = vertical;
    }

    public int getHorizontal(int i) {
        return horizontal[i];
    }

    public void setHorizontal(int i, int horizontal) {
        this.horizontal [i] = horizontal;
    }

    public int getNome(int i) {
        return nome [i];
    }

    public void setNome(int i, int nome) {
        this.nome[i] = nome;
    }

    public int getArs(int i) {
        return ars [i];
    }

    public void setArs(int i, int ars) {
        this.ars [i] = ars;
    }  

    void crearArs(int i) {
        ars = new int [i]; 
    }
}
