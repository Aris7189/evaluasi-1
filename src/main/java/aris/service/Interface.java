package aris.service;

import com.aris.evaluasi1.Barang;
import com.aris.evaluasi1.Penjualan;
import com.aris.evaluasi1.User;
import java.util.List;

/**
 *
 * @author Hakam
 */
public class Interface 
    implements Implement{

    public void save(Barang a) {
        System.out.println("Save Barang");
    }

    public void update(Barang a) {
        System.out.println("Update Barang");
    }

    public void delete(Barang a) {
        System.out.println("Delete Barang");
    }

    public List<Barang> selectBarang() {
        System.out.println("Select Barang");
        return null;
    }

    public void save(User b) {
        System.out.println("Save User");
    }

    public void update(User b) {
        System.out.println("Update User");
    }

    public void delete(User b) {
        System.out.println("Delete User");
    }

    public List<User> selectUser() {
        System.out.println("Select User");
        return null;
    }

    public void save(Penjualan c) {
        System.out.println("Save Penjualan");
    }

    public void update(Penjualan c) {
        System.out.println("Update Penjualan");
    }

    public void delete(Penjualan c) {
        System.out.println("Delete Penjualan");
    }

    public List<Penjualan> selectPenjualan() {
        System.out.println("Select Penjualan");
        return null;
    }
    
}
