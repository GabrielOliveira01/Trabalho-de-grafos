/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import static View.Principal.jPanel1;
import static View.Principal.R_repaint;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Shutdown
 */
public class Dijkstra_Algo {
   private Ruas ruas;
   private int subLimite;
   private Esquinas auxi=null;
   private int auxAcumulador; // Acumulador auxiliar
   private int subAcumulador;
   private Esquinas esquinas[]; 
   private int limite;
   private int definitiva;     
   private int esquinasFin; 
   
  public Dijkstra_Algo (Ruas ruas, int limite, int definitiva, int esquinasFin){
       this.ruas = ruas;
       this.limite =limite;
       this.esquinas = new Esquinas[limite];
       this.definitiva = definitiva;
       this.esquinasFin = esquinasFin;       
   }
   public int getAcumulador(){
       return esquinas[esquinasFin].getAcumulador();
   }
   public void djk(){
       for (int i = 0; i< limite; i++) 
// Delimitamos Vetor de esquinas que será criados 
           esquinas[i] = new Esquinas();
       if (definitiva != esquinasFin){
           
             jPanel1.paint(jPanel1.getGraphics());
             R_repaint(limite, ruas);   
             Pintar.clickSobreEsquinas(jPanel1.getGraphics(), ruas.getVertical
        (definitiva), ruas.getHorizontal(definitiva), null,Color.GREEN);
             //Pinta de cor verde o caminho mais curto
            
        
            esquinas[definitiva].setVisitado(true);        
            esquinas[definitiva].setNome(definitiva);       
            
            do{            
              subAcumulador=0;
              auxAcumulador = 2000000000; 
//numero maximo de Esquinas que pode ser ciadas
              esquinas[definitiva].setEtiqueta(true); 
              for (int j = 0; j < limite; j++) {
                  if(ruas.getAdjacente(j, definitiva)==1){
                        subAcumulador= esquinas[definitiva].getAcumulador()+
                                ruas.getCoeficiente(j, definitiva);                                 
                        if(subAcumulador <= esquinas[j].getAcumulador()
                                && esquinas[j].isVisitado()==true && 
                                esquinas[j].isEtiqueta()== false){
                            esquinas[j].setAcumulador(subAcumulador);
                            esquinas[j].setVisitado(true);
                            esquinas[j].setNome(j);
                            esquinas[j].setAntecessor(esquinas[definitiva]);
                        }
                        else if( esquinas[j].isVisitado()==false){
                            esquinas[j].setAcumulador(subAcumulador);
                            esquinas[j].setVisitado(true);
                            esquinas[j].setNome(j);
                            esquinas[j].setAntecessor(esquinas[definitiva]); 
                       }
                 }
              }
              for (int i = 0; i <limite; i++) { 
//Verifica qual passagem é menor apartir de uma esquina
                if(esquinas[i].isVisitado()== true && 
                        esquinas[i].isEtiqueta()== false){
                   if(esquinas[i].getAcumulador()<=auxAcumulador){
                       definitiva= esquinas[i].getNome();
                       auxAcumulador = esquinas[i].getAcumulador();
                   }
                }               
             }
            subLimite++;                
          }while(subLimite<limite+1);          
          auxi= esquinas[esquinasFin]; 
           if(auxi.getAntecessor()== null )
             JOptionPane.showMessageDialog
        (null,"não foi possivel alcaçar esquina "+esquinasFin);          
          while(auxi.getAntecessor()!= null){           
              Pintar.pintarCaminho(jPanel1.getGraphics(), 
                  ruas.getVertical(auxi.getNome()), 
                  ruas.getHorizontal(auxi.getNome()), 
                  ruas.getVertical(auxi.getAntecessor().getNome()), 
                  ruas.getVertical(auxi.getAntecessor().getNome()),Color.GREEN);
              Pintar.clickSobreEsquinas(jPanel1.getGraphics(), 
                      ruas.getVertical(auxi.getNome()), 
                      ruas.getHorizontal(auxi.getNome()), null,Color.GREEN);
             auxi=auxi.getAntecessor();              
          }  
         Pintar.clickSobreEsquinas(jPanel1.getGraphics(), 
                 ruas.getVertical(esquinasFin), 
                 ruas.getHorizontal(esquinasFin), null,Color.GREEN);     
       }
       else Pintar.clickSobreEsquinas(jPanel1.getGraphics(), 
               ruas.getVertical(esquinasFin), 
               ruas.getHorizontal(esquinasFin), null,Color.GREEN);    
    }
}
