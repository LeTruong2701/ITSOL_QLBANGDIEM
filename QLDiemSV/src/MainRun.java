import entity.MonHoc;
import entity.QLBangDiem;
import entity.SinhVien;
import DBEngine.DBEngine;

import java.io.*;
import java.util.Scanner;
import java.util.ServiceLoader;

public class MainRun {

    private static QLBangDiem qlbd;
    private static DBEngine db=new DBEngine();

    private static SinhVien[] SINHVIEN=new SinhVien[100];
    private static MonHoc[] MONHOC=new MonHoc[100];

    private static QLBangDiem[] QLBANGDIEM=new QLBangDiem[100];


    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        while (true){
            int functionChoice=functionChoice();
            switch (functionChoice){
                case 1:
                    NhapMonhoc();
                    break;
                case 2:
                    HienThiMonHoc();
                    break;
                case 3:
                    NhapSinhVien();
                    break;
                case 4:
                    HienThiSinhVien();
                    break;
                case 5:
                    try {
                        qlbd.InputDiem();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

            }
        }
    }

    private static int functionChoice(){
        Scanner sc=new Scanner(System.in);
        System.out.println("========= Chương trình quản lý điểm sinh viên ============ ");
        System.out.println("1.Nhập danh sách môn học mới");
        System.out.println("2.Hiển thị danh sách môn học");
        System.out.println("3.Nhập danh sách sinh vien mới");
        System.out.println("4.Hiển thị danh sách sinh vien");
        System.out.println("5.Nhập bảng điểm");
        System.out.println("6.Sắp xếp danh sách bảng điểm");
        System.out.println("7.Tính điểm tổng kết");
        System.out.println("8.Thoát");
        System.out.println("Mời bạn chọn: ");
        int choice=-1;
        do {
            choice=sc.nextInt();
            if(choice<9&&choice>=1){
                break;
            }
        }while (choice>9||choice<1);
        return choice;

    }



    private static void NhapMonhoc(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số môn học muốn thêm");
        int slmonhoc=sc.nextInt();
        MonHoc[] monHocArr =  new MonHoc[slmonhoc];
        for (int i = 0; i < slmonhoc; i++) {
            System.out.println("Nhập thông tin môn học thứ "+i+" : ");
            MonHoc monHoc=new MonHoc();
            monHoc.nhapThongTinMonHoc();
            monHocArr[i] = monHoc;
        }
            //lưu thông tin môn học
            try {

                db.LuuFileMonHoc("src/Data/MonHoc.txt",monHocArr);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

    }

    private static void HienThiMonHoc(){
        try {
            db.docFile("src/Data/MonHoc.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void NhapSinhVien(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên muốn thêm: ");
        int slsinhvien=sc.nextInt();
        SinhVien[] sinhVienArr =  new SinhVien[slsinhvien];
        for (int i = 0; i < slsinhvien; i++) {
            System.out.println("Nhập thông tin sinh viên thứ "+i+":");
            SinhVien sv=new SinhVien();
            sv.nhapThongTinSV();
            sinhVienArr[i]=sv;

        }
        //Save thông tin sinh viên
        try {
            db.LuuFileSinhVien("src/Data/SinhVien.txt",sinhVienArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void HienThiSinhVien(){
        try {
            db.docFile("src/Data/SinhVien.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }





}
