package entity;

public class Nguoi {
    protected String hoTen;
//    protected int namSinh;
    protected String diaChi;
    protected String sdt;



    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
//
//    public int getNamSinh() {
//        return namSinh;
//    }
//
//    public void setNamSinh(int namSinh) {
//        this.namSinh = namSinh;
//    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String toString(){
        return "entity.Nguoi{" +

                ", hoTen='"+this.hoTen+'\''+
//                ", namSinh='"+this.namSinh+'\''+
                ", diaChi='"+this.diaChi+'\''+
                ", sdt='"+this.sdt+'\''+
                '}';
    }
}
