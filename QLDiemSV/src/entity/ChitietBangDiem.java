package entity;

public class ChitietBangDiem {

    private double diem;
    private MonHoc monHoc;

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public MonHoc getMonHoc(){
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc){
        this.monHoc=monHoc;
    }

    @Override
    public String toString() {
        return "ChitietBangdiem{" +
                "ten Mon=" + monHoc.getTenMon() +
                ", Diem=" + diem +
                '}';
    }


}
