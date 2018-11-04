/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ASUS 10.1
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan;

        Scanner sc = new Scanner(System.in);

        SepatuPria cowok = new SepatuPria();
        SepatuWanita cewek = new SepatuWanita();
        Sepatu sepatu= new Sepatu();
        
        System.out.println("Jenis Sepatu Pria Dan Wanita");
        System.out.println("1.Sepatu Pria");
        System.out.println("2.Sepatu Wanita");
        System.out.println("Pilih Jenis Sepatu: ");
        pilihan = sc.nextInt();
        if (pilihan == 1) {
            cowok.setSize(40);
            System.out.println("1. NIKE MERCURIAL");
            System.out.println("2. SPECS GARUDA");
            System.out.println("3. ADIDAS PREDATOR");
            System.out.print("Pilihan:");
            int pilihan2 = sc.nextInt();
            if (pilihan2 == 1) {
                cowok.setName("NIKE MERCURIAL");
                cowok.setColor("Blue");
                cowok.setHarga();
            }else if(pilihan2 == 2){
                cowok.setColor("Red");
                cowok.setName("SPECS GARUDA");
                cowok.setHarga();
            }else if (pilihan2==3){
                cowok.setName("ADIDAS PREDATOR");
                cowok.setHarga();
                cowok.setColor("Abu Abu");
            }
           sepatu.setCowok(cowok);
           sepatu.infoCowok();
        }
        else if(pilihan==2){
            System.out.println("1. Stiletto");
            System.out.println("2. Pump");
            System.out.println("3. High Heels");
            System.out.print("Pilihan : ");
            int pilihan2 = sc.nextInt();
            if(pilihan2==1){
                cewek.setName("Stiletto");
                cewek.getColor();
                cewek.setSize(39);
                cewek.setColor("pink");
                cewek.setHarga();
            }else if (pilihan2==2){
               cewek.setName("Pump");
               cewek.getColor();
               cewek.setSize(39);
               cewek.setColor("Red");
               cewek.setHarga();
            }else if(pilihan2 ==3){
                cewek.setName("High Heels");
                cewek.getColor();
                cewek.setSize(40);
                cewek.setColor("Yellow");
                cewek.setHarga();
            }
               sepatu.setCewek(cewek);
               sepatu.infoCewek();
        }
        
    }
}
