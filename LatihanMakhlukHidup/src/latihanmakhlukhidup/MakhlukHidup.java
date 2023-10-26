/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmakhlukhidup;

/**
 *
 * @author RIO
 */
public class MakhlukHidup {
        
    private String nama;
    private int panjang;
    private int massa;
    private String berkembangBiak;
    
    public MakhlukHidup(){
        this.nama = "belum ada";
    }
    
    public MakhlukHidup (String inputNama, String berkembang){
        nama = inputNama;
        berkembangBiak = berkembang;
    }
    
    public MakhlukHidup(int panjangBadan, int massaBadan){
        panjang = panjangBadan;
        massa = massaBadan;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the panjang
     */
    public int getPanjang() {
        return panjang;
    }

    /**
     * @return the massa
     */
    public int getMassa() {
        return massa;
    }

    /**
     * @return the berkembangBiak
     */
    public String getBerkembangBiak() {
        return berkembangBiak;
    }
    
}
