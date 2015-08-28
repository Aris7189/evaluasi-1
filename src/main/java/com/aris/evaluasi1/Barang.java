package com.aris.evaluasi1;
import java.math.BigDecimal;

/**
 *
 * @author Hakam
 */
public class Barang {
    String kodeBarang;
    String namaBarang;
    BigDecimal harga;
    

   
       
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

       
}
