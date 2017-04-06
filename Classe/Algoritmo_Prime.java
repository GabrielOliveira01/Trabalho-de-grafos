/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classe;

import static View.Principal.R_repaint;
import static View.Principal.esquinaDeOrigem;
import static View.Principal.jPanel1;
import java.awt.Color;

/**
 *
 * @author fredy-18
 */
public class Algoritmo_Prime {
    
    private int acumulador;
   private int arestaMenor;
   private int  fim;
   private boolean estaEsquina=false;
   private boolean aumentarTamanho;
   private int esquinaApontada;  
   private int esquinaApontadas;
   private int tamanho;
   private int arestaMaior;
   private  Ruas ruas;
   private int limites;
   private  int  esquinaDeOrigem;
   
   
   
   public Algoritmo_Prime(Ruas tree , int limite ,int arestaMaior ){
       this.acumulador = 0;
       this.arestaMenor = 0;
       this.fim = 0;
       this.estaEsquina=false;
       this.aumentarTamanho = false;
       this.esquinaApontada = 0;  
       this.esquinaApontadas = 0;
       this.tamanho = 1;
       this.arestaMaior=arestaMaior;
       this.ruas = tree;
       this.limites = limite;
   }

    public int getAcumulador() {
        return acumulador;
    }

   
  public void prime(){
      this.esquinaDeOrigem = esquinaDeOrigem("Ingrese Nodo Origen..","nodo Origen No existe",limites);
       jPanel1.paint(jPanel1.getGraphics());
       R_repaint(limites,ruas);
       ruas.crearArs(limites);
       ruas.setArs(0, esquinaDeOrigem);
       //algoritmo de Prim ---->>
       do{
           this.arestaMenor = this.arestaMaior;
           this.fim=2;
            for (int j = 0; j < tamanho; j++) {
                for (int k = 0; k < limites; k++){
                    if(ruas.getAdjacente(k, ruas.getArs(j))==1){
                        for (int h = 0; h < tamanho; h++) {
                             if(ruas.getArs(h)==k ){
                                 this.estaEsquina=true; 
                                 break;
                             }
                        }
                        if(estaEsquina==false){
                            if(ruas.getCoeficiente(k, ruas.getArs(j))<=arestaMenor && ruas.getCoeficiente(k, ruas.getArs(j))>0 ){
                                 arestaMenor = ruas.getCoeficiente(k, ruas.getArs(j));
                                 this.esquinaApontada=k;
                                 this.aumentarTamanho=true;
                                 this.esquinaApontadas=ruas.getArs(j);
                                 this.fim=1;
                            }
                        }
                        this.estaEsquina=false;
                    }
                }
            }//fin  for (int j = 0; j < tamano; j++)              
         if(aumentarTamanho==true){
                    Pintar.pintarCaminho(jPanel1.getGraphics(),ruas.getVertical(esquinaApontadas), ruas.getHorizontal(esquinaApontadas),ruas.getVertical(esquinaApontada), ruas.getHorizontal(esquinaApontada),Color.red); 
                    Pintar.clickSobreEsquinas(jPanel1.getGraphics(),ruas.getVertical(esquinaApontadas), ruas.getHorizontal(esquinaApontadas), null,Color. red);
                    Pintar.clickSobreEsquinas(jPanel1.getGraphics(),ruas.getVertical(esquinaApontadas), ruas.getHorizontal(esquinaApontadas), null, Color.red);                                  
                    ruas.setArs(tamanho, esquinaApontada);
                    this.tamanho++;
                    this.aumentarTamanho=false;
                    this.acumulador += this.arestaMenor;
         }
        }while(fim<2);
   }
    
}
