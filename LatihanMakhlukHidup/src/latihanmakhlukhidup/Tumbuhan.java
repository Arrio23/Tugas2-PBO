/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmakhlukhidup;

/**
 *
 * @author RIO
 */
public class Tumbuhan extends MakhlukHidup {
    
    private String akar;
    
    public Tumbuhan(){
    
    }
    
    public Tumbuhan(String nama, String berkembangBiak){
        super(nama, berkembangBiak);
    }
    
    public Tumbuhan(String akar){
        this.akar = "tunggang";
    }
    
    /**
     * @return the akar
     */
    public String getAkar() {
        return akar;
    }

}
