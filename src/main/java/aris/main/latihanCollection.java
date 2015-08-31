package aris.main;

import com.aris.evaluasi1.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Hakam
 */
public class latihanCollection {
    public static void main(String[] args) {
        List lst = new ArrayList();
        
        lst.add("coba");
        lst.add(1); //harga
        lst.add(true);
        lst.add(2); //qty
        
        for (int i=0; i<lst.size(); i++) {
            
            System.out.println("Data ke " + i + " = " + lst.get(i));
        }
        
        List<String> lstStr = new ArrayList<String>();
        lstStr.add("str1");
        lstStr.add("str2");
        for (String dtStr : lstStr) {
            System.out.println("Data lstStr " + dtStr);
        }
        
        List<Integer> lstInt = new ArrayList<Integer>();
        lstInt.add(1);
        lstInt.add(3);
        lstInt.add(2);
        lstInt.add(4);
        lstInt.add(6);
        lstInt.add(5);
        lstInt.add(7);
        Collections.sort(lstInt); //untuk mengurutkan list data
        System.out.println("------------------------------------------");
        for (Integer dtInt : lstInt){
            System.out.println("Data Int " + dtInt);
        }
        
        Integer cek = 3;
        System.out.println("Apakah 3 ada di list ? " + lstInt.contains(cek));
        
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setId("Joko");
        users.add(user);
        
        user = new User();
        user.setId("Joni");
        users.add(user);
        
        for (User u : users){
            System.out.println("Nama User = " + u.getId());
        }
        user = new User();
        user.setId("Riki");
        System.out.println("Apakah User " + user.getId() + " ada ? " + users.contains(user));
        
        Map mp = new HashMap();
        mp.put("key1", "value1");
        mp.put("key2", "value2");
        
        System.out.println("Isi Map " + mp.size());
        System.out.println("Ambil nilai dari key1 = " + mp.get("key1"));
        
        for (Iterator it = mp.entrySet().iterator(); it.hasNext();){
            Map.Entry dtMap = (Map.Entry) it.next();
            System.out.println("key = " + dtMap.getKey() + " value = " + dtMap.getValue());
        }
        
        Set<Integer> setInt = new HashSet<Integer>();
        setInt.add(1);
        setInt.add(1);
        setInt.add(2);
        for (Integer dtSetInt : setInt) {
            System.out.println("dtSetInt " + dtSetInt);
        }
        
        Set<User> setUsr = new HashSet<User>();
        User useres = new User();
        useres.setId("Joko");
        setUsr.add(useres);
        
        useres = new User();
        useres.setId("Joni");
        setUsr.add(useres);
        
        useres = new User();
        useres.setId("Joni");
        setUsr.add(useres);
        
        for (User dtSetUsr : setUsr) {
            System.out.println("Nama User = " + dtSetUsr.getId());
        }
        /*for (User us : usr){
            System.out.println("Nama User = " + us.getId());
        }
        useres = new User();
        useres.setId("Riki");
        System.out.println("Apakah User " + useres.getId() + " ada ? " + usr.contains(useres));*/
        
    }
            
}
