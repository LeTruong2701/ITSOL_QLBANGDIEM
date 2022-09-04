package DBEngine;

import entity.MonHoc;
import entity.SinhVien;

import java.io.*;

public class DBEngine {
    public void LuuFileMonHoc ( String fileName , MonHoc[] monHoc )
            throws Exception {
        FileWriter fw = new FileWriter(fileName,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(MonHoc mh : monHoc){
            bw.write(mh.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public void LuuFileSinhVien ( String fileName , SinhVien[] sinhVien )
            throws Exception {
        FileWriter fw = new FileWriter(fileName,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(SinhVien sv : sinhVien){
            bw.write(sv.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public void docFile ( String fileName ) throws Exception {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while (true){
            if(line == null){
                break;
            }
            line = br.readLine();
            System.out.println(line);
        }
    }

//    public Object docFileMonHoc ( String fileName ) throws Exception {
//        Object kq = null;
//        // Tạo luồng đọc file đã được serial
//        FileInputStream fi =new FileInputStream(fileName);
//        // Tạo luồng để Deserialize đối tượng
//        ObjectInputStream ois = new ObjectInputStream(fi);
//        // Tiến hành khôi phục đối tượng
//        kq = ois.readObject();
//        // đóng luồng
//        fi.close();
//        ois.close();
//        return kq;
//    }
}
