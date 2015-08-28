package aris.main;

import aris.service.Implement;
import aris.service.Interface;
import com.aris.evaluasi1.Barang;
import com.aris.evaluasi1.Penjualan;
import com.aris.evaluasi1.User;

/**
 *
 * @author Hakam
 */
public class Main {
    public static void main(String[] args) {
        Implement serviceAris = new Interface();
        serviceAris.save(new Barang());
        serviceAris.delete(new Barang());
        serviceAris.update(new Barang());
        serviceAris.selectBarang();
        
        serviceAris.save(new User());
        serviceAris.delete(new User());
        serviceAris.update(new User());
        serviceAris.selectUser();
        
        serviceAris.save(new Penjualan());
        serviceAris.delete(new Penjualan());
        serviceAris.update(new Penjualan());
        serviceAris.selectPenjualan();
        
        
    }
}
