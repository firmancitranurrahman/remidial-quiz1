/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS 10.1
 */
public class SepatuPria {
   private int size;
   private String color;
   private String name;
   private int harga;

    public SepatuPria() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
        getHarga();
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga() {
        if(this.name.equalsIgnoreCase("NIKE MERCURIAL")){
            this.harga = 400000;
            getHarga();
        } else if(this.name.equalsIgnoreCase("SPECS GARUDA")){
            this.harga = 350000 ;
            getHarga();
        } else if(this.name.equalsIgnoreCase("ADIDAS PREDATOR")){
            this.harga = 250000 ;
            getHarga();
        } else {
            this.harga = 0 ;
            getHarga();
        }
    }
    public String info () {
        String info = "" ;
        info += "Merk Sepatu = "  + getName() +"\n" ;
        info += "Ukuran = "  + getSize() +"\n" ;
         info += "Color = "  + getColor() +"\n" ;
        info += "Harga = "  + getHarga() +"\n" ;
        
        return info ;
}
}
