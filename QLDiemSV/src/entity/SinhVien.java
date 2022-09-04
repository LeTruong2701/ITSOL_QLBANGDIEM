package entity;

import java.io.Serializable;
import java.util.Scanner;
import java.util.SortedMap;

public class SinhVien extends Nguoi implements Serializable {

    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sdt;

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String getSdt() {
        return sdt;
    }

    @Override
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    private String lop;

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    private static int AUTO_maSV=-1;

    public SinhVien(){

        if (AUTO_maSV==-1){
            AUTO_maSV=100;
            this.maSV=AUTO_maSV;
            return;
        }
        this.maSV=++AUTO_maSV;
    }
    public SinhVien(int maSV,String hoTen,String diaChi,String sdt, String lop) {

        this.maSV = maSV;
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.sdt=sdt;
        this.lop = lop;
    }



    public void nhapThongTinSV(){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Nhập tên sinh viên: ");
            this.hoTen=sc.nextLine();
            System.out.print("Nhập địa chỉ: ");
            this.diaChi=sc.nextLine();
            System.out.println("Nhập SĐT: ");
            this.sdt=sc.nextLine();
            System.out.println("Nhập lớp: ");
            this.lop=sc.nextLine();
        }catch (Exception ex){
            System.out.println(ex);
            System.out.println("Đã xảy ra lỗi trong quá trình nhập");
        }

        }

    @Override
    public String toString(){
        return "entity.SinhVien{" +
                "maSV"+this.maSV+'\''+
                ", hoTen='"+this.hoTen+'\''+
                ", diaChi='"+this.diaChi+'\''+
                ", sdt='"+this.sdt+'\''+
                ",Lop='"+this.lop+'\''+
                '}';
    }
}
