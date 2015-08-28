/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aris.service;

import com.aris.evaluasi1.Barang;
import com.aris.evaluasi1.Penjualan;
import com.aris.evaluasi1.User;
import java.util.List;

/**
 *
 * @author Hakam
 */
public interface Implement {
        public void save(Barang a);
        public void update(Barang a);
        public void delete(Barang a);
        public List<Barang> selectBarang();
        
        public void save(User b);
        public void update(User b);
        public void delete(User b);
        public List<User> selectUser();
        
        public void save(Penjualan c);
        public void update(Penjualan c);
        public void delete(Penjualan c);
        public List<Penjualan> selectPenjualan();
}
