/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knnalgoritmasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Günevi
 */

public class KnnAlgoritmasi  {
    
    
     
        
        
       
    
    
    public static void main(String[] args) {
        List <uzaklik> uzakliklistesi= new ArrayList <uzaklik> ();
     List<Koordinat> koordinatlistesi= new  ArrayList <Koordinat>();
        
        Koordinat k1=new Koordinat();
        Koordinat k2=new Koordinat();
        Koordinat k3=new Koordinat();
        Koordinat k4=new Koordinat();
        Koordinat k5=new Koordinat();

        k1.setX(7);
        k1.setY(7);
        k1.setSinif("SinifA");
        koordinatlistesi.add(k1);
        
        k2.setX(7);
        k2.setY(4);
        k2.setSinif("SinifA");
        koordinatlistesi.add(k2);
        
        k3.setX(3);
        k3.setY(4);
        k3.setSinif("SinifB");
        koordinatlistesi.add(k3);
        
        k4.setX(1);
        k4.setY(4);
        k4.setSinif("SinifB");
        koordinatlistesi.add(k4);
        
        k5.setX(3);
        k5.setY(7);
        

      for(int i=0;i<koordinatlistesi.size();i++){
            uzaklik uz= new uzaklik();
            uz.deger=Math.sqrt(Math.pow((koordinatlistesi.get(i).x-k5.x),2)+Math.pow((koordinatlistesi.get(i).y-k5.y),2));
            uz.nesne = koordinatlistesi.get(i).sinif;  
            uzakliklistesi.add(uz);
      }
     
        Collections.sort(uzakliklistesi, new degereGoresirala());
       
        Scanner klavye = new Scanner (System.in);
        System.out.println("k degerini giriniz :");
        int k = klavye.nextInt();
        if(k>koordinatlistesi.size()){
            System.out.println("gireceginiz deger "+koordinatlistesi.size()+" degerinden kucuk esit olmali");
            k = klavye.nextInt();
        }
        int e=0;
        int g=0;
       for (int i = 0; i < k; i++)
                {
                    
                    if (uzakliklistesi.get(i).nesne == "SinifA") {e++;}
                    else if (uzakliklistesi.get(i).nesne == "SinifB") {g++;}
                }
       
                if (e > g)
                {
                    k5.sinif = "sinifA";
                    
                }
                else 
                {
                    k5.sinif = "sinifB";
                }
                
                koordinatlistesi.add(k5);
                for (int i=0;i<koordinatlistesi.size();i++)
                {
                    System.out.println(koordinatlistesi.get(i).x + " " + koordinatlistesi.get(i).y + " " + koordinatlistesi.get(i).sinif);;
                }
    }

   
    
}
