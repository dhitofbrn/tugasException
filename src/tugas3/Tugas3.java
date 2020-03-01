/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
       Scanner a = new Scanner(System.in);
        System.out.println("Pilihan");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Limas Segitiga");
        System.out.println("Enter Pilihan");
        int pilihan;
        pilihan = a.nextInt();
        
        switch(pilihan) {
            case 1 :
                
                try {
                    System.out.println("sisi a :");double sisia = a.nextDouble();
                    System.out.println("sisi b :");double sisib = a.nextDouble();
                    System.out.println("sisi c :");double sisic = a.nextDouble();
                    Balok balok = new Balok();
                    double hasila = balok.volume(sisia, sisib, sisic);
                    double hasilb = balok.luasp(sisia, sisib, sisic);
                     System.out.println("Volume = "+hasila);
                    System.out.println("Luas Permukaan = "+hasilb);
                    }
                catch (Exception ae){
                    System.out.println("Input Sesuai Ketentuan");
                    }
        break;
                
                    case 2 :
                try{
                    System.out.println("jari-jari :");double sisir = a.nextDouble();
                    System.out.println("tinggi  :");double sisiti = a.nextDouble();
                    System.out.println("sisi tegak :");double sisite = a.nextDouble();
                    Kerucut kerucut = new Kerucut();
                    double hasilka = kerucut.volume(sisir, sisiti);
                    double hasilkb = kerucut.luasp(sisir, sisite);
                    System.out.println("Volume = "+hasilka);
                    System.out.println("Luas Permukaan = "+hasilkb);
                }
                catch (Exception ae){
                    System.out.println("Input Sesuai Ketentuan");
                }
        break;
                    
           
                case 3 :
                try{
                    System.out.println("luas alas :");double sisialas = a.nextDouble();
                    System.out.println("tinggi limas :");double sisitinggi = a.nextDouble();
                    System.out.println("luas sisi tegak :");double sisitegak = a.nextDouble();
                    Limas limas = new Limas();
                    double hasilla = limas.volume(sisialas, sisitinggi);
                    double hasillb = limas.luasp(sisialas, sisitegak);
                    System.out.println("Volume = "+hasilla);
                    System.out.println("Luas Permukaan = "+hasillb);

                   }
                catch (Exception ae){
                    System.out.println("Input Sesuai Ketentuan");
                }    
                
               break;
    }
    }
    
    
    }
    

