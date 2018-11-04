/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS 10.1 // Firman Citra Nurrahman
 */
public class Sepatu {
  private SepatuWanita cewek;
  private SepatuPria cowok;
  

    public Sepatu() {
    }

    public SepatuWanita getCewek() {
        return cewek;
    }

    public void setCewek(SepatuWanita cewek) {
        this.cewek = cewek;
    }

    public SepatuPria getCowok() {
        return cowok;
    }

    public void setCowok(SepatuPria cowok) {
        this.cowok = cowok;
    }
  
    public int TotalHargaCewek() {
        return this.cewek.getHarga();
    }
    
    public int TotalHargaCowok() {
        return (this.cowok.getHarga())+(this.cowok.getHarga())+(this.cowok.getHarga());
    }
    
    public void infoCowok () {
        String info = "" ;
        System.out.println("Info Sepatu Pria : " + this.cowok.info()) ;
       
      
    }
    public void infoCewek () {
    System.out.println("Info Sepatu Wanita : \n" + this.cewek.info()) ;
    
     }
}