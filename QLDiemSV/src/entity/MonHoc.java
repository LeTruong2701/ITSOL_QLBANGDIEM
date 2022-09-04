package entity;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MonHoc implements Serializable {

    private int maMon;
    private String tenMon;
    private int soDonViHocTrinh;
    private String loaiMon;

    private int slmonhoc;

    public int getSlmonhoc() {
        return slmonhoc;
    }

    public void setSlmonhoc(int slmonhoc) {
        this.slmonhoc = slmonhoc;
    }

    private static final String DAICUONG="Đại cương";
    private static final String COSONGANH="Cơ sở ngành";
    private static final String CHUYENNGANH="Chuyên ngành";


    private static int AUTO_ID=-1;
    public MonHoc(){

        if(AUTO_ID==-1){
            AUTO_ID=100;
            this.maMon=AUTO_ID;
            return;
        }
        this.maMon=++AUTO_ID;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoDonViHocTrinh() {
        return soDonViHocTrinh;
    }

    public void setSoDonViHocTrinh(int soDonViHocTrinh) {
        this.soDonViHocTrinh = soDonViHocTrinh;
    }

    public String getLoaiMon() {
        return loaiMon;
    }

    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }

    public MonHoc(int maMon, String tenMon, int soDonViHocTrinh, String loaiMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soDonViHocTrinh = soDonViHocTrinh;
        this.loaiMon = loaiMon;
    }


    @Override
    public String toString(){
        return "entity.monHoc{" +
                "maMonhoc="+maMon+'\''+
                ", tenMonhoc='"+tenMon+'\''+
                ", soDonViHocTrinh='"+soDonViHocTrinh+'\''+
                ", loaiMon='"+loaiMon+'\''+
                '}';
    }

    public void nhapThongTinMonHoc(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        this.tenMon=sc.nextLine();
        try {
            System.out.print("Nhập số đơn vị học trình : ");
            this.soDonViHocTrinh=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("Xảy ra lỗi khi nhập số đơn vị học trình");
        }

        System.out.println("Loại môn thuộc 1 trong 3 lựa chọn dưới đây");
        System.out.println("1.Đại cương");
        System.out.println("2.Cơ sở ngành");
        System.out.println("3.Chuyên ngành");
        System.out.print("Mời bạn chọn: ");
        int choice=-1;
        do {
            try {
                choice=sc.nextInt();
                if(choice<4&&choice>=1){
                    break;
                }
                System.out.println("Chỉ lựa chọn 1 trong 3lựa chọn trên");
            }catch (Exception ex){
                System.out.println(ex);
                System.out.println("Xảy ra lỗi khi chọn 1 trong loai môn học");
            }

        }while (choice>4||choice<1);
        switch (choice){
            case 1:
                this.loaiMon=DAICUONG;
                break;
            case 2:
                this.loaiMon=COSONGANH;
                break;
            case 3:
                this.loaiMon=CHUYENNGANH;
                break;
        }
    }


}
