/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author tania
 */
public class usua {
    int dato;
    String nom_us;
    int puntaje;
    private final int cont=1;
    private String num="";
    

    public usua( int dato, String nom_us) {
        this.dato = dato;
        if((this.dato>=1000) || (this.dato<1000))
        {
            int can=cont+this.dato;
            num = "" + can;
        }
        if((this.dato>=100) || (this.dato<100))
        {
            int can=cont+this.dato;
            num = "0" + can;
        }
        if((this.dato>=9) || (this.dato<100))
        {
            int can=cont+this.dato;
            num = "00" + can;
        }
        if(this.dato<9)
        {
            int can=cont+this.dato;
            num = "000" + can;
        }
        this.nom_us = nom_us;
        puntaje = 0;
    }

    public void addPunto() {
        puntaje = puntaje + 5;
    }
    public String serie()
   {
       return this.num;
       
   }

    public String getNom_us() {
        return nom_us;
    }

    public void setNom_us(String nom_us) {
        this.nom_us = nom_us;
    }
    
}
