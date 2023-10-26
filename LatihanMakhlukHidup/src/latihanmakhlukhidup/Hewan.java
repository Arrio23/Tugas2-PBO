/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmakhlukhidup;

/**
 *
 * @author RIO
 */
public class Hewan extends MakhlukHidup { 

    private String alatGerak;
    
    public Hewan(){
        
    }
    public Hewan (String nama, String berkembangBiak){
        super(nama, berkembangBiak);
    }
    
    public Hewan(String alatGerak){
        this.alatGerak = "kaki";
    }

    /**
     * @return the alatGerak
     */
    public String getAlatGerak() {
        return alatGerak;
    }
    
}
