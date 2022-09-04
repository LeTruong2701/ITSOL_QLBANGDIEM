package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import DBEngine.DBEngine;

public class QLBangDiem {

    private static DBEngine db=new DBEngine();
    private SinhVien sinhVien;
    private MonHoc[] monHoc;
    private float[] diem;



    public SinhVien getSinhVien() {
        return sinhVien;
    }


    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }


    public MonHoc[] getMonHoc() {
        return monHoc;
    }


    public void setMonHoc(MonHoc[] monHoc) {
        this.monHoc = monHoc;
    }

    public void InputDiem() throws IOException {
        Scanner sc=new Scanner(System.in);
        FileReader fr = new FileReader("src/Data/SinhVien.txt");
        FileReader fr2 = new FileReader("src/Data/MonHoc.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br2 = new BufferedReader(fr2);
        String line = "", line2 = "", temp ="";
        int i = 0;
        while (true){
            if(line == null){
                break;
            }
            try {
                line = br.readLine();
                String[] lineArr = line.split(",");
                temp = lineArr[1].substring(8);
                System.out.print(lineArr[1].substring(8));
                while (true){
                    if(line == null){
                        break;
                    }
                    try {
                        line2 = br2.readLine();
                        String[] lineArr2 = line.split(",");
                        System.out.println(lineArr2[1].substring(11));
                        diem[i] = sc.nextFloat();
                        temp = temp + " " + diem[i];
                        i++;
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            FileWriter fw = new FileWriter("src/Data/BangDiem.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(temp);
            bw.newLine();
            bw.close();
            fw.close();
        }
    }


    @Override
    public String toString() {
        return "BangDiem{" +
                "sinhVien=" + sinhVien +
                ", chitietBangDiem=" +
                '}';
    }


    public float[] getDiem() {
        return diem;
    }


    public void setDiem(float[] diem) {
        this.diem = diem;
    }


}