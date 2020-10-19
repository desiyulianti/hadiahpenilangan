/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Penilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PENILANGAN MASKER, SIM DAN STNK");
        String barang;
         Scanner input = new Scanner (System.in);
         System.out.println("Barang yang tidak dibawa :");
         barang = input.nextLine();
         switch(barang){
             case "masker":
                 System.out.println("membayar denda sebesar 200000");
                 break;
             case "SIM" :
                 System.out.println("motor anda akan dibawa ke Polres dan didenda sebesar 150000");
                 break;
             case "STNK" :
                 System.out.println("motor anda akan dibawa ke Polres dan didenda sebesar 120000");
                 break;
             default:
                 System.out.println("Silakan melanjutkan perjalanan");
                 break;
         }
         
     
}
}